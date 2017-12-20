
package cineunimet;

import java.io.Serializable;

public class ListaSucursales implements Serializable{
    //Atributos
    private NodoSucursales cabeza;
    
    //Constructor, Gets y Sets
    public ListaSucursales(){   cabeza = null; }
    public NodoSucursales getCabeza() {return cabeza;}
    public void setCabeza(NodoSucursales cabeza) {this.cabeza = cabeza;}
    
    //Metodos
    public void agregarPrimero(String nombre, String dir) //pedir nombre y dir
    {   NodoSucursales nuevo = new NodoSucursales(nombre, dir); 
        if(cabeza!=null)
        { nuevo.setProximo(cabeza);
          cabeza=nuevo;}
        else{ cabeza=nuevo;}
        //Hay que Pedir Todos los Datos de la Sucursal
    }
    
    public NodoSucursales buscarPorNombre(NodoSucursales aux, String nombre)
    {   if(aux!=null)
        {   if (nombre.equalsIgnoreCase(aux.getNombre()))
                    {return aux; }
            else    { return buscarPorNombre(aux.getProximo(), nombre); }
        }   else    {return null;}
    }
    
    public NodoSucursales buscarPorDir(NodoSucursales aux, String dir)
    {   if(aux!=null)
        {   if (dir.equalsIgnoreCase(aux.getDir()))
                    {return aux; }
            else    { return buscarPorDir(aux.getProximo(), dir); }
        }   else    {return null;}
    }
    
    public NodoSucursales buscarPorPeli(NodoSucursales aux, String nombrePeli)
    {       if(aux!=null)
        {   if(aux.getListaPelis().buscarPelicula(nombrePeli)!=null)
                    {return aux; }
            else    { return buscarPorPeli(aux.getProximo(), nombrePeli); }
        }   else    {return null;}
    }
    
    public NodoSucursales cerrarSucursal(NodoSucursales aux, String nombre)
    {   if(aux!=null)
        {   
            if(cabeza.getNombre().equals(nombre))
            {   NodoSucursales nodoEliminado = cabeza;
                cabeza=nodoEliminado.getProximo();
                nodoEliminado.setProximo(null);
                return nodoEliminado;
            }
            else if(aux.getProximo()!=null)
            {  
                if(nombre.equals(aux.getProximo().getNombre()))
                {   NodoSucursales nodoEliminado = aux.getProximo();
                    aux.setProximo(nodoEliminado.getProximo());
                    nodoEliminado.setProximo(null);
                    return nodoEliminado; 
                }else { return cerrarSucursal(aux.getProximo(),nombre); }
                
            } else {return null;} // La Sucursal No Existe
        
        }else{return null;} //La Sucursal No Existe
  
    }
    
}
