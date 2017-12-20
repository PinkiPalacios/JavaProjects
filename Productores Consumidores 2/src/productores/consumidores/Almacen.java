/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productores.consumidores;

/**
 *
 * @author Estudiantes
 */
public class Almacen {
    int[] vec;
    int tam;
    private int apuntP;
    private int apuntC;
    
    public Almacen(int tam){
        this.tam=tam;
        vec = new int[tam];
        apuntP=0;
        apuntC=0;
    }

    public int getTam() {
        return tam;
    }

    public int getVec(int i) {
        return vec[i];
    }

    public void setVec(int val) {
        if(val==1){
            this.vec[apuntP] = val;
            apuntP=(apuntP+1)%tam;
        }
        else{
            this.vec[apuntC] = val;
            apuntC=(apuntC+1)%tam;
        }
    }
    
    public void imprimir(){
        for(int i=0; i<tam; i++){
            System.out.print(vec[i]+" ");
        }
        System.out.println("");
    }
    
    
}
