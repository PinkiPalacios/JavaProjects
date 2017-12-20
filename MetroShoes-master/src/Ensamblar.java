
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
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
public class Ensamblar extends Thread{
    Buffer bufT;
    Buffer bufS;
    Buffer bufP;
    Semaphore ProducTrenza;    //Semaforo Productor
    Semaphore ConsumTrenza;    //Semaforo Consumidor
    Semaphore ProducSuela;    //Semaforo Suela Productor
    Semaphore ConsumSuela;     //Semaforo Suela Consumidor
    Semaphore ProducPlantilla; //Semaforo Plantilla Productor
    Semaphore ConsumPlantilla;
    JProgressBar BarraT;
    JProgressBar BarraS;
    JProgressBar BarraP;
    int tipo1;
    int tipo2;
    JTextArea Ensamblador1;
    JTextArea Productor;
    JPanel t1;
    JPanel t2;
    
    Ensamblar(Buffer bufT, Buffer bufS, Buffer bufP, Semaphore pt, Semaphore ct, Semaphore ps, Semaphore cs, Semaphore pp, Semaphore cp, JProgressBar BarraT, JProgressBar BarraS, JProgressBar BarraP,  String nom, JTextArea Ensam, JTextArea Produc, JPanel t1, JPanel t2){
        super(nom);
        this.bufT = bufT;
        this.bufS = bufS;
        this.bufP = bufP;        
        ProducTrenza = pt; 
        ConsumTrenza = ct;  
        ProducSuela = ps;   
        ConsumSuela = cs;   
        ProducPlantilla = pp; 
        ConsumPlantilla = cp;  
        this.BarraT = BarraT;
        this.BarraS = BarraS;
        this.BarraP = BarraP;
        Ensamblador1 = Ensam;
        Productor = Produc;
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public void run(){
        while(bufT.estaLlenoTrenzaT2() && bufS.estaLlenoSuela() && bufP.estaLlenoPlantilla()) {
            try{
                
                if(bufT.getTipo2() > 0){
                    
                    Ensamblador1.append("****** Inicio de Ensamblaje Tipo 2 ******\n");
                    System.out.println("----------->"+ConsumSuela.availablePermits());
                    ConsumTrenza.acquire(3);
                    ConsumSuela.acquire();
                    ConsumPlantilla.acquire();
//--------------------------------------------------------------------------------------------------------
                    t2.setVisible(true);
                    bufT.ConsumirTrenza();
                    bufT.ConsumirTrenza();
                    bufT.ConsumirTrenza();
                    bufS.ConsumirSuela();
                    bufP.ConsumirPlantilla();
                    
                    BarraT.setValue(ConsumTrenza.availablePermits());
                    BarraT.setString(" #Trenzas= "+(ConsumTrenza.availablePermits()));
                    BarraS.setValue(ConsumSuela.availablePermits());
                    BarraS.setString(" #Suelas= "+(ConsumSuela.availablePermits()));
                    BarraP.setValue(ConsumPlantilla.availablePermits());
                    BarraP.setString(" #Plantillas= "+(ConsumPlantilla.availablePermits()));

                    this.sleep(6000);
                    Ensamblador1.append(this.getName()+" ha unido 3 trenzas con una suela\n");
                    this.sleep(5000);                
                    Ensamblador1.append(this.getName()+" ha armado el zapato\n");
                    this.sleep(6000);
                    Ensamblador1.append(this.getName()+" ha pintado el zapato\n");

                    Ensamblador1.append("****** Zapato tipo 2 Listo por: "+ this.getName()+" #Zapato: "+bufT.getTipo2()+" ******\n");

                    ProducTrenza.release(3);
                    ProducSuela.release();
                    ProducPlantilla.release();
                    bufT.setTipo2(bufT.getTipo2()-1);
                    t2.setVisible(false);
                }else{
                    Productor.append("****** Produccion Tipo 2 Completa ******\n");
                }
                
                if(bufT.getTipo1() > 0){ //Inicio de ensamble para zapatos tipo 1, en caso de no tener que ensamblar no se inicia
                    Ensamblador1.append("****** Inicio de Ensamblaje Tipo 1 ******\n");
                    
                    ConsumTrenza.acquire(2);
                    ConsumSuela.acquire();
                    ConsumPlantilla.acquire();

                    t1.setVisible(true);
                    bufT.ConsumirTrenza();
                    bufT.ConsumirTrenza();
                    bufS.ConsumirSuela();
                    bufP.ConsumirPlantilla();
                    
                    BarraT.setValue(ConsumTrenza.availablePermits());
                    BarraT.setString(" #Trenzas= "+(ConsumTrenza.availablePermits()));
                    BarraS.setValue(ConsumSuela.availablePermits());
                    BarraS.setString(" #Suelas= "+(ConsumSuela.availablePermits()));
                    BarraP.setValue(ConsumPlantilla.availablePermits());
                    BarraP.setString(" #Plantillas= "+(ConsumPlantilla.availablePermits()));
                    
                    this.sleep(4000);
                    Ensamblador1.append(this.getName()+" ha unido 2 trenzas con una suela\n");
                    this.sleep(3000);
                    Ensamblador1.append(this.getName()+" ha armado el zapato\n");
                    this.sleep(8000);
                    Ensamblador1.append(this.getName()+" ha pintado el zapato\n");

                    Ensamblador1.append("****** Zapato tipo 1 Listo por: "+ this.getName()+" #Zapato: "+bufT.getTipo1()+" ******\n");

                    
                    ProducTrenza.release(2);
                    ProducSuela.release();
                    ProducPlantilla.release();
                    bufT.setTipo1(bufT.getTipo1()-1);
                    t1.setVisible(false);
                }else{
                    Productor.append("****** Produccion Tipo 1 Completa ******");
                }
                
                
            }catch(InterruptedException ex){ 
                Logger.getLogger(Ensamblar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
