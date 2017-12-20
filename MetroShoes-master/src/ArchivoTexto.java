/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bernardo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArchivoTexto {
    
    public ArrayList<Integer> CrearArchivo()
    {
        Scanner file = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			file = new Scanner(new File("MSdatos.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(file.hasNext()){
			if (file.hasNextInt()) list.add(file.nextInt());
			else file.next();
		}
		
		return list;
    }
    
    //YOLO
    public int ExtraerTipo1()
    {
        ArrayList<Integer> lista = CrearArchivo();
        int var = lista.get(0);
        return var;
    }
    
    public int ExtraerTipo2()
    {
        ArrayList<Integer> lista = CrearArchivo();
        int var = lista.get(1);
        return var;
    }
    
}
