/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author ingri
 */
public class Banquero {
    private int[][] A;
    private int[][] C;
    private int[][] CA;
    private int[][] Disponible;
    int vecD[];
    int vecR[];
    int np;
    int nr;
    int cantidadBloqueados=0;
    boolean esSeguro;
    boolean bloqueados[];
    int conttodo=0;
    
    public Banquero(int maA[][],int maC[][],int vecD[],int vecR[],int nP,int nR, int avail[][]){
    this.A=maA;
    this.C=maC;
    this.np=nP;
    this.nr=nR;
    //this.maCA=new int[nP][nR+1];
    //this.maCA=calcCA();
    this.vecD=vecD;
    this.vecR=vecR;
    this.bloqueados=new boolean[this.np];
    this.Disponible=avail;
    }
    
     private int[][] calc_CA(){
       for(int i=0;i<np;i++)
         for(int j=0;j<nr;j++)  
          CA[i][j]=C[i][j]-A[i][j];
        
       return CA;
    }

    public int getCantidadBloqueados() {
        return cantidadBloqueados;
    }

    public void setCantidadBloqueados(int cantidadBloqueados) {
        this.cantidadBloqueados = cantidadBloqueados;
    }
  
    private boolean validarFila(int i){
   
       for(int j=0;j<nr;j++) 
       if(Disponible[0][j]<CA[i][j]){
           bloqueados[i]=true;
          return false;
          
       }
         bloqueados[i]=false;
    return true;
    }
 
    public void isSafe(){
        
       this.CA=new int [this.np][this.nr];
       
       calc_CA();
       boolean listo[]=new boolean[np];
       int j=0;
 
       while(j<np){ 
       boolean allocated=false;
       for(int i=0;i<np;i++){//-1
        if(!listo[i] && validarFila(i)){  
            for(int k=0;k<nr;k++){ //-2
            Disponible[0][k]=Disponible[0][k]-CA[i][k]+C[i][k];}//-2
         System.out.println("Proceso Asignado: "+i);   
         allocated=listo[i]=true;
               j++;
             }else{
        
            
                if(bloqueados[i]=true && !listo[i]){
                    System.out.println("El proceso "+ i +" se ha bloqueado" );
                    conttodo++;
                this.cantidadBloqueados++;
                }
            
        
        }
       }//-1
          if(!allocated) break;  
       }
       if(j==np)  
        System.out.println("\nAsignados de forma segura");
       else
        System.out.println("No se puede conceder la solicitud de forma segura");
    }
     
   
    
   
    
    
    
//    public int[][] calcCA(){
//           int ca[][]= new int[this.numProcesos][this.numRecursos];
//           
////           for (int i = 0; i < numProcesos; i++) {
////            ca[i][0]=this.maA[i][0];
////       }
//           
//        for (int i = 0; i < numProcesos; i++) {
//            for (int j = 0; j < numRecursos ; j++) {
//               // System.out.print(maC[i][j]);
//               ca[i][j]= maC[i][j] - maA[i][j];
//              // System.out.print(ca[i][j]);
//               
//            }
//            
//        }
//
//        //return ca;
//
//    return this.maCA= ca;
//}
//    
//    public boolean chequear (int i){
//       
//        for (int j = 0; j < numRecursos; j++) {
//            if(vecD[j]<maCA[i][j]){
//            return false;
//            
//            }
//        }
//    
//        return true;
//    }
//    public void llenarBloqueados(){
//    
//        for (int i = 0; i < this.bloqueados.length; i++) {
//            this.bloqueados[i]=false;
//        }
//    
//    
//    }
//    public int contarBloqueados(){
//    int n=0;
//    
//        for (int i = 0; i <this.bloqueados.length; i++) {
//            if(bloqueados[i]=true){
//            
//            n++;
//            }
//        }
//    
//    
//    return n;
//    }
//    
//    
//    
//  public void esSeguro(){
//         calcCA();
//        boolean listo[]= new boolean [numProcesos];    
//        int j=0;
//        
//        while (j<numProcesos){
//            boolean asignado = false;
//               for (int i = 0; i <  numProcesos; i++) {
//                if (!listo[i] && chequear(i)) {
//                
//                    for (int k = 0; k < numRecursos; k++) {
//                        vecD[k]=vecD[k]-maCA[i][k]+ maC[i][k];
//                        
//                    }
//                    System.out.println("Proceso asignado: " +i);
//                    asignado=listo[i]=true;
//                    j++;
//                }
//                   
//                   
//            }
//               
//        //33027
//               
//        if(!asignado){
//        break;
//        }
//        
//        
//        }
//        if (j == numProcesos){
//            System.out.println("Asignado de forma segura");
//        }else {
//            System.out.println("No se puede asignar de forma segura");
//        
//        }
//    
//    }
    
    
}
