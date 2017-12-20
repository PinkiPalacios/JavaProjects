//./bsb_cli -d localhost -p 20166 -c r -i 1
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <string.h>
#include <unistd.h>
#include <netdb.h>
#include <errno.h>

#define TAM_MAX 1024
#define TAM_LINEA 40

int main (int argc, char* argv[]){
	int socket_cliente,i,lei;
	int usuario;
	int orden[4];
	int monto=0;
	int id=0;
	struct sockaddr_in dir;
	struct hostent *phe;
	char buff[TAM_MAX];
	memset(buff,0,TAM_MAX);

	/*Comprobar cantidad correcta de argumentos*/
	if(argc!=9){
		perror("Use: -d <nombre_módulo_atención> -p <puerto_bsb_svr> -c <op> -i <codigo_usuario>");
		exit(0);
	}

	/*Ordenar los argumentos*/
	for(i=1;i<=7;i++){
		if(!strcmp(argv[i],"-d")) orden[0]=i+1;
		else if(!strcmp(argv[i],"-p")) orden[1]=i+1;
		else if(!strcmp(argv[i],"-c")) orden[2]=i+1;
		else if(!strcmp(argv[i],"-i")) orden[3]=i+1;
		else {
			printf("%s no es un argumento valido\n",argv[i]);
			exit(0);
		}
		i++;
	}

	/*Comprobar que sean solo las opciones d y r*/
	if(strcmp(argv[orden[2]],"r")&&strcmp(argv[orden[2]],"d")){
		printf("Use las opciones de retiro (r) o deposito (d) despues de -c\n");
		exit(0);
	}

	/*Comprobar usuario valido*/
	usuario=atoi(argv[orden[3]]);
	if((usuario<0)||(usuario>19)){
		printf("%s no es un argumento valido, ",argv[orden[3]]);
		printf("intruduzca un usuario entre 0 y 19\n");
		exit(0);
	}

	/*Crear el socket*/
	if((socket_cliente=socket(PF_INET,SOCK_STREAM,0))<0){
		perror("Error al crear socket cliente");
	}
	dir.sin_family=PF_INET;

	/*Preperar la conexion del socket*/
	dir.sin_port=htons(atoi(argv[orden[1]]));
	if((phe=gethostbyname(argv[orden[0]]))){
		memcpy(&dir.sin_addr,phe->h_addr,phe->h_length);
	}
	else perror("Error Direccion");

	/*Conectar*/
	for(i=0;i<3;i++){
		if(connect(socket_cliente,(struct sockaddr *)&dir, 
			sizeof(struct sockaddr_in))<0){
			perror("Error al conectar");
			if(i==2){
				printf("El tiempo de respuesta se agoto\n");
				exit(0);
			}
			sleep(3);
		}
		else break;
	}


	/*Leer si el cajero tiene saldo suficiente*/
	if((lei=read(socket_cliente,buff,TAM_MAX))<0){
		printf("%s\n", strerror(errno));
	}

	/*Menu*/
	printf("\n                    BIENVENIDO                    \n");
	if(strcmp(buff,"a"))printf("%s\n",buff);
		if(!strcmp(argv[orden[2]],"r")){
		do{
			printf("Introduzca el monto que desea retirar: ");
			scanf("%d",&monto);
			fflush( stdin );
			if((monto<=0)||(monto>3000))printf("Introduzca un monto valido (Mayor a 0 y menor o igual a 3000)\n");
		}while((monto<=0)||(monto>3000));
	}
	else{
		do{
			printf("Introduzca el id del usuario al que desea depositar: ");
			fflush( stdin );
			scanf("%d",&id);
			printf("Introduzca el monto que desea depositar: ");
			fflush( stdin );
			scanf("%d",&monto);
			if(monto<=0||id<0||id>19)printf("Introduzca un id (Entre 0 y 19) o monto valido (Mayor que 0)\n");
		}while(monto<=0||id<0||id>19);
	}

	/*Llenar el buffer con los argumentos de la operacion separados por ','*/
	memset(buff,0,TAM_MAX);
	strcat(buff,argv[orden[2]]);
	strcat(buff,",");
	if(!strcmp(argv[orden[2]],"r")){
		strcat(buff,argv[orden[3]]);
		strcat(buff,",");
	}
	else{
		sprintf(buff,"%s%d,",buff,id);
	}
	sprintf(buff,"%s%d,\n",buff,monto);

	/*Escribir en el socket*/
	if(write(socket_cliente,buff,strlen(buff))<0){
		perror("Escribir");
	}
	memset(buff,0,TAM_MAX);

	/*Recibir respuesta*/
	if(read(socket_cliente,buff,TAM_LINEA)<0) printf("3 %s\n", strerror(errno));

	/*Mostrar el recibo*/
	printf("%s\n",buff);
	if((close(socket_cliente))<0){
		perror("Error al cerrar el socket cliente");
	}
	return 0;
}