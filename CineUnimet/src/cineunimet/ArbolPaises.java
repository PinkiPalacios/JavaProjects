package cineunimet;

import java.io.Serializable;
import java.util.Random;

public class ArbolPaises implements Serializable{
    private NodoPaises raiz;

    //Gets, Sets y Constructor
    public ArbolPaises()
    { raiz=null; 
    }
    
    public NodoPaises getRaiz() {
        return raiz;}
    
    public void setRaiz(NodoPaises raiz) {
        this.raiz = raiz;}
    
    //Metodos
    public void agregarNumero(NodoPaises aux)
    {   if(raiz==null){aux.setNumero(98);}
        int x = (int) (Math.random()*(196-1)+1);
        while(compararNumero(raiz,x)!=null)
        {x= (int) (Math.random()*(196-1)+1);}
        aux.setNumero(x);
    }
    
    public NodoPaises compararNumero(NodoPaises aux, int num)
     {  if(aux!=null)
        {   if(aux.getNumero()==num)
                {return aux;}
            else if(aux.getNumero()>num)
                {return compararNumero(aux.getNIzquierdo(), num);}
            else 
                {return compararNumero(aux.getNDerecho(), num);}
        }else return null;
     }
    
    public NodoPaises compararNombre(NodoPaises aux, String nombre)
     {  if(aux!=null)
        {   if(aux.getNombre().equalsIgnoreCase(nombre)){return aux;}
            else{ NodoPaises aux1= compararNombre(aux.getNDerecho(), nombre);
                  NodoPaises aux2= compararNombre(aux.getNIzquierdo(), nombre);  
                  if(aux1!=null){return aux1;}else{return aux2;}
                }
        }else return null; 
     }  
    
    public void insertar(NodoPaises aux, NodoPaises nuevo)
    {   if(raiz==null)
            {   raiz = nuevo;}
        else if(nuevo.getNumero()<aux.getNumero())
            {   if(aux.getNIzquierdo()==null)
                { aux.setNIzquierdo(nuevo);}
                else{ insertar(aux.getNIzquierdo(), nuevo);}
            }
        else if(nuevo.getNumero()>aux.getNumero())
            {   if(aux.getNDerecho()==null){ aux.setNDerecho(nuevo);}
                else{ insertar(aux.getNDerecho(),nuevo);}
            }
    }
    
    public void crearPais(String nombre)
    {   NodoPaises nuevo = new NodoPaises(nombre);
        agregarNumero(nuevo);
        insertar(raiz,nuevo);
    }
    

    public NodoPaises mostrar(NodoPaises aux)
    {   if(aux!=null)
        {   mostrar(aux.getNDerecho());
            mostrar(aux.getNIzquierdo());
            return aux; 
        }
        return null; 
    }
  
}
