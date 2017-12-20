
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
public class Prodplantilla extends Thread{
    
    Semaphore ProducPlantilla; //Semaforo Plantilla Productor
    Semaphore ConsumPlantilla; //Semaforo Plantilla Consumidor
    Buffer buf = new Buffer();
    
    private JProgressBar Barra;
    JTextArea Productor;
    
    Prodplantilla(Buffer buf, String nom, Semaphore prod, Semaphore con, JProgressBar Barra, JTextArea Produc){
        super(nom);
        this.buf = buf;
        ProducPlantilla = prod;
        ConsumPlantilla = con;
        this.Barra = Barra;
        Productor = Produc;
    }
    public void run (){
        while(buf.estaVacioPlantilla() == true){
            try{
                ProducPlantilla.acquire();
                this.sleep(10000);
                Productor.append("Se produjo una Plantilla por: "+this.getName()+"\n");
                buf.CrearPlantilla("Plantilla");
                Barra.setValue(1 + ConsumPlantilla.availablePermits());
                Barra.setString(" #Plantillas= "+(1 + ConsumPlantilla.availablePermits()));
                ConsumPlantilla.release();
                
            }catch(InterruptedException ex){
                Logger.getLogger(ProdSuela.class.getName()).log(Level.SEVERE, null, ex);  
            }
        }
    }
    
}
