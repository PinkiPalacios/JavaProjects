/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author LuisAlejandro
 */
public class ProdMarcos extends Thread {
    
    Semaphore ProducMarcos; //Semaforo productor
    Semaphore ConsumMarcos; //Semaforo Consumidor
    Buffer buf = new Buffer ();
    private JProgressBar Barra;
    JTextArea Productor;
    private int tiempo;
    ArchivoTexto txt;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    private boolean run=true;
    
    public ProdMarcos(Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc) {
        super(nom);
        this.buf = buf;
        ProducMarcos = prod;
        ConsumMarcos = con;
        this.Barra = Barra;
        Productor = Produc;
        try {
            txt=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void calctiempo (int dia){
    
    this.tiempo=3000*dia;
        System.out.println(this.tiempo);
    }
    
    
    @Override
    public void run (){
    
        
        
        while(true){
        
            if (run){
            
            try {
                this.sleep(Integer.parseInt(txt.getVec()[0])*3000);
                ProducMarcos.acquire();
                buf.CrearRuedas("Marcos");
                System.out.println(Integer.parseInt(txt.getVec()[0]));
                
                
                Productor.append("Se ha creado un Marco \n");
                Barra.setValue(1 + ConsumMarcos.availablePermits());
                Barra.setString("Numero de Marcos = "+(1+ConsumMarcos.availablePermits()));
                ConsumMarcos.release();
                
            } catch (InterruptedException ex) {
                
                Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                
            }
                
            
          }
        }
        }
    
    
    
    
    
    
    
    
}
