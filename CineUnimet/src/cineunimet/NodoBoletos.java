
package cineunimet;

import java.io.Serializable;

public class NodoBoletos implements Serializable{
    private String pelicula; 
    private int sala; 
    NodoBoletos proximo;
    
    public NodoBoletos(int sala, String pelicula){
    this.sala = sala;
    this.pelicula = pelicula;
    proximo = null;
    }
    
    public NodoBoletos()
    {}

    public NodoBoletos getProximo() {
        return proximo;
    }

    public void setProximo(NodoBoletos proximo) {
        this.proximo = proximo;
    }
    

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int Sala) {
        this.sala = sala;
    }    
    
}
