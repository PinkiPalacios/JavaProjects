
package cineunimet;

import java.io.Serializable;

public class NodoAsientos implements Serializable{
    private int numero; 
    private boolean ocupado;
    private NodoBoletos boleto = new NodoBoletos(); 
    private NodoAsientos proximo;

    public NodoAsientos(int numero) 
    {   this.numero= numero; 
        ocupado=false;
        proximo=null;
        boleto = null;
        
    }

    public NodoBoletos getBoleto() {
        return boleto;
    }

    public void setBoleto(NodoBoletos boleto) {
        this.boleto = boleto;
    }
    
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public NodoAsientos getProximo() {
        return proximo;
    }
    public void setProximo(NodoAsientos proximo) {
        this.proximo = proximo;
    }
    
    
    
    
    
}
