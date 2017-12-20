
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
public class ProdSuela extends Thread{
    
    Semaphore ProducSuela;    //Semaforo Suela Productor
    Semaphore ConsumSuela;     //Semaforo Suela Consumidor
    Buffer buf;
    String nom;
    private JProgressBar Barra;
    JTextArea Productor;
    
    
    ProdSuela(Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Prod){
       super(nom);
       this.buf = buf;      
       ProducSuela = prod;
       ConsumSuela = con;
       this.Barra = Barra;
       Productor = Prod;
    }
    
    public void run (){
        while(buf.estaVacioSuela() == true){
            try{
                ProducSuela.acquire();
                this.sleep(5000);
                Productor.append("Se produjo una Suela por: "+this.getName()+"\n");
                buf.CrearSuela("Suela");  
                Barra.setValue(1+ConsumSuela.availablePermits());
                Barra.setString(" #Suelas= "+(1+ConsumSuela.availablePermits()));
                ConsumSuela.release(); 
                
            }catch(InterruptedException ex){
                Logger.getLogger(ProdSuela.class.getName()).log(Level.SEVERE, null, ex);  
            }
        }
    }
}
