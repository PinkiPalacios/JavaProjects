/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.bici;

import Interfaz.pantalla;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author LuisAlejandro
 */
public class EnsambladorB extends Thread{
    
    Buffer bufM;
    Buffer bufR;
    Buffer bufN;
    Buffer bufB;
    pantalla pantalla;
    Semaphore ProductMarcos;
    Semaphore ConsumMarcos;
    
    Semaphore ProductRuedas;
    Semaphore ConsumRuedas;
    Semaphore ProductNeumaticos;
    Semaphore ConsumNeumaticos;
    Semaphore ProductBujes;
    Semaphore ConsumBujes;
    Semaphore exN;
     Semaphore exR;
      Semaphore exB;
       Semaphore exM;
    JLabel dia;
    JProgressBar BarraM;
    JProgressBar BarraR;
    JProgressBar BarraN;
    JProgressBar BarraB;
    JLabel num;
    JTextArea Ensamblador1;
    JTextArea Productor;
    long tiempo;
    int Bicicletas;
    EnsambladorT ensam;
    
     ArrayList<EnsambladorT> listT = new ArrayList<EnsambladorT>();
    ArrayList<EnsambladorB> listB = new ArrayList<EnsambladorB>();
Timer time;
    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    ArchivoTexto txt;
    JLabel cont;
    private boolean run=true;
    
    public EnsambladorB(pantalla pant,ArrayList<EnsambladorT> listaT,ArrayList<EnsambladorB> listaB,Timer t,JLabel numero,JLabel dia,Semaphore exN,Semaphore exR,Semaphore exB,Semaphore exM,String nom,Buffer bufM, Buffer bufR, Buffer bufN, Buffer bufB, Semaphore ProductMarcos, Semaphore ConsumMarcos, Semaphore ProductRuedas, Semaphore ConsumRuedas, Semaphore ProductNeumaticos, Semaphore ConsumNeumaticos, Semaphore ProductBujes, Semaphore ConsumBujes, JProgressBar BarraM, JProgressBar BarraR, JProgressBar BarraN, JProgressBar BarraB, JTextArea Ensamblador1, JTextArea Productor, JLabel triciclo) {
        super(nom);
        this.pantalla=pant;
        this.listB=listaB;
        this.listT=listaT;
        this.time=t;
        this.exN=exN;
        this.exR=exR;
        this.exB=exB;
        this.exM=exM;
        this.bufM = bufM;
        this.bufR = bufR;
        this.bufM = bufN;
        this.bufR = bufB;
        this.ProductMarcos = ProductMarcos;
        this.ConsumMarcos = ConsumMarcos;
        this.ProductRuedas = ProductRuedas;
        this.ConsumRuedas = ConsumRuedas;
        this.ProductNeumaticos = ProductNeumaticos;
        this.ConsumNeumaticos = ConsumNeumaticos;
        this.ProductBujes = ProductBujes;
        this.ConsumBujes = ConsumBujes;
        this.BarraM = BarraM;
        this.BarraR = BarraR;
        this.BarraN = BarraN;
        this.dia=dia;
        this.BarraB = BarraB;
        this.Ensamblador1 = Ensamblador1;
        this.Productor = Productor;
        this.Bicicletas = 0;
        this.cont=triciclo;
       this.num=numero;
        try {
            txt=new ArchivoTexto();
        } catch (IOException ex) {
            Logger.getLogger(ProdMarcos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tiempo=calcularTiempo();
    }
    
    
    public void run(){
        
        while(run){
            if ((run && Integer.parseInt(this.num.getText())<(Integer.parseInt(txt.getVec()[1])))){
            
            try {
                int aux1=Integer.parseInt(dia.getText())+2;
                //dia.setText(Integer.toString(aux1));
                Ensamblador1.append("---------- Inicio de Ensamblaje de Bicicleta ----------- \n");
                System.out.println("------->"+ConsumRuedas.availablePermits());
                
                ConsumRuedas.acquire(2);
                exR.acquire();
                BarraR.setValue(ConsumRuedas.availablePermits());
                BarraR.setString(" #Ruedas = "+(ConsumRuedas.availablePermits()));
                exR.release();
                ProductRuedas.release(2);
                
                
                ConsumMarcos.acquire();
                exM.acquire();
                
                BarraM.setValue(ConsumMarcos.availablePermits());
                BarraM.setString(" #Marcos = "+(ConsumMarcos.availablePermits()));
                
                exM.release();
                ProductMarcos.release();
                
                
                ConsumNeumaticos.acquire(2);
                exN.acquire();
                
                BarraN.setValue(ConsumNeumaticos.availablePermits());
                BarraN.setString(" #Neumaticos = "+(ConsumNeumaticos.availablePermits()));
                exN.release();
                ProductNeumaticos.release(2);
                
                ConsumBujes.acquire(2);
                exB.acquire();
                
                 BarraB.setValue(ConsumBujes.availablePermits());
                BarraB.setString(" #Bujes = "+(ConsumBujes.availablePermits()));
                
                exB.release();
                 ProductBujes.release(2);
                
               
                
                
                
               
               
                //this.sleep(tiempo);
               // this.sleep(Integer.parseInt(txt.getVec()[0])*1500);
               //Ensamblador1.append("Ha tomado 2 ruedas \n");
               // this.sleep(Integer.parseInt(txt.getVec()[0])*1700);
               //Ensamblador1.append("Ha tomado 1 marco \n");
                //this.sleep(Integer.parseInt(txt.getVec()[0])*2000);
                Ensamblador1.append("Ha armado una Bicicleta \n");
             
                Ensamblador1.append("-------- Se ha creado La Metro-Bici ----------- \n");
                int aux=Integer.parseInt(cont.getText())+1;
                cont.setText(Integer.toString(aux));
                
                EnsambladorB.sleep(this.tiempo);
                
                
               
                
            } catch (InterruptedException ex) {
                Logger.getLogger(EnsambladorT.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            }else{
                    this.time.stop();
                    cambiarEn();
                    }
        } 
        
    
    
    
    }

    
    public void cambiarEn(){
    if (Integer.parseInt(this.listT.get(0).getNum().getText())>=Integer.parseInt(txt.getVec()[2])){
    
     this.pantalla.agregarEnsamT(Integer.parseInt(this.pantalla.getOperadorEnsamB().getText()));
    
        while(Integer.parseInt(this.pantalla.OperadorEnsamB.getText())>0)
        {
            int res = Integer.parseInt(this.pantalla.OperadorEnsamB.getText());
            res--;
            this.pantalla.OperadorEnsamB.setText(Integer.toString(res));
        this.pantalla.AreaProduccion.append("-Se paro un ensamblador de Bicicletas "+(listB.size()-1)+"-\n");
        this.pantalla.listaEnsamB.get(listB.size()-1).setRun(false);
        this.pantalla.listaEnsamB.remove(this.pantalla.listaEnsamB.size()-1);
        
        this.pantalla.OperadorEnsamT.setText(Integer.toString(this.pantalla.listaEnsamT.size()-1));
        
        }
        
        
    }
    
    
    
    }
    
    public int getBicicletas() {
        return Bicicletas;
    }

    public void setBicicletas(int bicicletas) {
        this.Bicicletas = bicicletas;
    }
    
    
    
    
    
    public long calcularTiempo (){
    int x= Integer.parseInt(txt.getVec()[0]);
        x=x*2000;
        
    return x;
    }

    public Buffer getBufM() {
        return bufM;
    }

    public void setBufM(Buffer bufM) {
        this.bufM = bufM;
    }

    public Buffer getBufR() {
        return bufR;
    }

    public void setBufR(Buffer bufR) {
        this.bufR = bufR;
    }

    public Buffer getBufN() {
        return bufN;
    }

    public void setBufN(Buffer bufN) {
        this.bufN = bufN;
    }

    public Buffer getBufB() {
        return bufB;
    }

    public void setBufB(Buffer bufB) {
        this.bufB = bufB;
    }

    public Semaphore getProductMarcos() {
        return ProductMarcos;
    }

    public void setProductMarcos(Semaphore ProductMarcos) {
        this.ProductMarcos = ProductMarcos;
    }

    public Semaphore getConsumMarcos() {
        return ConsumMarcos;
    }

    public void setConsumMarcos(Semaphore ConsumMarcos) {
        this.ConsumMarcos = ConsumMarcos;
    }

    public Semaphore getProductRuedas() {
        return ProductRuedas;
    }

    public void setProductRuedas(Semaphore ProductRuedas) {
        this.ProductRuedas = ProductRuedas;
    }

    public Semaphore getConsumRuedas() {
        return ConsumRuedas;
    }

    public void setConsumRuedas(Semaphore ConsumRuedas) {
        this.ConsumRuedas = ConsumRuedas;
    }

    public Semaphore getProductNeumaticos() {
        return ProductNeumaticos;
    }

    public void setProductNeumaticos(Semaphore ProductNeumaticos) {
        this.ProductNeumaticos = ProductNeumaticos;
    }

    public Semaphore getConsumNeumaticos() {
        return ConsumNeumaticos;
    }

    public void setConsumNeumaticos(Semaphore ConsumNeumaticos) {
        this.ConsumNeumaticos = ConsumNeumaticos;
    }

    public Semaphore getProductBujes() {
        return ProductBujes;
    }

    public void setProductBujes(Semaphore ProductBujes) {
        this.ProductBujes = ProductBujes;
    }

    public Semaphore getConsumBujes() {
        return ConsumBujes;
    }

    public void setConsumBujes(Semaphore ConsumBujes) {
        this.ConsumBujes = ConsumBujes;
    }

    public Semaphore getExN() {
        return exN;
    }

    public void setExN(Semaphore exN) {
        this.exN = exN;
    }

    public Semaphore getExR() {
        return exR;
    }

    public void setExR(Semaphore exR) {
        this.exR = exR;
    }

    public Semaphore getExB() {
        return exB;
    }

    public void setExB(Semaphore exB) {
        this.exB = exB;
    }

    public Semaphore getExM() {
        return exM;
    }

    public void setExM(Semaphore exM) {
        this.exM = exM;
    }

    public JLabel getDia() {
        return dia;
    }

    public void setDia(JLabel dia) {
        this.dia = dia;
    }

    public JProgressBar getBarraM() {
        return BarraM;
    }

    public void setBarraM(JProgressBar BarraM) {
        this.BarraM = BarraM;
    }

    public JProgressBar getBarraR() {
        return BarraR;
    }

    public void setBarraR(JProgressBar BarraR) {
        this.BarraR = BarraR;
    }

    public JProgressBar getBarraN() {
        return BarraN;
    }

    public void setBarraN(JProgressBar BarraN) {
        this.BarraN = BarraN;
    }

    public JProgressBar getBarraB() {
        return BarraB;
    }

    public void setBarraB(JProgressBar BarraB) {
        this.BarraB = BarraB;
    }

    public JLabel getNum() {
        return num;
    }

    public void setNum(JLabel num) {
        this.num = num;
    }

    public JTextArea getEnsamblador1() {
        return Ensamblador1;
    }

    public void setEnsamblador1(JTextArea Ensamblador1) {
        this.Ensamblador1 = Ensamblador1;
    }

    public JTextArea getProductor() {
        return Productor;
    }

    public void setProductor(JTextArea Productor) {
        this.Productor = Productor;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public EnsambladorT getEnsam() {
        return ensam;
    }

    public void setEnsam(EnsambladorT ensam) {
        this.ensam = ensam;
    }

    public ArrayList<EnsambladorT> getListT() {
        return listT;
    }

    public void setListT(ArrayList<EnsambladorT> listT) {
        this.listT = listT;
    }

    public ArrayList<EnsambladorB> getListB() {
        return listB;
    }

    public void setListB(ArrayList<EnsambladorB> listB) {
        this.listB = listB;
    }

    public Timer getTime() {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }

    public ArchivoTexto getTxt() {
        return txt;
    }

    public void setTxt(ArchivoTexto txt) {
        this.txt = txt;
    }

    public JLabel getCont() {
        return cont;
    }

    public void setCont(JLabel cont) {
        this.cont = cont;
    }
    
}
