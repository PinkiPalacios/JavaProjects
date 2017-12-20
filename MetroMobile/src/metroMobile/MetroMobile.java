/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroMobile;

import java.io.Serializable;

public class MetroMobile implements Serializable{
   ArbolPaises arbol;
   
   public MetroMobile()
   {   }

    public ArbolPaises getArbol() {
        return arbol;
    }
    public void setArbol(ArbolPaises arbol) {
        this.arbol = arbol;
    }
    
    public static void main(String args[])
   {}
    
}

