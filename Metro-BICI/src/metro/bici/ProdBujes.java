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
public class ProdBujes extends Thread {
    
    Semaphore ProducBujes; //Semaforo productor
    Semaphore ConsumBujes; //Semaforo Consumidor
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
    

    public ProdBujes(Semaphore exclusividad,Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc) {
        super(nom);
        this.buf = buf;
        this.ex=exclusividad;
        ProducBujes = prod;
        ConsumBujes = con;
        this.Barra = Barra;
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
               
                ProducBujes.acquire();
                ex.acquire();
                buf.CrearBujes("Bujes");
                
                Productor.append("Se ha creado un bujes \n");
                Barra.setValue(1 + ConsumBujes.availablePermits());
                Barra.setString(" Numero de Bujes = "+(1+ConsumBujes.availablePermits()));
                ex.release();
                ConsumBujes.release();
                
                 ProdBujes.sleep(Integer.parseInt(txt.getVec()[0])*1000);
            } catch (InterruptedException ex) {
                
                Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
                
            
          }
            
        }
    
        
        
        
        
    }
    
}
