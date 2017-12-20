package torneodetenis;

public class LSCategorias 
{
    private NodoCategoria cabeza = new NodoCategoria();
    
    // Metodo que valida si la lista simple esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

    public NodoCategoria getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCategoria cabeza) {
        this.cabeza = cabeza;
    }

    // Metodo encargado de mostrar la data de cada elemento de la lista simple
    public void mostrar() {
        NodoCategoria aux = cabeza;
        while (aux != null) {
            aux.mostrar();
            aux = aux.getProximo();
        }
    }
    // Metodo donde inserta al principio de la lista simple, el nodo nuevo recibido por parametro
    public void insertarPrimero( char sex, int num) {
        NodoCategoria nuevo=new NodoCategoria(num, sex);
        
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            nuevo.setProximo(cabeza);
            cabeza = nuevo;
        }
    }
    // Metodo donde se elimina el nodo que esta al inicio de la lista simple
    public NodoCategoria eliminarPrimero() {
        NodoCategoria nodoEliminado=null;
        if (!estaVacia()) {
            nodoEliminado=cabeza;
            cabeza=cabeza.getProximo();
            nodoEliminado.setProximo(null);
        } 
        return nodoEliminado;
    }
    
    // Metodo donde inserta al final de la lista simple, el nodo nuevo recibido por parametro
    public void insertarFinal(NodoCategoria nuevo) {
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            NodoCategoria aux=cabeza;
            while(aux.getProximo()!=null){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    // Metodo donde se elimina el nodo que esta al final de la lista simple
    public NodoCategoria eliminarFinal() {
        NodoCategoria nodoEliminado=null;
        if (!estaVacia()){
            if(cabeza.getProximo()==null){
                nodoEliminado=cabeza;
                cabeza=null;
            }
            else{
                NodoCategoria aux=cabeza;
                while(aux.getProximo().getProximo()!=null){
                    aux=aux.getProximo();
                }
                nodoEliminado=aux.getProximo();
                aux.setProximo(null);
            }
        }
        return nodoEliminado;
    }
    
    // Implementar en clases
    // Metodo que inserta el nodo nuevo recibido por parametro, en la posicion recibida por parametro
    public void insertarPosicion(NodoCategoria nuevo, int posicion){
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
                NodoCategoria aux = cabeza;
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
    public NodoCategoria eliminarPosicion(int posicion){
        NodoCategoria nodoEliminado=null;
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
    		NodoCategoria aux = cabeza;
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
        NodoCategoria aux=cabeza;
        int cont=0;
        while(aux!=null){
            aux=aux.getProximo();
            cont++;
        }
        return cont;
    }
}
