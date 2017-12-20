/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionlistadoble;

/**
 *
 * @author Brayan Fernandez
 Clase NodoDoble que contiene data entera, de texto y tiene un nodo doble proximo y uno anterior
 */
public class NodoDoble {
    
    private String datoTexto;
    private int datoEntero;
    private NodoDoble proximo;
    private NodoDoble anterior;
    
    public NodoDoble(){
        
    }
    
    public NodoDoble(String datoTexto,int datoEntero){
        this.datoTexto=datoTexto;
        this.datoEntero=datoEntero;
        proximo=null;
        anterior=null;
    }

    public String getDatoTexto() {
        return datoTexto;
    }

    public void setDatoTexto(String datoTexto) {
        this.datoTexto = datoTexto;
    }

    public int getDatoEntero() {
        return datoEntero;
    }

    public void setDatoEntero(int datoEntero) {
        this.datoEntero = datoEntero;
    }

    public NodoDoble getProximo() {
        return proximo;
    }

    public void setProximo(NodoDoble proximo) {
        this.proximo = proximo;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    public void mostrar(){
        System.out.println("{Texto: "+datoTexto+", Entero:"+datoEntero+"}");
    }
    
}
