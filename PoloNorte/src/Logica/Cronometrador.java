/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.concurrent.Semaphore;

/**
 *
 * @author LuisAlejandro
 */
public class Cronometrador {
    private Contador cont;
    private boolean trabajando;
    Semaphore sC;
    
    public Cronometrador (){
    this.cont= new Contador(1);
    this.trabajando=false;
    }

    public Contador getCont() {
        return cont;
    }

    public void setCont(Contador cont) {
        this.cont = cont;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    public Semaphore getsC() {
        return sC;
    }

    public void setsC(Semaphore sC) {
        this.sC = sC;
    }
    
    
    
//    @Override
//    public void run (){
//    
//        
//        this.cont.setNum(this.cont.getNum()+1);
//    
//    }
    
}
