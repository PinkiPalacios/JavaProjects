
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Guillermo H
 */
public class ProdTrenza extends Thread{
    
    Semaphore ProducTrenza;    //Semaforo Productor
    Semaphore ConsumTrenza;    //Semaforo Consumidor
    Buffer buf = new Buffer();
    private JProgressBar Barra;
    JTextArea Productor;
    
    ProdTrenza(Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc){
        super(nom);
        this.buf = buf;
        ProducTrenza = prod;
        ConsumTrenza = con;
        this.Barra = Barra;
        Productor = Produc;
    }
    
    @Override
    public void run (){
        while(buf.estaVacioTrenza() == true){
            try{
                ProducTrenza.acquire();
                buf.CrearTrenza("Trenza");
                this.sleep(5000);
                Productor.append("Se produjo una Trenza por: "+this.getName()+"\n");
                Barra.setValue(1 + ConsumTrenza.availablePermits());
                Barra.setString(" #Trenzas= "+(1 + ConsumTrenza.availablePermits()));
                ConsumTrenza.release();
                
            }catch(InterruptedException ex){
                Logger.getLogger(ProdSuela.class.getName()).log(Level.SEVERE, null, ex);  
            }
        }
    }
    
    
}
