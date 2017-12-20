#Este es el makefile del servidor

all: servidor.o funciones_servidor.o
	gcc -Wall -g -o bsb_svr servidor.o funciones_servidor.o -lpthread

servidor.o: servidor.c funciones_servidor.h
	gcc -c servidor.c

funciones_servidor.o: funciones_servidor.c funciones_servidor.h
	gcc -c funciones_servidor.c


clean: 
	rm bsb_svr *.o deposito retiro