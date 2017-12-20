
package cineunimet;

import java.io.Serializable;

public class NodoSalas implements Serializable{
    //Atributos
    private int numero; 
    private String formato; 
    private int capacidad; 
    private NodoPelicula pelicula;
    private boolean disponible; 
    private PilaAsientos asientos; 
    private NodoSalas proximo;  
    private NodoSalas anterior; 
    
    //Constructor, Gets y Sets
    public NodoSalas(int numero, String formato, int capacidad)
    {   this.numero=numero;
        this.formato=formato;
        this.capacidad=capacidad;  
        asientos = new PilaAsientos();
        asientos.crearAsientosSala(capacidad);
        proximo=null; 
        anterior=null;   
    }
    
    public NodoSalas(){}
    
    public int getNumero() {
        return numero;}
    public void setNumero(int numero) {
        this.numero = numero;}
    public String getFormato() {
        return formato;}
    public void setFormato(String formato) {
        this.formato = formato;}
    public int getCapacidad() {
        return capacidad;}
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;}
    public NodoPelicula getPelicula() {
        return pelicula;}
    public void setPelicula(NodoPelicula pelicula) {
        this.pelicula=pelicula; 
    }
    public boolean isDisponible() {
        if(pelicula==null){return true;}
        else{return false;}
    }
    public void setDisponible(boolean Disponible) {
        this.disponible = Disponible;}
    public PilaAsientos getAsientos() {
        return asientos;}
    public void setAsientos(PilaAsientos asientos) {
        this.asientos = asientos;}
    public NodoSalas getProximo() {
        return proximo;}
    public void setProximo(NodoSalas proximo) {
        this.proximo = proximo;}
    public NodoSalas getAnterior() {
        return anterior;}
    public void setAnterior(NodoSalas anterior) {
        this.anterior = anterior;}
    
    //Metodos
    public void modificar(String formato, int numero, int capacidad, NodoPelicula pelicula)
    {   this.formato=formato;
        this.numero=numero;
        this.pelicula=pelicula;
            if (pelicula==null)
            { disponible=true; }else{disponible=true;}
        this.capacidad=capacidad;
            asientos.eliminarAsientos();
            asientos.crearAsientosSala(capacidad);
    }
    
    public int contarAsientosDisponibles()
    {   int cont=0; 
        PilaAsientos pA = new PilaAsientos();
        NodoAsientos nA = asientos.peek(); 

        while(nA!=null)
        {   if(!nA.isOcupado())
            {   cont++;}
            nA=nA.getProximo(); 
        }
        return cont; 
    }
    

}
