
package metroMobile;

import java.io.Serializable;


public class NodoSucursales implements Serializable{
    
    private String Nombre;
    private String gEncargado;
    private String numero;
    private ColaCliente colaCliente;
    private ListaCTecnicos listaCTecnicos;
    
    private NodoSucursales proximo;

    public NodoSucursales(String Nombre, String gEncargado, String numero) {
        this.Nombre = Nombre;
        this.gEncargado = gEncargado;
        this.numero = numero;
        colaCliente = new ColaCliente();
        listaCTecnicos = new ListaCTecnicos();
        proximo = null;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getgEncargado() {
        return gEncargado;
    }

    public void setgEncargado(String gEncargado) {
        this.gEncargado = gEncargado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ColaCliente getColaCliente() {
        return colaCliente;
    }

    public void setColaCliente(ColaCliente colaCliente) {
        this.colaCliente = colaCliente;
    }

    public ListaCTecnicos getListaCTecnicos() {
        return listaCTecnicos;
    }

    public void setListaCTecnicos(ListaCTecnicos listaCTecnicos) {
        this.listaCTecnicos = listaCTecnicos;
    }

    public NodoSucursales getProximo() {
        return proximo;
    }

    public void setProximo(NodoSucursales proximo) {
        this.proximo = proximo;
    }

    
    
    //Metodos
    
    public void modificar (String Nombre, String gEncargado, String numero){
        this.Nombre = Nombre;
        this.gEncargado = gEncargado;
        this.numero = numero;
    }
    
    
    
    
    
    
}
