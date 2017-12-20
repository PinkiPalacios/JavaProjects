/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.bici;

/**
 *
 * @author LuisAlejandro
 */

import Interfaz.pantalla;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoTexto {
    int tiempo;
    int capacidadR;
    int capacidadM;
    int pIRuedas;
    int pIMarcos;
    int pMRuedas;
    int pMMArcos;
    

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCapacidadR() {
        return capacidadR;
    }

    public void setCapacidadR(int capacidadR) {
        this.capacidadR = capacidadR;
    }

    public int getCapacidadM() {
        return capacidadM;
    }

    public void setCapacidadM(int capacidadM) {
        this.capacidadM = capacidadM;
    }

    public int getpIRuedas() {
        return pIRuedas;
    }

    public void setpIRuedas(int pIRuedas) {
        this.pIRuedas = pIRuedas;
    }

    public int getpIMarcos() {
        return pIMarcos;
    }

    public void setpIMarcos(int pIMarcos) {
        this.pIMarcos = pIMarcos;
    }

    public int getpMRuedas() {
        return pMRuedas;
    }

    public void setpMRuedas(int pMRuedas) {
        this.pMRuedas = pMRuedas;
    }

    public int getpMMArcos() {
        return pMMArcos;
    }

    public void setpMMArcos(int pMMArcos) {
        this.pMMArcos = pMMArcos;
    }

    public int geteI() {
        return eI;
    }

    public void seteI(int eI) {
        this.eI = eI;
    }

    public int geteM() {
        return eM;
    }

    public void seteM(int eM) {
        this.eM = eM;
    }

    public String[] getPrueba() {
        return prueba;
    }

    public void setPrueba(String[] prueba) {
        this.prueba = prueba;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }
    int eI;
    int eM;
    
     
    private String prueba[];
    private FileReader fr;
    private File archivo= new File("Archivo.txt");
    private BufferedReader br;
 
    
    public  ArchivoTexto() throws IOException{
         
        
         prueba= new String[19];
         try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        br= new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            
            int cant=0;
            
            char[] aux=linea.toCharArray();
            this.prueba=linea.split(" ",19);
          
            for (int i = 0; i< prueba.length; i++) {
                //System.out.println(prueba[i]);
            }
            
//            for(int i=1; i<aux.length;i++){
//                if(aux[i]!=' '){
//                    for (int j = 0; j < 7; j++) {
//                        this.valores[j]=Character.getNumericValue(aux[i]);
//                        
                        
                        
                    }
                   
                    // cant+=Character.getNumericValue(aux[i])*Math.pow(10, aux.length-1-i);
        
        inicializar(prueba);
        this.vec=prueba;
     
                } 
    String vec[];
    public void inicializar (String vec[]){
    
      //  System.out.println(vec[0]);
    tiempo=Integer.parseInt(vec[0]);
    capacidadR=Integer.parseInt(vec[1]);
    capacidadM=Integer.parseInt(vec[2]);
    pIRuedas=Integer.parseInt(vec[3]); //ruedas 3
    pIMarcos=Integer.parseInt(vec[4]);  //marcos 4
    pMRuedas=Integer.parseInt(vec[5]);
    pMMArcos=Integer.parseInt(vec[6]);
    eI=Integer.parseInt(vec[7]);
    eM=Integer.parseInt(vec[8]);
    
       
    
    }
    
    
    
    
}
