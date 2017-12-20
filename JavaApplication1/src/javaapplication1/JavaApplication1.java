/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner; 
public class JavaApplication1 {

    public class busqueda { 

private int [][] matriz; 
private Scanner sc1; 

public busqueda() 
{ 
matriz = new int[3][2]; 
sc1 = new Scanner(System.in); 
} 

public void inicializar() 
{ 
for (int i = 0; i < matriz.length; ++i) { 
for (int j = 0; j < matriz[0].length; ++j) { 
System.out.println("Digite numero de la posicion "); 
matriz[i][j] = sc1.nextInt(); 
} 
} 

} 

public void imprimir() 
{ 
for (int i = 0; i < matriz.length; ++i) { 
for (int j = 0; j < matriz[0].length; ++j) { 
System.out.print(matriz[i][j]); 
} 
System.out.println(""); 
} 

} 

public void busqueda(int num) 
{	
int aux = 0; 
for (int i = 0; i < matriz.length; i++) { 
for (int j = 0; j < matriz[0].length; j++) { 
if(matriz[i][j] == num){ 
aux = matriz[i][j]; 
} 
} 

} 
if(aux == num){ 
System.out.println("El numero " + num + " se encuentra en la lista"); 
}else{ 
System.out.println("El numero " + num + " no se encuentra en la lista"); 
} 
} 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    






busqueda k = new busqueda(); 
k.inicializar(); 
k.imprimir(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Por digite el numero a buscar "); 
int aux = sc.nextInt(); 
k.busqueda(aux); 
} 



