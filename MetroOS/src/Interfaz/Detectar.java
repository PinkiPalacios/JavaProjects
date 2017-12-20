/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuisAlejandro
 */
public class Detectar {
     private int[][] a;
     private int[][] r;
    private int w[];
    private int avl[];
    private boolean marcas[];
    int np;
    int nr;
    private int fElimidadas;
    JTable tabla;
    DefaultTableModel modelo;
    
    
    public Detectar (int a[][], int r[][], int np, int nr,int avl[],JTable tabla,DefaultTableModel modelo){
    this.a=a;
    this.r=r;
    this.np=np;
    this.nr=nr;
  
    this.marcas=new boolean [np];
    this.avl=avl;
      this.w=avl;
    this.fElimidadas=0;
    this.tabla=tabla;
    this.modelo=modelo;
    }

    public boolean[] getMarcas() {
        return marcas;
    }

    public void setMarcas(boolean[] marcas) {
        this.marcas = marcas;
    }
    
    
    
    public void llenarFalse (){
    
        for (int i = 0; i < this.marcas.length; i++) {
            marcas [i]=false;
        }
    
    
    }
    
    public void hayAbrazoMortal(){
    llenarFalse();    
    marcarCeros();
    Marcar();
    int cont=0;
       
    cont=contarMarcas();
    
    
    
        
        if(cont!=np){
        System.out.println("Hay interbloqueo");
        recuperar();
        }
    
    }
    public int contarMarcas(){
    int cont=0;
        for (int i = 0; i <np; i++) {
            if (marcas[i]==true){
            cont++;
            
            }
        }
    
    
    
    return cont;
    }
    
    public void Marcar(){
        int cont=0;
        for (int i = 0; i < np; i++) {
            for (int j = 0; j < nr; j++) {
                
                if(r[i][j]<=w[j]){
                    cont++;
                    
                    if(cont==nr){
                        
                marcas[i]=true;
                sumarW(i);
                    
                    }
                
                }
                
                
            }
            cont=0;
        }
    
    
    
    }
    
    public void sumarW (int i){
    
        for (int j = 0; j < nr; j++) {
            w[j]=w[j]+a[i][j];
            
        }
    
    
    }
    
    public void marcarCeros (){
    int cont=0;
        for (int i = 0; i < this.np; i++) {
            for (int j = 0; j < this.nr; j++) {
                if(a[i][j]==0){
                    cont++;
                   
                    if(cont==nr){
                       
                marcas[i]=true;}
                
                }
                
            }
            cont=0;
        }
    
    
    }
    
    public void recuperar(){
    
        int cont=0;
        for (int i = 0; i < marcas.length; i++) {
            
            if (marcas[i]==false){
            System.out.println("Proceso "+cont+" Interbloqueado");
            cont ++;
            
            
           modelo.removeRow(i);
           tabla.setModel(modelo);
           
           
           this.marcas=actMarcas(i);
           //this.np--;
           i=-1; 
                
            }else{
                System.out.println("Proceso "+cont+ " no tiene interbloqueo");
                cont ++;
            }
            
            
        }
    
    
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    
    
    public boolean[] actMarcas(int f){
    boolean nuevo[]= new boolean[marcas.length-1];
    boolean yaPaso=false;
        for (int i = 0; i < marcas.length; i++) {
            
            if(i!=f && !yaPaso){
            nuevo[i]=marcas[i];
   
            }else if(i!=f && yaPaso){
            
            nuevo[i-1]=marcas[i];
            }else if (i==f){
            yaPaso=true;
            }
            
        }
    
        
        return nuevo;
}
    
    
}
