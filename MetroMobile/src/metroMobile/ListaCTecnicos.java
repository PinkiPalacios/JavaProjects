
package metroMobile;

import java.io.Serializable;


public class ListaCTecnicos implements Serializable{
    
    private NodoCTecnicos cabeza;
    
    public ListaCTecnicos(){
        this.cabeza = null;
    }

    public NodoCTecnicos getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCTecnicos cabeza) {
        this.cabeza = cabeza;
    }
    
    public void agregarPrimero (String MarcaTlf, String Nombre){
    
        NodoCTecnicos nuevo = new NodoCTecnicos(MarcaTlf, Nombre);
        
        if (cabeza == null){
            cabeza = nuevo;
            cabeza.setProximo(cabeza);
        }else{
            nuevo.setProximo(cabeza);
            NodoCTecnicos aux = cabeza;
            while(aux.getProximo() != cabeza){
                aux = aux.getProximo();
            }
            aux.setProximo(nuevo);
            cabeza = nuevo;
        }
    }
    
    public NodoCTecnicos BuscarTecnico (String MarcaTlf){
    
        NodoCTecnicos aux = cabeza;
        int cont=0;
        
        if (aux != null){
            do{
                if(aux.getMarcaTlf().equalsIgnoreCase(MarcaTlf)){
                return aux;
                }else {
                aux = aux.getProximo();
                }
            }while (aux != cabeza && aux != null);
        
            return null;

        }else{return null;}
        
    }
}
