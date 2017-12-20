
package metroMobile;

import java.io.Serializable;


public class NodoCliente implements Serializable{
    
    private String MarcaTlf;
    private String Problema;
    private String Nombre;
    private int Cedula;
    private int Telf;
    private String fechaIngreso;
    NodoCliente proximo;

    public NodoCliente(String MarcaTlf, String Problema, String Nombre, int Cedula, int Telf, String fechaIngreso) {
        this.MarcaTlf = MarcaTlf;
        this.Problema = Problema;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telf = Telf;
        this.fechaIngreso = fechaIngreso;
        proximo = null;
    }
    
    public NodoCliente(){}

    public String getMarcaTlf() {
        return MarcaTlf;
    }

    public void setMarcaTlf(String MarcaTlf) {
        this.MarcaTlf = MarcaTlf;
    }

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String Problema) {
        this.Problema = Problema;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelf() {
        return Telf;
    }

    public void setTelf(int Telf) {
        this.Telf = Telf;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public NodoCliente getProximo() {
        return proximo;
    }

    public void setProximo(NodoCliente proximo) {
        this.proximo = proximo;
    }
    
    
    
    
    
}
