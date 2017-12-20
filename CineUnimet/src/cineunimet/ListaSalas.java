
package cineunimet;

import java.io.Serializable;

public class ListaSalas implements Serializable{
    //Atributos
    private NodoSalas cabeza;  
    private int cont; 
    
    //Gets, Sets y Constructor
    public ListaSalas()
    {   cabeza = null; cont=0;}
    
    public NodoSalas getCabeza() {
        return cabeza;}
    public void setCabeza(NodoSalas cabeza) {
        this.cabeza = cabeza;}
    
    //Metodos
    public void agregarSala(int num, String formato, int capacidad, NodoPelicula pelicula)
    {   NodoSalas nuevo = new NodoSalas(num, formato, capacidad);
        nuevo.setPelicula(pelicula);
        if(pelicula!=null){nuevo.setDisponible(false);}else{nuevo.setDisponible(true);}
        if(cabeza==null)
        {   cabeza=nuevo; }
        else 
        {   nuevo.setProximo(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza=nuevo;
        }
    }
    
    
    public NodoSalas buscarPorNumero(NodoSalas aux, int num)
    {   if(aux!=null)
        {   if(aux.getNumero()==num)
            {   return aux;
            }else {return buscarPorNumero(aux.getProximo(),num); }  
        }else{ return null;} //El numero de Sala No existe
    }
    
    public NodoSalas buscarPorPelicula(NodoSalas aux, String pelicula)
    {   if(aux!=null)
        {   
            if(aux.getPelicula()!=null && aux.getPelicula().getTitulo().equals(pelicula))
            {   return aux;
            }else {return buscarPorPelicula(aux.getProximo(),pelicula); }  
        }else{ return null;}
    }
    
    public NodoSalas buscarPorFormato(NodoSalas aux, String formato)
    {   if(aux!=null)
        {   if(aux.getFormato().equals(formato))
            {   return aux;
            }else {return buscarPorFormato(aux.getProximo(), formato);}
        }else{return null;}
    }
    
    public NodoSalas buscarDisponible(NodoSalas aux, String formato)
    {   if(aux!=null)
        {   if(aux.isDisponible()&& aux.getFormato().equals(formato))
            {   return aux;
            }else {return buscarDisponible(aux.getProximo(),formato);}
        }else{return null;}
    }
    
    
}
