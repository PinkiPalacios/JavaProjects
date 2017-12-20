/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.bici;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author LuisAlejandro
 */
public class Buffer {
    
   private String[] ARuedas = new String [16];
   private String[] AMarcos = new String [15];
   private String[] ABujes = new String [10];
   private String[] ANeumatico = new String [10];
   
   private int PLlena;
   private int PVacia;
   
   private String name;
   
  
   
   
    public Buffer(String name){
       
       PVacia=0;
       PLlena=0;
       this.name = name;
           
   }
   

    public Buffer(){}
    
        //Metodo de Crear Rueda
        synchronized public void CrearRuedas (String Ruedas){
        
            ARuedas[PVacia]=Ruedas; //Se ingresa el objeto en la posicion vacia
            
            PVacia = (PVacia+1) % ARuedas.length;
            
        }
        
        //Se utiliza el producto
        synchronized public String ConsumirRuedas(){
        
            String Ruedas = ARuedas[PLlena]; //Se obtiene el objeto en la posicion llena
            ARuedas[PLlena] = null;
            PLlena = (PLlena+1)%ARuedas.length; //Mueve el apuntador a la proxima posicion que tenga algo (llena)
            return Ruedas;
        
        }
        
        //Metodo de Crear Marco
        synchronized public void CrearMarco(String Marcos){
        
            AMarcos[PVacia]=Marcos; //Se ingresa el objeto en la posicion vacia
            
            PVacia = (PVacia+1) % AMarcos.length;
            
        
        }
    
        //Se utiliza el producto
        synchronized public String ConsumirMarcos(){
        
            String Marcos = ARuedas[PLlena]; //Se obtiene el objeto en la posicion llena
            AMarcos[PLlena] = null;
            PLlena = (PLlena+1)%AMarcos.length; //Mueve el apuntador a la proxima posicion que tenga algo (llena)
            return Marcos;
        
        }
         synchronized public void CrearNeumatico (String Neumatico){
        
            ANeumatico[PVacia]=Neumatico; //Se ingresa el objeto en la posicion vacia
            
            PVacia = (PVacia+1) % ANeumatico.length;
            
        }
        
        //Se utiliza el producto
        synchronized public String ConsumirNeumatico(){
        
            String Neumatico = ANeumatico[PLlena]; //Se obtiene el objeto en la posicion llena
            ANeumatico[PLlena] = null;
            PLlena = (PLlena+1)%ANeumatico.length; //Mueve el apuntador a la proxima posicion que tenga algo (llena)
            return Neumatico;
        
        }
        
        //Metodo de Crear Marco
        synchronized public void CrearBujes(String Bujes){
        
            ABujes[PVacia]=Bujes; //Se ingresa el objeto en la posicion vacia
            
            PVacia = (PVacia+1) % ABujes.length;
            
        
        }
    
        //Se utiliza el producto
        synchronized public String ConsumirBujes(){
        
            String Bujes = ABujes[PLlena]; //Se obtiene el objeto en la posicion llena
            ABujes[PLlena] = null;
            PLlena = (PLlena+1)%ABujes.length; //Mueve el apuntador a la proxima posicion que tenga algo (llena)
            return Bujes;
        
        }
        
        public boolean estaVacioRuedas(){
        
            if (ARuedas[PVacia] == null){
                
                return true;
            }else{
            
                return false;
            
            }
        
        }
        
        public boolean estaVacioMarcos(){
        
            if(AMarcos[PVacia] == null){
            
                return true;
                
            }else{
            
                return false;
            
            }
        
        }
         public boolean estaVacioNeumatico(){
        
            if (ANeumatico[PVacia] == null){
                
                return true;
            }else{
            
                return false;
            
            }
        
        }
        
        public boolean estaVacioBujes(){
        
            if(ABujes[PVacia] == null){
            
                return true;
                
            }else{
            
                return false;
            
            }
        
        }
        
        public boolean estaLlenoRuedas(){
        
            if (ARuedas[PLlena] != null){
            
                return true;
            
            }else{
            
                return false;
                
            }
            
        }
        
        public boolean estaLlenoMarcos(){
        
            if (AMarcos[PLlena] != null){
            
                return true;
            
            }else {
            
                return false;
                
            }
        
        
        }
    
    
       public boolean estaLlenoNeumatico(){
        
            if (ANeumatico[PLlena] != null){
            
                return true;
            
            }else{
            
                return false;
                
            }
            
        }
        
        public boolean estaLlenoBujes(){
        
            if (ABujes[PLlena] != null){
            
                return true;
            
            }else {
            
                return false;
                
            }
        
        
        }
    
   
   
   
}
