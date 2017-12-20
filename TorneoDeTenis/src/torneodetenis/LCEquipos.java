package torneodetenis;

public class LCEquipos
{
    private NodoCEquipo cabeza;

    public LCEquipos() {
    }

    public LCEquipos(NodoCEquipo cabeza) {
        this.cabeza = null;
    }

    public NodoCEquipo getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCEquipo cabeza) {
        this.cabeza = cabeza;
    }
    
    // Metodo que valida si la lista simple esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Metodo encargado de mostrar la data de cada elemento de la lista simple
    public void mostrar() {
        NodoCEquipo aux = cabeza;
        while (aux.getProximo() != cabeza) {
            aux.mostrar();
            aux = aux.getProximo();
        }
        aux.mostrar();
    }
    // Metodo donde inserta al principio de la lista simple, el nodo nuevo recibido por parametro
    public void insertarPrimero(NodoCEquipo nuevo) {
        
        if (estaVacia()) {
            cabeza = nuevo;
            cabeza.setProximo(cabeza);
        } else {
            nuevo.setProximo(cabeza);
            NodoCEquipo aux=cabeza;
            while(aux.getProximo()!=cabeza){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
            cabeza = nuevo;
        }
    }
    
    public void crearEquipo(String nombre)
    {
        NodoCEquipo equipo = new NodoCEquipo(nombre);
        insertarPrimero(equipo);
    }
    
    // Metodo donde se elimina el nodo que esta al inicio de la lista simple
    public NodoCEquipo eliminarPrimero() {
        NodoCEquipo nodoEliminado=null;
        if (!estaVacia()) {
            if(cabeza==cabeza.getProximo()){
                nodoEliminado=cabeza;
                cabeza=null;
            }
            else{
                NodoCEquipo aux=cabeza;
                nodoEliminado=cabeza;
                while(aux.getProximo()!=cabeza){
                    aux=aux.getProximo();
                }
                aux.setProximo(nodoEliminado.getProximo());
                cabeza=nodoEliminado.getProximo();
                nodoEliminado.setProximo(null);
            }
        } 
        return nodoEliminado;
    }
    
    // Metodo donde inserta al final de la lista simple, el nodo nuevo recibido por parametro
    public void insertarFinal(NodoCEquipo nuevo) {
        if (estaVacia()) {
            cabeza = nuevo;
            cabeza.setProximo(cabeza);
        } else {
            NodoCEquipo aux=cabeza;
            while(aux.getProximo()!=cabeza){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
            nuevo.setProximo(cabeza);
        }
    }
    
    // Metodo donde se elimina el nodo que esta al final de la lista simple
    public NodoCEquipo eliminarFinal() {
        NodoCEquipo nodoEliminado=null;
        if (!estaVacia()){
            if(cabeza.getProximo()==cabeza){
                nodoEliminado=cabeza;
                cabeza=null;
            }
            else{
                NodoCEquipo aux=cabeza;
                
                while(aux.getProximo().getProximo()!=cabeza){
                    aux=aux.getProximo();
                }
                nodoEliminado=aux.getProximo();
                aux.setProximo(cabeza);
                nodoEliminado.setProximo(null);
            }
        }
        return nodoEliminado;
    }
    
    // Implementar en clases
    // Metodo que inserta el nodo nuevo recibido por parametro, en la posicion recibida por parametro
    public void insertarPosicion(NodoCEquipo nuevo, int posicion){
        if(estaVacia())
            cabeza=nuevo;
        else{
            if (posicion>contar()+1) 
                System.out.println("No existe la posicion, imposible insertar el nodo");
            else if (posicion == 1)
                insertarPrimero(nuevo);
            else if (posicion == contar()+1)
                insertarFinal(nuevo);
            else
            {
                NodoCEquipo aux = cabeza;
                int cont = 1;
                while (cont < (posicion - 1))
                {
                    cont++;
                    aux = aux.getProximo();
                }
                nuevo.setProximo(aux.getProximo());
                aux.setProximo(nuevo);
            }
        }
    }
    // Metodo que elimina el nodo que se encuentra en la posicion indicada por parametro
    public NodoCEquipo eliminarPosicion(int posicion){
        NodoCEquipo nodoEliminado=null;
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
    		NodoCEquipo aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProximo();
    		}
    		nodoEliminado = aux.getProximo();
    		aux.setProximo(nodoEliminado.getProximo());
    		nodoEliminado.setProximo(null);		
            }
        }
        return nodoEliminado;
    }
    
    //Metodo que cuenta los nodos de la lista
    public int contar(){
        NodoCEquipo aux=cabeza;
        int cont=0;
        while(aux!=cabeza||cont==0){
            aux=aux.getProximo();
            cont++;
        }
        return cont;
    }
    
    public NodoCEquipo buscarPorNombre (NodoCEquipo aux, String nombre ){
    
     if(aux!=null)
        {   if (nombre.equalsIgnoreCase(aux.getNombreEquipo()))
                    {return aux; }
            else    { return buscarPorNombre(aux.getProximo(), nombre); }
        }   else    {return null;}
    }
    
}
