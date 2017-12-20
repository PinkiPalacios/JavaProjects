/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Logica;
//
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.io.*;
//import java.util.concurrent.Semaphore;
//import Pantalla.*;
///**
// *
// * @author LuisAlejandro
// */
//public class Fabrica {
//    
//    
//    public Fabrica (Pantalla pan){
//    
//    this.miPan=pan;
//    
//    }
//    
//
//    public Ensambladores getEns() {
//        return ens;
//    }
//
//    public void setEns(Ensambladores ens) {
//        this.ens = ens;
//    }
//
//    public Almacen getMarcos() {
//        return marcos;
//    }
//
//    public void setMarcos(Almacen marcos) {
//        this.marcos = marcos;
//    }
//
//    public Almacen getRuedas() {
//        return ruedas;
//    }
//
//    public void setRuedas(Almacen ruedas) {
//        this.ruedas = ruedas;
//    }
//
//    public Productor getpMar() {
//        return pMar;
//    }
//
//    public void setpMar(Productor pMar) {
//        this.pMar = pMar;
//    }
//
//    public Productor getpRue() {
//        return pRue;
//    }
//
//    public void setpRue(Productor pRue) {
//        this.pRue = pRue;
//    }
//
//    public Cronometrador getCro() {
//        return cro;
//    }
//
//    public void setCro(Cronometrador cro) {
//        this.cro = cro;
//    }
//
//    public Contador getCont() {
//        return cont;
//    }
//
//    public void setCont(Contador cont) {
//        this.cont = cont;
//    }
//
//    public Presidente getPresi() {
//        return presi;
//    }
//
//    public void setPresi(Presidente presi) {
//        this.presi = presi;
//    }
//
//    public File getArchivo() {
//        return archivo;
//    }
//
//    public void setArchivo(File archivo) {
//        this.archivo = archivo;
//    }
//
//    public BufferedReader getBr() {
//        return br;
//    }
//
//    public void setBr(BufferedReader br) {
//        this.br = br;
//    }
//
//    public FileReader getFr() {
//        return fr;
//    }
//
//    public void setFr(FileReader fr) {
//        this.fr = fr;
//    }
//
//    public String[] getPrueba() {
//        return prueba;
//    }
//
//    public void setPrueba(String[] prueba) {
//        this.prueba = prueba;
//    }
//
//    public Semaphore getSemaProductores() {
//        return semaProductores;
//    }
//
//    public void setSemaProductores(Semaphore semaProductores) {
//        this.semaProductores = semaProductores;
//    }
//
//    public Semaphore getSemaConsumidores() {
//        return semaConsumidores;
//    }
//
//    public void setSemaConsumidores(Semaphore semaConsumidores) {
//        this.semaConsumidores = semaConsumidores;
//    }
//    private Cronometrador cro;
//    private Contador cont;
//    private Presidente presi;
//    
//    
//    
//    public int[] getValores() {
//        return valores;
//    }
//
//    public void setValores(int[] valores) {
//        this.valores = valores;
//    }
//    
//    
//    
//    
//     public void archivoTexto() throws IOException{
//         valores=new int [7];
//        
//         prueba= new String[7];
//         try {
//            fr = new FileReader(archivo);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        br= new BufferedReader(fr);
//        String linea;
//        while((linea=br.readLine())!=null){
//            
//            int cant=0;
//            
//            char[] aux=linea.toCharArray();
//            this.prueba=linea.split(" ",7);
//            
//            for (int i = 0; i< prueba.length; i++) {
//                System.out.println(prueba[i]);
//            }
//            
////            for(int i=1; i<aux.length;i++){
////                if(aux[i]!=' '){
////                    for (int j = 0; j < 7; j++) {
////                        this.valores[j]=Character.getNumericValue(aux[i]);
////                        
//                        
//                        
//                    }
//                   
//                    // cant+=Character.getNumericValue(aux[i])*Math.pow(10, aux.length-1-i);
//        inicializar();
//                } 
//     
//     
//     
//     
//            
////            for(int i=0; i<cant; i++)
////                pedidos.add(Character.getNumericValue(aux[0]));
//
//
//
//
//public void inicializar (){
//
//           semaProductores=new Semaphore(0);
//          semaConsumidores=new Semaphore(0);
//
////    ens;
//   marcos= new Almacen (Integer.parseInt(this.prueba[2]));
////    ruedas;
//    pMar = new Productor (marcos,  3,  Integer.parseInt(this.prueba[0]), semaProductores,  semaConsumidores , Integer.parseInt(this.prueba[3]), this.miPan);
////    pRue;
//    
//    
//
//}
//}        
        
        
        
         

     

    
   