//./bsb_svr -l 20166 -i deposito -o retiro
#include "funciones_servidor.h"

int main (int argc, char* argv[]){

	/*Variables*/
	int puerto,orden[3];
	int socket_server;
	int tam,lei,i,j=0,fd,s;
	char operacion;
	pthread_t hilos[3];
	struct sockaddr_in dir;
	char buff[TAM_MAX];
	unsigned int cajeros[NUM_CAJEROS];
	parametros_t parametros[NUM_CAJEROS];

	/*Inicializar las variables*/
	memset(buff,0,TAM_MAX);
	for(i=0;i<NUM_CAJEROS;i++) {
		cajeros[i]=0;
		dinero_disponible[i]=MONTO_TOTAL;
	}
	for(i=0;i<USUARIOS;i++){
		dinero_usuarios[i]=MONTO_USUARIOS;
		intentos[i]=0;
	}
	pthread_mutex_init(&M_deposito,NULL);
	pthread_mutex_init(&M_retiro,NULL);
	for(i=0;i<USUARIOS;i++) pthread_mutex_init(&M_usuarios[i],NULL);

	/*Verificar que sea la cantidad correcta de agumentos*/
	if(argc!=7){
		perror("Use: -l <puerto_bsb_svr> -i <bitácora_depósito> - o <bitácora_retiro>");
		exit(0);
	}

	/*Ordenar los argumentos*/
	for(i=1;i<=5;i++){
		if(!strcmp(argv[i],"-l")) orden[0]=i+1;
		else if(!strcmp(argv[i],"-i")) orden[1]=i+1;
		else if(!strcmp(argv[i],"-o")) orden[2]=i+1;
		else {
			printf("%s no es un argumento valido\n",argv[i]);
			exit(0);
		}

		i++;
	}

	/*Asignar los argumentos*/
	puerto=atoi(argv[orden[0]]);
	deposito=(char*)calloc(strlen(argv[orden[1]]),sizeof(char));
	retiro=(char*)calloc(strlen(argv[orden[2]]),sizeof(char));
	strcpy(deposito,argv[orden[1]]);
	strcpy(retiro,argv[orden[2]]);

	/*Crear los archivos de deposito y retiro*/
	for(i=1;i<=2;i++){
		unlink(argv[orden[i]]);
		if((fd=open(argv[orden[i]],O_CREAT|O_WRONLY,S_IRWXU))<0){
	 	printf("%s\n", strerror(errno));
	 	}
	 	memset(buff,0,TAM_MAX);
	 	strcpy(buff,"Fecha\t\tHora\tUsr\tOperacion\tMonto total\tCajero\n");
	 	write(fd,buff,strlen(buff));
	 	memset(buff,0,TAM_MAX);
	 	close(fd);
	}

	/*Crear el Socket*/
	if((socket_server=socket(PF_INET, SOCK_STREAM,0))<0){
		printf("1 %s\n", strerror(errno));
	}

	/*Asignar la direcciones que vamos a escuchar*/
	dir.sin_family=PF_INET;
	dir.sin_port=htons(puerto);
	dir.sin_addr.s_addr=htonl(INADDR_ANY);

	/*Asignar el puerto bien conocido al socket*/
	if(bind(socket_server,(struct sockaddr *) &dir, 
					sizeof(struct sockaddr_in))!=0){
		printf("2 %s\n", strerror(errno));
		exit(0);
	}

	/*Esperar un connect*/
	if((listen(socket_server,NUM_CAJEROS))<0){
		printf("3 %s\n", strerror(errno));
		exit(0);
	}

	/*Aceptar solicitudes*/
	tam=sizeof(struct sockaddr_in);
	do{
		if((s=accept(socket_server,
				(struct sockaddr *) &dir,&tam))<0){
			printf("4 %s\n", strerror(errno));
		}
		j=identificarCajero(dir.sin_addr.s_addr,cajeros);
		memset(buff,0,TAM_MAX);
		parametros[j].cajero=j;
		parametros[j].socket=s;
		if(dinero_disponible[j]<=5000){
			sprintf(buff,"%dBsf. Disponibles en el cajero\n",dinero_disponible[j]);
			if(write(s,buff,strlen(buff))<0){
				printf("5 %s\n", strerror(errno));
			}
		}
		else if(write(s,"a",2)<0){
				printf("5 %s\n", strerror(errno));
		}


		/*Leer la solucitud*/
		if((lei=read(parametros[j].socket,buff,TAM_MAX))<0){
			printf("6 %s\n", strerror(errno));
		}
		leerSolicitud(buff,&parametros[j]);

		/*Atender cada solicitud*/
		pthread_create(&hilos[j],NULL,atenderSolicitud,(void*)&parametros[j]);
		pthread_join(hilos[j], NULL);
		memset(buff,0,TAM_MAX);
	} while(1);
	free(retiro);
	free(deposito);
	return 0;
}


