
package metroMobile;

import java.io.Serializable;


public class ListaSucursales implements Serializable{
    
    private NodoSucursales cabeza;
    
    public ListaSucursales(){
        cabeza = null;
    }
    
    public NodoSucursales getCabeza(){
        return cabeza;
    }
    
    public void setCabeza(NodoSucursales cabeza){
        this.cabeza = cabeza;
    }
    
    
    public void agregarPrimero(String Nombre, String gEncargado, String numero){ //pedir nombre, encargado y numero
    
    NodoSucursales nuevo = new NodoSucursales(Nombre, gEncargado, numero);
    
    if (cabeza != null){
    nuevo.setProximo(cabeza);
    cabeza = nuevo;
    }else{
    cabeza = nuevo;
    }
    //Pedir todos los datos de la sucursal
    }
    
    public NodoSucursales buscarPorNombre(NodoSucursales aux, String Nombre){
    
        if (aux != null){
            if(Nombre.equalsIgnoreCase(aux.getNombre())){
                return aux;
            }else{
            return buscarPorNombre(aux.getProximo(), Nombre);
            }
        }else {
            return null;
        }
    }
        
    public NodoSucursales buscarPorEncargado(NodoSucursales aux, String gEncargado){
        
        if(aux != null){
            if(gEncargado.equalsIgnoreCase(aux.getgEncargado())){
                return aux;
            }else{
                return buscarPorEncargado(aux.getProximo(), gEncargado);
            }
        }else{
        return null;
        }
    
    }
    
    public NodoSucursales cerrarSucursal(NodoSucursales aux, String Nombre){
        if(aux != null){
            if(cabeza.getNombre().equals(Nombre)){
                NodoSucursales nodoEliminado = cabeza;
                cabeza = nodoEliminado.getProximo();
                nodoEliminado.setProximo(null);
                return nodoEliminado;
            }else if (aux.getProximo()!=null){
                if(Nombre.equals(aux.getProximo().getNombre())){
                    NodoSucursales nodoEliminado = aux.getProximo();
                    aux.setProximo(nodoEliminado.getProximo());
                    nodoEliminado.setProximo(null);
                    return nodoEliminado;
                }else{
                return cerrarSucursal(aux.getProximo(), Nombre);
                }
            
            } else {
            return null; //La Sucursal No Existe
            }
        
        }else{
        return null; //La Sucursal No Existe
        }
        
    }
    
//    public void AsignarCliente (String Nombre){
//        
//       NodoSucursales aux2 = cabeza;
//       
//       while(aux2.getColaCliente() != null){
//           
//           while(Nombre != aux2.getNombre()){
//           
//               aux2=aux2.getProximo();
//           
//           }
//         
//           NodoCliente cliente = aux2.getColaCliente().desencolar();
//           if(aux2.getListaCTecnicos().getCabeza().getMarcaTlf() == cliente.getMarcaTlf()){
//           
//               if(aux2.getListaCTecnicos()){}
//           
//           }
//       
//       }
//    
//    
//    }
    
    public void asignar(ColaCliente aux, ListaCTecnicos tec){
//    ColaCliente aux=new ColaCliente();
//    ListaCTecnicos tec= new ListaCTecnicos();
    while (aux.getCabeza()!=null){
        
        if(aux.getCabeza().getMarcaTlf().equals(tec.getCabeza().getMarcaTlf())){
            if(tec.getCabeza().getListaClientes().ContarNodo()<=10){
            tec.getCabeza().getListaClientes().agregarPrimero(aux.desencolar());
        
            }else{
        
            tec.getCabeza().getColaEspera().encolar(aux.desencolar());
       
        }}
            else
            {
                tec.setCabeza(tec.getCabeza().getProximo());
                }
        
         
    }
    }
    
    public void asignar3(NodoCliente cli, NodoCTecnicos tec){
        
        NodoCTecnicos ca = tec;
        while(tec.getProximo()!= ca){
        
            if (cli.getMarcaTlf().equals(tec.getMarcaTlf())){
            
                if (tec.getListaClientes().ContarNodo() <= 10){
                
                    tec.getListaClientes().agregarPrimero(cli);
                    break;
                }else {
                
                    tec.getColaEspera().encolar(cli);
                    break;
                }
            
            }else{
            
                //tec.setProximo(tec.getProximo());
                tec = tec.getProximo();
            
            }
        
        }
    
    
    }
    
    
    
    public void asignar2(NodoCTecnicos tec, NodoCliente cli){
    
    if(tec.getListaClientes().ContarNodo()<=10){
        
        
        tec.getListaClientes().agregarPrimero(cli);
       
    }else{
        tec.getColaEspera().encolar(cli);
       
        
    }
  
    }
    
    
    
    
    
    
    }
    

    
    


    
    
    
    

