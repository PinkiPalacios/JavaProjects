
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
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
 * @author LuisAlejandro
 */



public class Ensamblar extends Thread {
    
    Buffer bufM;
    Buffer bufR;
    
    Semaphore ProductMarcos;
    Semaphore ConsumMarcos;
    Semaphore ProductRuedas;
    Semaphore ConsumRuedas;
    
    JProgressBar BarraM;
    JProgressBar BarraR;
    
    JTextArea Ensamblador1;
    JTextArea Productor;
    long tiempo;
    int bicicletas;
    Ensamblar ensam;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    ArchivoTexto txt;
    JLabel cont;
    private boolean run=true;
    
    public Ensamblar(String nom,Buffer bufM, Buffer bufR, Semaphore ProductMarcos, Semaphore ConsumMarocos, Semaphore ProductRuedas, Semaphore ConsumRuedas, JProgressBar BarraM, JProgressBar BarraR, JTextArea Ensamblador1, JTextArea Productor, JLabel bici) {
        super(nom);
        this.bufM = bufM;
        this.bufR = bufR;
        this.ProductMarcos = ProductMarcos;
        this.ConsumMarcos = ConsumMarocos;
        this.ProductRuedas = ProductRuedas;
        this.ConsumRuedas = ConsumRuedas;
        this.BarraM = BarraM;
        this.BarraR = BarraR;
        this.Ensamblador1 = Ensamblador1;
        this.Productor = Productor;
        this.bicicletas = 0;
        this.cont=bici;
        try {
            txt=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tiempo=calcularTiempo();
    }
    
    
    public void run(){
        
        while(true){
            if (run){
            
            try {
                Ensamblador1.append("---------- Inicio de Ensamblaje ----------- \n");
                System.out.println("------->"+ConsumRuedas.availablePermits());
                ConsumRuedas.acquire(2);
                ConsumMarcos.acquire();
                Ensamblar.sleep(this.tiempo);
                BarraR.setValue(ConsumRuedas.availablePermits());
                BarraR.setString(" #Ruedas = "+(ConsumRuedas.availablePermits()));
                BarraM.setValue(ConsumMarcos.availablePermits());
                BarraM.setString(" #Marcos = "+(ConsumMarcos.availablePermits()));
                //this.sleep(tiempo);
               // this.sleep(Integer.parseInt(txt.getVec()[0])*1500);
               //Ensamblador1.append("Ha tomado 2 ruedas \n");
               // this.sleep(Integer.parseInt(txt.getVec()[0])*1700);
               //Ensamblador1.append("Ha tomado 1 marco \n");
                //this.sleep(Integer.parseInt(txt.getVec()[0])*2000);
                Ensamblador1.append("Ha armado la BICICLETA \n");
            
                Ensamblador1.append("-------- Se ha creado La Metro-Bici ----------- \n");
                int aux=Integer.parseInt(cont.getText())+1;
                cont.setText(Integer.toString(aux));
                
                ProductRuedas.release(2);
                ProductMarcos.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensamblar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            }
        } 
    
    
    
    }

    public int getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(int bicicletas) {
        this.bicicletas = bicicletas;
    }
    
    
    
    
    
    public long calcularTiempo (){
    int x= Integer.parseInt(txt.getVec()[0]);
        x=x*2000;
        
    return x;
    }
    
    
    
    
    
    
    
    
    
    
    
}
