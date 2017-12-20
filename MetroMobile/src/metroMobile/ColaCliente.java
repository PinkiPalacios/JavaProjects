
package metroMobile;

import java.io.Serializable;


public class ColaCliente implements Serializable{
    
    private NodoCliente cabeza;
    private NodoCliente cola;
    
    public ColaCliente (){
    cabeza = cabeza = null;
    }

    public NodoCliente getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCliente cabeza) {
        this.cabeza = cabeza;
    }

    public NodoCliente getCola() {
        return cola;
    }

    public void setCola(NodoCliente cola) {
        this.cola = cola;
    }
    
    public NodoCliente eliminarPrimero(){
        NodoCliente nodoEliminado = null;
            if(nodoEliminado != null){
                nodoEliminado = cabeza;
                cabeza=cabeza.getProximo();
                nodoEliminado.setProximo(null);
            }
            return nodoEliminado;
        
    }
    
    public NodoCliente desencolar(){
        return eliminarPrimero();
    }
    
    public void encolar (NodoCliente nuevo){
        if(this.cabeza == null){
            this.cabeza = nuevo;
        }else {
            NodoCliente aux = cabeza;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
        
    }
    
    public void encolar (String MarcaTlf, String Problema, String Nombre, int Cedula, int Telf, String fechaIngreso){
        NodoCliente nuevo = new NodoCliente(MarcaTlf, Problema, Nombre, Cedula, Telf, fechaIngreso);
    if(this.cabeza == null){
            this.cabeza = nuevo;
        }else {
            NodoCliente aux = cabeza;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    ListaSucursales aux;
    
    }
    
     public NodoCliente BuscarCliente (String Nombre){
    
        NodoCliente aux = cabeza;
        int cont=0;
        
        if (aux != null){
            do{
                if(aux.getNombre().equalsIgnoreCase(Nombre)){
                return aux;
                }else {
                aux = aux.getProximo();
                }
            }while (aux != cabeza && aux != null);
        
            return null;

        }else{return null;}
        
    }
     
//     public void encolar (String MarcaTlf, String Problema, String Nombre, int Cedula, int Telf, String fechaIngreso, NodoCTecnicos tec){
//        NodoCliente nuevo = new NodoCliente(MarcaTlf, Problema, Nombre, Cedula, Telf, fechaIngreso);
//    if(this.cabeza == null){
//            this.cabeza = nuevo;
//        }else {
//            NodoCliente aux = cabeza;
//            while(aux.getProximo() != null){
//                aux = aux.getProximo();
//            }
//            aux.setProximo(nuevo);
//        }
//    ListaSucursales aux;
//    NodoCTecnicos ca=tec;
//    while(tec.getProximo()!=ca){
//    if(tec.getMarcaTlf().equals(nuevo.getMarcaTlf())){
//    tec.getColaEspera().encolar(nuevo);
//    }else{
//    tec=tec.getProximo();
//    }
//    }
//    if(tec.getListaClientes().ContarNodo()<=10){
//    tec.getListaClientes().agregarPrimero(tec.getColaEspera().desencolar());
//    }
    
    }
    
    
    
   
    
    

