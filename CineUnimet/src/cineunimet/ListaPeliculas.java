
package cineunimet;

import java.io.Serializable;

public class ListaPeliculas implements Serializable{
   //Atributos
    private NodoPelicula cabeza;

    //Constructor, Gets y Sets
    public ListaPeliculas() {
        cabeza=null;
    }
    public NodoPelicula getCabeza() {
        return cabeza;
    }
    public void setCabeza(NodoPelicula cabeza) {
        this.cabeza = cabeza;
    }
    
    //Metodos
    public void agregarPelicula(String titulo, int year, String director, boolean enCartelera, String formato)
    {   NodoPelicula peliNueva = new NodoPelicula(titulo,year,director,enCartelera,formato);
        if (cabeza==null){
            cabeza = peliNueva;
            cabeza.setAnterior(cabeza);
            cabeza.setProximo(cabeza);
        } else {
            peliNueva.setProximo(cabeza);
            peliNueva.setAnterior(cabeza.getAnterior());
            peliNueva.getAnterior().setProximo(peliNueva);
            cabeza.setAnterior(peliNueva);
            cabeza = peliNueva;
        }
    }
    
    public NodoPelicula buscarPelicula(String titulo)
    {   NodoPelicula aux = cabeza; 
        int cont=0;
        if(aux!=null)
        {   do
            {   if(aux.getTitulo().equalsIgnoreCase(titulo))
                {return aux;} else{aux=aux.getProximo();}  
            }while(aux!=cabeza && aux!=null); 
            return null;
        }else{return null;}
    }
    
    public NodoPelicula eliminarPelicula(String titulo)
    {   NodoPelicula aux = cabeza;
        if(aux!=null)
        {   while(!aux.getTitulo().equals(titulo))
            {   aux = aux.getProximo();}
            
            if(cabeza.getTitulo().equals(cabeza.getTitulo())){cabeza=null; return aux;}else{
            aux.getProximo().setAnterior(aux.getAnterior());
            aux.getAnterior().setProximo(aux.getProximo()); 
            aux.setProximo(null);
            aux.setAnterior(null);
            return aux;}
            
        }else return null;
    }
    
}
