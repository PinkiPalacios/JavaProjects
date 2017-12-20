package torneodetenis;

public class ABBJugadores 
{
    private NodoJugador raiz;

    public ABBJugadores() {}

    public ABBJugadores(NodoJugador raiz) {
        this.raiz = raiz;
    }

    public NodoJugador getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoJugador raiz) {
        this.raiz = raiz;
    }
    
    
    // ABB vacio cuando raiz es nula
    public boolean estaVacio(){
        return raiz==null;
    }
    
    // Recorrido Pre-Orden del ABB. Se usa, se va por la izquierda y luego por la derecha
    public void mostrarPreOrden(NodoJugador aux){
        if(aux!=null){
            aux.mostrar();
            mostrarPreOrden(aux.getHI());
            mostrarPreOrden(aux.getHD()); 
        }
    }
    
    // Recorrido En-Orden del ABB. Se va por la izquierda, se usa y luego por la derecha
    public void mostrarEnOrden(NodoJugador aux){
        if(aux!=null){
            mostrarEnOrden(aux.getHI());
            aux.mostrar();
            mostrarEnOrden(aux.getHD()); 
        }
    }
    
    // Recorrido Post-Orden del ABB. Se va por la izquierda, luego por la derecha y se usa
    public void mostrarPostOrden(NodoJugador aux){
        if(aux!=null){
            mostrarPostOrden(aux.getHI());
            mostrarPostOrden(aux.getHD()); 
            aux.mostrar();
        }
    }
    // Metodo que inserta el nodo nuevo recibido por parametro, en el ABB (en su posicion respectiva)
    public void Insertar(NodoJugador aux, NodoJugador nuevo) throws Exception
    {
        if (estaVacio()){
            raiz = nuevo;
        }
	else if (nuevo.getCedula()<aux.getCedula())
	{
            if (aux.getHI()== null)
            {
		aux.setHI(nuevo);
            }
            else
            {
                Insertar(aux.getHI(), nuevo);
            }
        }
	else if (nuevo.getCedula()>aux.getCedula())
	{
            if (aux.getHD()== null)
            {
		aux.setHD(nuevo);
            }
            else
            {
		Insertar(aux.getHD(), nuevo);
            }
        }
        else{
            throw new Exception("Jugador duplicado");
        }
    }
    
    // Metodo que pone en nulo, el hijo izquierdo de aux (subarbol izquierdo)
    public void suprimeHijoIzquierdo(NodoJugador aux)
    {
        if(aux!=null)
        {
            aux.setHI(null);
        }
    }
    
    // Metodo que pone en nulo, el hijo derecho de aux (subarbol derecho)
    public void suprimeHijoDerecho(NodoJugador aux)
    {
        if(aux!=null)
        {
            aux.setHD(null);
        }
    }
    
    // Metodo que retorna la cantidad de nodos presentes en el arbol
    public int contarNodos(NodoJugador aux)
    {
        if(aux==null)
        {
            return 0;
        }
        else
        {
            return 1 + contarNodos(aux.getHI())+contarNodos(aux.getHD());
        }
    }
    
}
