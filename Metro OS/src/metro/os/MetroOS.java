/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.os;

import java.util.Scanner;

/**
 *
 * @author LuisAlejandro
 */
public class MetroOS {
   
    Prediccion p;
     int c[][];
     int a[][];    
     int ca[][];
     int rVec[];
     int aVec[]; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MetroOS();
    
       MetroOS.iniciar();
       
        
        
        
    }
    
    
    public static void iniciar (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique cuantos procesos iniciales desea:");
        int pI=sc.nextInt();
        System.out.println("\nIndique cuantos recursos iniciales desea:");
        int rI=sc.nextInt();
        
       int c[][]= new int[pI][rI];
       int a[][]= new int[pI][rI];
       int rVec[]= new int [rI];
       int pVec[]= new int [pI];
       
       Prediccion p= new Prediccion (c,a,rVec,pVec,pI,rI);
    }
}
