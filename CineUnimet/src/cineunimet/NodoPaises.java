
package cineunimet;

import java.io.*;

public class NodoPaises implements Serializable{
    private int numero; 
    private ListaSucursales sucursales; 
    private String nombre; 
    private NodoPaises nDerecho;
    private NodoPaises nIzquierdo; 
     
    //Gets, Sets y Constructor
     public NodoPaises(String nombre)
     {  this.nombre = nombre;
        sucursales = new ListaSucursales(); 
        nDerecho=null;
        nIzquierdo=null;
     }
     
     public NodoPaises(){}

    public ListaSucursales getSucursales() {
        return sucursales;}
    public void setSucursales(ListaSucursales sucursales) {
        this.sucursales = sucursales;} 
     public void setNombre(String nombre)
     {  this.nombre=nombre;}
     public String getNombre()
     {  return nombre;}
     public void setNumero(int numero)
     {  this.numero=numero;}
     public int getNumero()
     {  return numero;}
     public void setNDerecho(NodoPaises nDerecho)
     {  this.nDerecho=nDerecho;}
     public NodoPaises getNDerecho()
     {  return nDerecho;}
     public void setNIzquierdo(NodoPaises nIzquierdo)
     {  this.nIzquierdo= nIzquierdo;}
     public NodoPaises getNIzquierdo()
     {  return nIzquierdo;}
    
}
