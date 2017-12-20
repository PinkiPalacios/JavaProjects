/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author LuisAlejandro
 */
public class Buffer {
    
   private String[] ARuedas = new String [20];
   private String[] AMarcos = new String [15];
   
   private int PLlena;
   private int PVacia;
   
   private String name;
   
  
   
   
   Buffer(String name){
       
       PVacia=0;
       PLlena=0;
       this.name = name;
           
   }
   

    Buffer(){}
    
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
    
    
    
    
   
   
   
}
