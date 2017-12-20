
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <string.h>
#include <unistd.h>
#include <netdb.h>       
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <errno.h>
#include <pthread.h>
#include <time.h>
#include <locale.h>
#include <langinfo.h>

#define TAM_MAX 1024
#define TAM_LINEA 40
#define MONTO_TOTAL 80000
#define MONTO_USUARIOS 8999
#define NUM_CAJEROS 3
#define COMANDOS 5
#define BASICO_1 1
#define BASICO_2 2
#define EME 3
#define USUARIOS 20
#define MAX_RETIRO 3000


char *deposito;
char *retiro;
int dinero_disponible[NUM_CAJEROS];
int dinero_usuarios[USUARIOS];
int intentos[USUARIOS];
pthread_mutex_t M_deposito;
pthread_mutex_t M_retiro;
pthread_mutex_t M_usuarios[USUARIOS];

typedef struct parametros{
	char operacion;
	int usuario;
	int monto;
	int socket;
	int cajero;
}parametros_t;




void leerSolicitud (char buff[TAM_MAX],parametros_t *parametros);
/*Recibe el buffer de entrada y una estructura con todos los parametros, separa
separa los comandos en el boffer y los asigna a las variables de la estructura
parametros*/

void obtenHora(char *formato, char **destino);
/*Recibe un formato en el que se mostrará la hora y una variable que contrendrá
dicha hora, función optine la hora y la pone en dicha variable*/

void *atenderSolicitud(void *arg);
/*Recibe una estructura con todos los argumentos necesarios para atender la
solicitud de un cajero y lo atiende*/

short identificarCajero(unsigned int dir,unsigned int cajeros[NUM_CAJEROS]);
/*Recibe una dirrecion y un arreglo que contiene las direcciones de los cajeros
conocidos, si no conoce la dirrecion se la asigna a un elemento del arreglo que
no esté asignado, retorna la posicion en el arreglo de cajeros donde se guardó 
dicha direccion*/
