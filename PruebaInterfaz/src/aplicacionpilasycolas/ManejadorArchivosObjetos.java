/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacionpilasycolas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Brayan Fernandez
 */
public class ManejadorArchivosObjetos{
    
    public void crearArchivoLista(ListaSimple lista) throws Exception{
        FileOutputStream fileO = null;
            fileO = new FileOutputStream ("archivoLista.DAT");
            ObjectOutputStream output = new ObjectOutputStream (fileO);
            output.writeObject(lista);
            output.close();

    }
    
    public Object obtenerArchivoLista() throws Exception{
        FileInputStream fileI = null;
        ListaSimple lista=null;
        fileI = new FileInputStream ("archivoLista.DAT");
        ObjectInputStream input = new ObjectInputStream (fileI);
        lista = (ListaSimple) input.readObject();
        input.close();
        return lista;
    }
}
