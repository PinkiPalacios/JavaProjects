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
public class ProdRuedas extends Thread{
    
    
     Semaphore ProducRuedas; //Semaforo productor
    Semaphore ConsumRuedas; //Semaforo Consumidor
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
    

    public ProdRuedas(Semaphore exclusividad,Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc) {
        super(nom);
        this.buf = buf;
        ProducRuedas = prod;
        this.ex=exclusividad;
        ConsumRuedas = con;
        this.Barra = Barra;
        Productor = Produc;
        try {
            txt=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calctiempo (int dia){
    
    this.tiempo=1000*dia;
    }
    
    public void run (){
    
        
        while(run){
          if (run){
            
            
            try {
                
                ProducRuedas.acquire();
                ex.acquire();
                buf.CrearRuedas("Ruedas");
                
                Productor.append("Se ha creado una rueda \n");
                Barra.setValue(1 + ConsumRuedas.availablePermits());
                Barra.setString(" Numero de Ruedas = "+(1+ConsumRuedas.availablePermits()));
                ex.release();
                ConsumRuedas.release();
                
                ProdRuedas.sleep(Integer.parseInt(txt.getVec()[0])*500);
            } catch (InterruptedException ex) {
                
                Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
               //NRBM 
            
          }
            
        }
    
        
        
        
        
    }
    
}
