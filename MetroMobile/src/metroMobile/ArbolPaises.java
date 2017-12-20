
package metroMobile;

import java.io.Serializable;
import java.util.Random;

public class ArbolPaises implements Serializable{
    
    private NodoPaises raiz;
    
    public ArbolPaises (){
        raiz = null;
    }

    public NodoPaises getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoPaises raiz) {
        this.raiz = raiz;
    }
    
    public void AgregarNumero (NodoPaises aux){
        
        if (raiz == null){
            aux.setNumero(98);
        }
        int x = (int)(Math.random()*(196-1)+1);
        while (compararNumero(raiz,x)!=null){
        x = (int) (Math.random()*(196-1)+1);
        }
        aux.setNumero(x);
        
    
    }
    
    public NodoPaises compararNumero(NodoPaises aux, int num){
    
        if (aux != null){
            if (aux.getNumero() == num){
                return aux;
            }else if (aux.getNumero()>num){
                return compararNumero(aux.getnIzquierdo(),num);
            }else{
                return compararNumero(aux.getnDerecho(),num);
            }
            
        }else{
            return null;
                }
        }
    
    public NodoPaises compararNombre(NodoPaises aux, String nombre){
    
        if (aux != null){
            if (aux.getNombre().equalsIgnoreCase(nombre)){
            return aux;
            } else {
            
                NodoPaises aux1 = compararNombre(aux.getnIzquierdo(),nombre);
                NodoPaises aux2 = compararNombre(aux.getnDerecho(),nombre);
                
                if (aux1 != null){
                return aux1;
                }else{
                return aux2;
                }
            }
        }else {return null;}
    }
    
    public void Insertar (NodoPaises aux, NodoPaises nuevo){
    
        if (raiz == null){
        raiz = nuevo;
        raiz.setPadre(null);
        }else if (nuevo.getNumero()<aux.getNumero()){
            if (aux.getnIzquierdo() == null){
                aux.setnIzquierdo(nuevo);
                aux.getnIzquierdo().setPadre(aux);
            }else{
            Insertar(aux.getnIzquierdo(), nuevo);
            }
            
        }else if (nuevo.getNumero()>aux.getNumero()){
                if (aux.getnDerecho() == null){
                    aux.setnDerecho(nuevo);
                    aux.getnDerecho().setPadre(aux);
                    }else {
                    Insertar(aux.getnDerecho(), nuevo);
                    }
                }
        }
    
    
    
    
    public void crearPais(String nombre){
    
        NodoPaises nuevo = new NodoPaises(nombre);
        AgregarNumero(nuevo);
        Insertar (raiz, nuevo);
    }
    
    public NodoPaises mostrar (NodoPaises aux){
    
        if (aux != null){
        mostrar (aux.getnDerecho());
        mostrar (aux.getnIzquierdo());
        return aux;
        }
        
    return null;
    }
    public boolean eliminarnodo (NodoPaises nodo){
    if(nodo.getNumero()==155){
    nodo.setNombre(null);
    
    nodo.setSucursales(null);
    return true;
    } 
    boolean tienehijoderecho= nodo.getnDerecho()!=null;
    boolean tienehijoizquierdo= nodo.getnIzquierdo()!=null;
    
    if(!tienehijoderecho && !tienehijoizquierdo){
    return (eliminarcaso1(nodo));
    }else if(tienehijoderecho && !tienehijoizquierdo){
    return (eliminarcaso2(nodo));}
    else if(!tienehijoderecho && tienehijoizquierdo){
    return (eliminarcaso2(nodo));}
    else if(tienehijoderecho && tienehijoizquierdo){
    return (eliminarcaso3(nodo));}
     
    return false;
    
    
}
    
    
    /* public void Insertar (NodoPaises aux, NodoPaises nuevo){
    
        if (aux == null){
        raiz = nuevo;
        }else if (Integer.parseInt(nuevo.getNombre())<Integer.parseInt(aux.getNombre())){
            if (aux.getnIzquierdo() == null){
                aux.setnIzquierdo(nuevo);
            }else{
            Insertar(aux.getnIzquierdo(), nuevo);
            }
            
        }else if (Integer.parseInt(nuevo.getNombre())>Integer.parseInt(aux.getNombre())){
                if (aux.getnDerecho() == null){
                    aux.setnDerecho(nuevo);
                    }else {
                    Insertar(aux.getnDerecho(), nuevo);
                    }
                }
        }*/

    private boolean eliminarcaso1(NodoPaises nodo) {
        NodoPaises hijoI=nodo.getPadre().getnIzquierdo();
        NodoPaises hijoD=nodo.getPadre().getnDerecho();
        
        if (hijoI==nodo){
        nodo.getPadre().setnIzquierdo(null);
        return true;
        }
        else if(hijoD==nodo)
        {
    nodo.getPadre().setnDerecho(null);
    return true;
    }
    return false;}
        
    

private boolean eliminarcaso2(NodoPaises nodo){
NodoPaises hijoI=nodo.getPadre().getnIzquierdo();
NodoPaises hijoD=nodo.getPadre().getnDerecho();

NodoPaises HijoActual=nodo.getnIzquierdo();
if (HijoActual==null){
HijoActual=nodo.getnDerecho();
}
   if(hijoI==nodo){
   nodo.getPadre().setnIzquierdo(HijoActual);
   nodo.setnDerecho(null);
   nodo.setnIzquierdo(null);
   return(true);
   } else if(hijoD==nodo){
   nodo.getPadre().setnIzquierdo(HijoActual);
   nodo.setnDerecho(null);
   nodo.setnIzquierdo(null);
   return true;
   }
    
    
    
    return false;
}
    
private boolean eliminarcaso3 (NodoPaises nodo){
NodoPaises ND=Sucesor(nodo.getnDerecho());
if(ND!=null){
nodo.setNumero(ND.getNumero());
nodo.setNombre(ND.getNombre());
nodo.setSucursales(ND.getSucursales());

eliminarnodo(ND);
return true;
}

return false;

}

private NodoPaises Predecesor(NodoPaises nodo){

    NodoPaises aux=nodo.getnIzquierdo();
    
    while(aux.getnDerecho()!=null){
aux=aux.getnDerecho();
}
    return aux;
}

private NodoPaises Sucesor (NodoPaises nodo){

if(nodo.getnIzquierdo()!=null){
    
 return Sucesor(nodo.getnIzquierdo());   
}
return(nodo);




} 
}    
    

