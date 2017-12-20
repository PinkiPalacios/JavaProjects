
package metroMobile;

import java.io.Serializable;


public class NodoPaises implements Serializable{

    public NodoPaises getPadre() {
        return padre;
    }

    public void setPadre(NodoPaises padre) {
        this.padre = padre;
    }
    
    private int numero;
    private ListaSucursales sucursales;
    private String nombre;
    private NodoPaises nDerecho;
    private NodoPaises nIzquierdo;
private NodoPaises padre;
    public NodoPaises(String nombre) {
        
        this.numero = numero;
        sucursales = new ListaSucursales();
        this.nombre = nombre;
        nDerecho = null;
        nIzquierdo = null;
    }
    
    public NodoPaises (){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ListaSucursales getSucursales() {
        return sucursales;
    }

    public void setSucursales(ListaSucursales sucursales) {
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoPaises getnDerecho() {
        return nDerecho;
    }

    public void setnDerecho(NodoPaises nDerecho) {
        this.nDerecho = nDerecho;
    }

    public NodoPaises getnIzquierdo() {
        return nIzquierdo;
    }

    public void setnIzquierdo(NodoPaises nIzquierdo) {
        this.nIzquierdo = nIzquierdo;
    }
    
    
    
    
    
}
