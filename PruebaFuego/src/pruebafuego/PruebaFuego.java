/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafuego;

/**
 *
 * @author LuisAlejandro
 */

import java.util.Scanner;


public class PruebaFuego {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[][]={{1,2,3},{4,5,6},{7,8,9},{0,0,0}};
       
        
    
       
       
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j]);
            }
            System.out.print("\n");
        }
        int array[][]=a;
        int row=0;
        int rows = array.length;
    int[][] arrayToReturn = new int[rows-1][];
        System.arraycopy(array, 0, arrayToReturn, 0, row);
    for(int i = row; i < arrayToReturn.length; i++)
        arrayToReturn[i++] = array[i];
    
    a=arrayToReturn;    
        
        System.out.println("\n\n");
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j]);
            }
            System.out.print("\n");
        }
    }
    
    
    
    
}
