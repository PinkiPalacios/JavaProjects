/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Random;

/**
 *
 * @author LuisAlejandro
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r=new Random();
       
        while(true){
        int x= Integer.parseInt(r()[0])*360000*8*(1+r.nextInt(2));
            System.out.println(x);
        }
    }
    
}
