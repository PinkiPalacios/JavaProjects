
package cineunimet;

import java.io.Serializable;

public class PilaAsientos implements Serializable{
    //Atributos
    private NodoAsientos cabeza;
    
    //Constructor, Sets y Gets
    public PilaAsientos()
    {   cabeza=null;
    }

    public NodoAsientos peek() {
        return cabeza;
    }

    public void setCabeza(NodoAsientos cabeza) {
        this.cabeza = cabeza;
    }

    //Metodos
    public NodoAsientos pop()
    {   NodoAsientos nodoEliminado=null;
        if (cabeza!=null) {
            nodoEliminado=cabeza;
            cabeza=cabeza.getProximo();
            nodoEliminado.setProximo(null);
        }
        
        return nodoEliminado; 
    }
            
    public void push(NodoAsientos nuevo)
    {    nuevo.setProximo(cabeza);
         this.cabeza=nuevo;
    }
    
    public void crearAsientosSala(int num)
    {   for(int i=num; i>0; i--)
        {   NodoAsientos aux = new NodoAsientos(i); 
            push(aux);  
        }
    }
    
    public void eliminarAsientos()
    {   if(cabeza!=null){
            while(cabeza.getProximo()!=null)
            {pop();}
            cabeza.setProximo(null);
            cabeza=null;
        }
    }
     
    
    
}
