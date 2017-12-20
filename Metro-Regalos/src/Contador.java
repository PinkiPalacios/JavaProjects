
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisAlejandro
 */
public class Contador {
    int dia=1;
    private boolean hayEscritor=false;
    boolean hayLector;
    int id;
    JLabel label;
    JLabel bici;
    JLabel presi;
    JLabel cro;

    

    public Contador(JLabel label1, JLabel vici, JLabel presi, JLabel cro ) {
        
        this.label=label1;
        this.bici=vici;
        this.presi=presi;
        this.cro=cro;
        
    }
    
    
    public synchronized void openL( ) throws InterruptedException{
    while (hayEscritor){
    
    wait();
    
    }
    hayEscritor=false;
     cro.setText("Durmiendo");
        System.out.println("santa lee");
        presi.setText("Despierto");
        if (Integer.parseInt(this.label.getText())>=10){
        label.setText("0");
        bici.setText("0");
        }
    }
    
    public synchronized void closeL ( ){
        System.out.println("Santa deja de leer");
       
        if (!hayLector){hayLector=false;
        notify();
        
        } 
        
        
    }
    
    
        public synchronized void openE ( ) throws InterruptedException{
        while (hayLector){
        
     wait();
     
        }presi.setText("Durmiendo");
       
            hayLector=false;
            System.out.println("cronometrador modificando");
            cro.setText("Despierto");
            int aux=Integer.parseInt(this.label.getText())+1;
            this.label.setText(Integer.toString(aux));
        }
        
    
    public synchronized void closeE(){
        System.out.println("cronometrador sale");
        
        if (!hayEscritor){
            hayLector=false;
            notify();
           
        }
            
        
    }
    
    }

