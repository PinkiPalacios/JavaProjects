all: cliente.o
	gcc -Wall -g -o bsb_cli cliente.o

cliente.o: cliente.c
	gcc -c cliente.c

clean: 
	rm bsb_cli *.o