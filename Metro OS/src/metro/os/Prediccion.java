/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro.os;

/**
 *
 * @author LuisAlejandro
 */
public class Prediccion {
    int procesos;
    int recursos;
    private int c[][];
    private int a[][];    
    private int ca[][];
    private int rVec[];
    private int aVec[]; 
    

    public Prediccion(int[][] c, int[][] a, int[] rVec, int[] aVec, int p, int r) {
        this.procesos=p;
        this.recursos=r;
        
        this.c = c;
        this.a = a;
        
        this.rVec = rVec;
        this.aVec = aVec;
        this.ca= calcCA();
        
    }

    public int[][] getC() {
        return c;
    }

    public void setC(int[][] c) {
        this.c = c;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int[][] getCa() {
        return ca;
    }

    public void setCa(int[][] ca) {
        this.ca = ca;
    }

    public int[] getrVec() {
        return rVec;
    }

    public void setrVec(int[] rVec) {
        this.rVec = rVec;
    }

    public int[] getaVec() {
        return aVec;
    }

    public void setaVec(int[] aVec) {
        this.aVec = aVec;
    }

    
    
    
    public int calcCA()[][]{
        
        int ca[][]= new int[this.procesos][this.recursos];
        
        for (int i = 0; i < this.procesos; i++) {
            for (int j = 0; j < this.recursos; j++) {
                
                ca[i][j]=this.c[i][j]-this.a[i][j];
                
            }
        }
    
    return ca;
    }
}
