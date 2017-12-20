
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisAlejandro
 */
public class Cronometrador extends Thread{
      Random r=new Random();
    boolean cEstado;
    Contador dia;
    JLabel cron;
    ArchivoTexto at;
    
    public Cronometrador (JLabel label, Contador con){
   
    this.cEstado=false;
    this.cron=label;
    this.dia=con;
    
    try {
            at=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
      public void run() {
    while(true){
        try {
            dia.openE();
           
            dia.closeE();
            long rnd=(1+r.nextInt(2));
            long joeputa=1000/3;
            long tiempo = Integer.parseInt(at.getVec()[0]);
            System.out.println(joeputa*rnd*tiempo);
            Thread.sleep(joeputa*rnd*tiempo);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
    
    
    
    }
    
}
