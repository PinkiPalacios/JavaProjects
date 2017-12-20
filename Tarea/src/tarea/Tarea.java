/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;
/**
 *
 * @author LuisAlejandro
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application ogic here
        
        String a = null;
        
        Scanner cs = new Scanner(System.in);
        
        System.out.println("Ingrese una oracion para ver cual es su palabra mas larga yu su palabra mas corta");
        
        a= cs.nextLine();
        
      int largo=0;
      int pos=0;
      
      int mayor=0;
      int pMayor=0;
      
      int menor=100000;
      int pMenor=0;
      
        for (int i = 0; i <a.length(); i++) {
            while (! Character.isLetter(a.charAt(i))  && (i+1)<a.length()){
            
            i++;
            
            }
            
            pos=i;
            largo=0;
            
               while ( Character.isLetter(a.charAt(i))  && (i+1)<a.length()){
            
           largo++;
           i++;
            
            }
               
               if (largo>mayor){
               mayor=largo;
               pMayor=pos;
               
               
               }
               
               if (largo<menor){
               menor=largo;
               pMenor=pos;
               
               
               }
            
            
        }
      
    
        System.out.println();
        String PalabraMayor ="";
        String PalabraMenor= "";
        for (int i = 0; i < mayor; i++) {
            PalabraMayor=PalabraMayor.concat(String.valueOf(a.charAt(i+pMayor)));
        }
        
         for (int i = 0; i < menor; i++) {
            PalabraMenor=PalabraMenor.concat(String.valueOf(a.charAt(i+pMenor)));
        }
        
        System.out.println("La palabra mas larga es:"+PalabraMayor);
        
        System.out.println("La palabra mas corta es:"+PalabraMenor);
        
}}
