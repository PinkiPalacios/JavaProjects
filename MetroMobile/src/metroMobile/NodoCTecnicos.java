
package metroMobile;

import java.io.Serializable;


public class NodoCTecnicos implements Serializable{
    
    private String MarcaTlf;
    private String Nombre;
    private ListaClientes listaClientes;
    private ColaCliente colaEspera;
    private NodoCTecnicos proximo;

    public NodoCTecnicos(String MarcaTlf, String Nombre) {
        this.MarcaTlf = MarcaTlf;
        this.Nombre = Nombre;
        listaClientes = new ListaClientes();
        colaEspera = new ColaCliente();
        proximo = null;
    }

    public NodoCTecnicos getProximo() {
        return proximo;
    }

    public void setProximo(NodoCTecnicos proximo) {
        this.proximo = proximo;
    }
    
    public String getMarcaTlf() {
        return MarcaTlf;
    }

    public void setMarcaTlf(String MarcaTlf) {
        this.MarcaTlf = MarcaTlf;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ListaClientes getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ColaCliente getColaEspera() {
        return colaEspera;
    }

    public void setColaEspera(ColaCliente colaEspera) {
        this.colaEspera = colaEspera;
    }
    
    
    
    
    
}
