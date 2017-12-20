package Logica;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import Pantalla.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisAlejandro
 */
public class Productor extends Thread  {
   private Almacen alm;
   private int cantidad;
   private int tiempo;
   private int td;
   boolean run=true;
   private Semaphore sP;
   private Semaphore sC;
   private JLabel etiqueta;
   private Pantalla miPan;
   
   public Productor (Almacen al, int tdp, int td,Semaphore sP1, Semaphore sC1, int canti, Pantalla pan){
   this.alm=al;
   this.tiempo=tdp;
   this.td=td;
   this.sC=sC1;
   this.sP=sP1;
   this.cantidad=canti;
   this.miPan=pan;
  
   }

    public Almacen getAlm() {
        return alm;
    }

    public void setAlm(Almacen alm) {
        this.alm = alm;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTd() {
        return td;
    }

    public void setTd(int td) {
        this.td = td;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public Semaphore getsP() {
        return sP;
    }

    public void setsP(Semaphore sP) {
        this.sP = sP;
    }

    public Semaphore getsC() {
        return sC;
    }

    public void setsC(Semaphore sC) {
        this.sC = sC;
    }
   
  
   
   @Override 
   public void run (){
       
    while (true){
    
    miPan.lbpm.setText(Integer.toString(this.getCantidad()));
    
    
    }
       
       
       
       
   }
   
   
   
   
   
   
   
}
