
package metroMobile;

import java.io.Serializable;


public class ListaClientes implements Serializable{
    
    private NodoCliente cabeza;
    
    public ListaClientes(){
        cabeza = null;
    }

    public NodoCliente getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCliente cabeza) {
        this.cabeza = cabeza;
    }
    
//    public void agregarPrimero(String MarcaTlf, String Problema, String Nombre, int Cedula, int Telf, String fechaIngreso){ //pedir nombre, encargado y numero
//    
//    NodoCliente nuevo = new NodoCliente(MarcaTlf, Problema, Nombre, Cedula, Telf, fechaIngreso);
//    
//    if (cabeza != null){
//    nuevo.setProximo(cabeza);
//    cabeza = nuevo;
//    }else{
//    cabeza = nuevo;
//    }
//    
//    }
    
    public void agregarPrimero(NodoCliente nuevo){ //pedir nombre, encargado y numero
    
    
    
    if (cabeza != null){
    nuevo.setProximo(cabeza);
    cabeza = nuevo;
    }else{
    cabeza = nuevo;
    }}
    
    
    public int ContarNodo(){
    
        NodoCliente aux = cabeza;
        int cont = 0;
        
        while(aux != null){
        
            aux = aux.getProximo();
            cont++;
        
        }
    return cont;
    }
    
   
    
   
    

    
    //Eliminar
    //Contar
    
}
