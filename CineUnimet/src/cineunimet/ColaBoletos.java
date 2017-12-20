
package cineunimet;

import java.io.Serializable;

public class ColaBoletos implements Serializable{
    //Atributos
    private NodoBoletos cabeza;
    private NodoBoletos cola; 
    //Constructor, Gets y Sets
    public ColaBoletos()
    { cabeza=cabeza=null;
    }

    public NodoBoletos getCabeza() {
        return cabeza;
    }
    
    public NodoBoletos getCola() {
        return cola;
    }

    public void setCola(NodoBoletos cola) {
        this.cola = cola;
    }
    
    public NodoBoletos primeroCola() {
        return cabeza;
    }

    public void setCabeza(NodoBoletos cabeza) {
        this.cabeza = cabeza;
    }
    
     public NodoBoletos eliminarPrimero() {
        NodoBoletos nodoEliminado=null;
        if (nodoEliminado!=null) {
            nodoEliminado=cabeza;
            cabeza=cabeza.getProximo();
            nodoEliminado.setProximo(null);
        } 
        return nodoEliminado;
    }
    
    public NodoBoletos desencolar(){
        return eliminarPrimero();
    }
    
    public void encolar(NodoBoletos nuevo) {
        if (this.cabeza==null) {
            this.cabeza = nuevo;
        } else {
            NodoBoletos aux=cabeza;
            while(aux.getProximo()!=null){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    //Metodos
    
    
}
