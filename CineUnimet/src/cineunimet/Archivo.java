package cineunimet;

import java.io.*;

public class Archivo {
    
    public void crearArchivoLista(ArbolPaises pais) throws Exception{
        FileOutputStream fileO = null;
            fileO = new FileOutputStream ("archivo.DAT");
            ObjectOutputStream output = new ObjectOutputStream (fileO);
            output.writeObject(pais);
            output.close();

    }
    
    public Object obtenerArchivoLista() throws Exception{
        FileInputStream fileI = null;
            ArbolPaises pais=null;
            fileI = new FileInputStream ("archivo.DAT");
            ObjectInputStream input = new ObjectInputStream (fileI);
            pais = (ArbolPaises) input.readObject();
            input.close();
            return pais;
    }
    
}
