/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.Random;
/**
 *
 * @author LuisAlejandro
 */
public class Presidente {
    
    private boolean despierto;
    private int diasDurmiendo;

    public Presidente(boolean despierto1) {
        this.despierto = despierto1;
        this.diasDurmiendo =dormir();
    }
    
    
    public int dormir (){
    int n;
    Random rnd;
    rnd= new Random();
    
    
      n=rnd.nextInt(8)+8;
    
    return n;
    }
 
    
    
}
