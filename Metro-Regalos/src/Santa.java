
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
public class Santa extends Thread {
    
    private static Random r=new Random();
    boolean sEstado;
    Contador dia;
    ArchivoTexto at;
    JLabel Lsanta;
    
    public Santa (JLabel label, Contador con){
    
    this.sEstado=false;
    this.Lsanta=label;
    this.dia = con;
    try {
            at=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    
       
    public void run(){
    while(true){
        try {
            dia.openL();
            
            dia.closeL();
            long rnd=(1+r.nextInt(2));
           long joeputa=24000/22;
            long tiempo = Integer.parseInt(at.getVec()[0]);
            System.out.println(joeputa*rnd*tiempo);
            
            Thread.sleep(joeputa*rnd*tiempo);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Santa.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
    
    
    
    }
    
}
