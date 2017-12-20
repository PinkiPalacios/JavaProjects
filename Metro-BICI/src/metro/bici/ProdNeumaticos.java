/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.bici;
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
public class ProdNeumaticos extends Thread {
    
    Semaphore ProducNeumaticos; //Semaforo productor
    Semaphore ConsumNeumaticos; //Semaforo Consumidor
    Semaphore ex;
    Buffer buf = new Buffer ();
    private JProgressBar Barra;
    JTextArea Productor;
    int tiempo;
    private boolean run=true;
    
    
    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    ArchivoTexto txt;
    

    public ProdNeumaticos(Semaphore exclusividad,Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc) {
        super(nom);
        this.buf = buf;
        ProducNeumaticos = prod;
        ConsumNeumaticos = con;
        this.Barra = Barra;
        this.ex=exclusividad;
        Productor = Produc;
        try {
            txt=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calctiempo (int dia){
    
    this.tiempo=1000*dia;
    }
    
    public void run (){
    
        
        while(run){
          if (run){
            
            
            try {
               
                
                ProducNeumaticos.acquire();
                ex.acquire();
                buf.CrearBujes("Neumaticos");
                
                Productor.append("Se ha creado un neumatico \n");
                Barra.setValue(1 + ConsumNeumaticos.availablePermits());
                Barra.setString(" Numero de Neumaticos = "+(1+ConsumNeumaticos.availablePermits()));
                ex.release();
                ConsumNeumaticos.release();
                 ProdNeumaticos.sleep(Integer.parseInt(txt.getVec()[0])*1000);
                
            } catch (InterruptedException ex) {
                
                Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
                
            
          }
            
        }
    
        
        
        
        
    }
    
}
