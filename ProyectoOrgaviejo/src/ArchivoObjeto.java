
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*; 

public class ArchivoObjeto implements Serializable {
    
 public void Escribir(Persona ve) throws Exception{
 FileOutputStream fos=new FileOutputStream("archivo.DAT");
 ObjectOutputStream output=new ObjectOutputStream(fos);
 output.writeObject(ve);

 output.close();
 }   

 
public Persona leer()throws Exception{
FileInputStream fos = new FileInputStream("archivo.DAT");
ObjectInputStream input = new ObjectInputStream(fos);
Persona ve=(Persona)input.readObject(); 
input.close();
return ve;
}


    
}
