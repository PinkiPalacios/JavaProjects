#include "funciones_servidor.h"

void leerSolicitud(char buff[TAM_MAX],parametros_t *parametros){
	int i,c=-1,p;
	char palabra[COMANDOS];
	for(i=0;i<3;i++){
		p=0;
		c++;
		while(buff[c]!=','){
			palabra[p++]=buff[c];
			c++;
		}
		palabra[p]='\0';
		switch(i){
			case 0: parametros->operacion=palabra[0];
			case 1: parametros->usuario=atoi(palabra);
			case 2: parametros->monto=atoi(palabra);
			default: break;
		}
	}
}

void obtenHora(char *formato, char **destino){
	 *destino = NULL;
	 time_t rawtime;
	 struct tm *timeinfo;
	 char buffer[80];
	 time(&rawtime);
	 timeinfo = localtime(&rawtime);
	 strftime(buffer, sizeof(buffer), formato, timeinfo);
	 *destino = (char *)malloc((strlen(buffer)) * sizeof(char));
	 strcpy(*destino, buffer);
}

void *atenderSolicitud(void* arg){
	int i,j,fd;
	char buff[TAM_LINEA],cadena[10];
	char *hora = NULL;
	memset(buff,0,TAM_LINEA);
	parametros_t *parametros=(parametros_t*)arg;
	sprintf(cadena, "%d",parametros->usuario);
	obtenHora("%d-%m-%Y\t%H:%M\t", &hora);
  	strcat(buff,hora);
  	strcat(buff,cadena);

  	/*----------RETIROS----------*/
	if(parametros->operacion=='r'){
  		strcat(buff,"\tRetiro\t\t");
  		if((++intentos[parametros->usuario])>3){
  			strcpy(buff,"Usted ha superado el numero de intentos");
	  		if((write(fd,buff,strlen(buff)+1))<0){
	  			printf("%s\n", strerror(errno));
	  		}
	  		free(hora);
	  		return NULL;
  		}
  		else if(((dinero_disponible[parametros->cajero])-(parametros->monto))<0){
  			memset(buff,0,TAM_LINEA);
  			strcpy(buff,"\nDinero no disponible");
  			if((write(fd,buff,strlen(buff)))<0){
  				printf("%s\n", strerror(errno));
  			}
  			memset(buff,0,TAM_LINEA);
  			return NULL;
  		}
  		else{
	  		dinero_disponible[parametros->cajero]-=parametros->monto;
	  		sprintf(cadena, "%d\t\t%d\n",dinero_disponible[parametros->cajero],parametros->cajero);
	  		strcat(buff,cadena);
	  		/*Zona critica del archivo de retiro*/
	  		pthread_mutex_lock(&M_retiro);
	  		/*Zona critica de las cuentas de los usuarios*/
	  		pthread_mutex_lock(&M_usuarios[parametros->usuario]);

	  		/*Preguntar si el usuario tiene dinero suficiente*/
	  		if((dinero_usuarios[parametros->usuario]-parametros->monto)<0){
	  			memset(buff,'\0',TAM_LINEA);
	  			strcpy(buff,"No posee saldo suficiente");
	  			--intentos[parametros->usuario];
	  			if((write(fd,buff,strlen(buff)+1))<0){
	  				printf("%s\n", strerror(errno));
	  			}
	  			memset(buff,0,TAM_LINEA);
	  		}
	  		else{
		  		if((fd=open(retiro,O_APPEND|O_WRONLY))<0){
		  			printf("%s\n", strerror(errno));
		  		}

		  		if((write(fd,buff,strlen(buff)))<0){
		  			printf("%s\n", strerror(errno));
		  		}

		  		dinero_usuarios[parametros->usuario]-=parametros->monto;
		  	}
		  	close(fd);
		  	pthread_mutex_unlock(&M_usuarios[parametros->usuario]);
		  	pthread_mutex_unlock(&M_retiro);	  		
	  	}
	}

	/*----------DEPOSITOS----------*/
	if(parametros->operacion=='d'){
  		strcat(buff,"\tDeposito\t");
  		dinero_disponible[parametros->cajero]+=parametros->monto;
  		sprintf(cadena, "%d\t\t%d\n",dinero_disponible[parametros->cajero],parametros->cajero);
  		strcat(buff,cadena);
  		/*Zona critica del archivo de deposito*/
  		pthread_mutex_lock(&M_deposito);
  		/*Zona critica de las cuentas de los usuarios*/
  		pthread_mutex_lock(&M_usuarios[parametros->usuario]);
  		if((fd=open(deposito,O_APPEND|O_WRONLY,S_IRWXU))<0){
  			printf("%s\n", strerror(errno));
  		}
  		if((write(fd,buff,strlen(buff)))<0){
  			printf("%s\n", strerror(errno));
  		}
  		dinero_usuarios[parametros->usuario]+=parametros->monto;
  		pthread_mutex_unlock(&M_usuarios[parametros->usuario]);
  		pthread_mutex_unlock(&M_deposito);
  		/*Saliendo de las zonas criticas*/
	}
	memset(buff,0,TAM_LINEA);
	strcat(buff,hora);
	if(parametros->operacion=='d') strcat(buff,"Deposito\t");
	else strcat(buff,"Retiro\t");
	sprintf(cadena,"%d",parametros->usuario);
  	strcat(buff,cadena);
  	write(parametros->socket,buff,TAM_LINEA);
  	free(hora);
}


short identificarCajero(unsigned int dir,unsigned int cajeros[NUM_CAJEROS]){
	short i;
	for (i=0;i<NUM_CAJEROS;i++){
		if(dir==cajeros[i]) return i;
		if(cajeros[i]==0){
			cajeros[i]=dir;
			return i;
		}
	}
}