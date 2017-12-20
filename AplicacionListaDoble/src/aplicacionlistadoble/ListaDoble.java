/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlistadoble;

/**
 *
 * @author Brayan Fernandez
 * Clase ListaDoble, unico atributo: cabeza
 */
public class ListaDoble {

    private NodoDoble cabeza;
    private NodoDoble cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola=null;
    }
    
    public ListaDoble(NodoDoble cabeza){
        this.cabeza=cabeza;
        this.cola=null;
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }
    
    public NodoDoble getCola(){
        return cola;
    }
    // Metodo que valida si la lista doble esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Metodo encargado de mostrar la data de cada elemento de la lista simple
    public void mostrar() {
        NodoDoble aux = cabeza;
        while (aux != null) {
            aux.mostrar();
            aux = aux.getProximo();
        }
    }
    
    public void mostrarInversa(){
        NodoDoble aux2 = cola;
        while (aux2 != null) {
            aux2.mostrar();
            aux2 = aux2.getAnterior();
        }
    }
    // Metodo donde inserta al principio de la lista doble, el nodo nuevo recibido por parametro
    public void insertarPrimero(NodoDoble nuevo) {
        if (estaVacia()) {
            cabeza = cola = nuevo;
        } else {
            if(cabeza==cola){
                nuevo.setProximo(cabeza);
                cola = cabeza;
                cabeza = nuevo;
                cola.setAnterior(cabeza);
            }
            else{
                nuevo.setProximo(cabeza);
                cabeza.setAnterior(nuevo);
                cabeza = nuevo;
            }   
        }
        

    }
    // Metodo donde se elimina el nodo que esta al inicio de la lista doble
    public NodoDoble eliminarPrimero() {
        NodoDoble nodoEliminado=null;
        if (!estaVacia()) {
            if(cabeza==cola){
                nodoEliminado=cabeza;
                cabeza=cola=null;
            }
            else{
                nodoEliminado=cabeza;
                cabeza=cabeza.getProximo();
                cabeza.setAnterior(null);
                nodoEliminado.setProximo(null);
            }
        } 
               
        return nodoEliminado;
    }
    
    // Metodo donde inserta al final de la lista doble, el nodo nuevo recibido por parametro
    public void insertarFinal(NodoDoble nuevo) {
        if (estaVacia()) {
            cabeza = cola = nuevo;
        } else {
            cola.setProximo(nuevo);
            nuevo.setAnterior(cola);
            cola=nuevo;           
        }
    }
    
    // Metodo donde se elimina el nodo que esta al final de la lista doble
    public NodoDoble eliminarFinal() {
        NodoDoble nodoEliminado=null;
        if (!estaVacia()){
            if(cabeza==cola){
                nodoEliminado=cabeza;
                cabeza=cola=null;
            }
            else{
                nodoEliminado=cola;
                cola=cola.getAnterior();
                cola.setProximo(null);
                nodoEliminado.setAnterior(null);
            }
        }
        return nodoEliminado;
    }
    
    // Implementar en clases
    // Metodo que inserta el nodo nuevo recibido por parametro, en la posicion recibida por parametro
    public void insertarPosicion(NodoDoble nuevo, int posicion){
        if(estaVacia())
            cabeza=cola=nuevo;
        else{
            if (posicion>contar()+1) 
                System.out.println("No existe la posicion, imposible insertar el nodo");
            else if (posicion == 1)
                insertarPrimero(nuevo);
            else if (posicion == contar()+1)
                insertarFinal(nuevo);
            else
            {
                NodoDoble aux = cabeza;
                int cont = 1;
                while (cont < (posicion - 1))
                {
                    cont++;
                    aux = aux.getProximo();
                }
                nuevo.setProximo(aux.getProximo());
                aux.setProximo(nuevo);
                aux.getProximo().setAnterior(nuevo);
                nuevo.setAnterior(aux);
            }
        }
    }
    // Metodo que elimina el nodo que se encuentra en la posicion indicada por parametro
    public NodoDoble eliminarPosicion(int posicion){
        NodoDoble nodoEliminado=null;
        if(!estaVacia())
        {
            if(posicion == 1)
            {
    		nodoEliminado=eliminarPrimero();
            }
            else if(posicion == contar())
            {
    		nodoEliminado=eliminarFinal();
            }
            else if(posicion > contar() + 1)
            {
    		System.out.println("Error: posicion nula");
            }   
            else
            {
    		NodoDoble aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProximo();
    		}
    		nodoEliminado = aux.getProximo();
    		aux.setProximo(nodoEliminado.getProximo());
                nodoEliminado.getProximo().setAnterior(aux);
    		nodoEliminado.setProximo(null);	
                nodoEliminado.setAnterior(null);	
            }
        }
        return nodoEliminado;
    }
    
    //Metodo que cuenta los nodos de la lista
    public int contar(){
        NodoDoble aux=cabeza;
        int cont=0;
        while(aux!=null){
            aux=aux.getProximo();
            cont++;
        }
        return cont;
    }
  
}
