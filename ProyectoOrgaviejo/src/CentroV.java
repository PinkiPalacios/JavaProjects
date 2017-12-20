
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Medina
 */
import java.io.*; 
public class CentroV implements Serializable{
    
    private int numCentro;
    private String nombreCentro;
    private String dirCentro;
    private double laCentro;
    private double loCentro;

    public CentroV(int numCentro, String nombreCentro, String dirCentro, double laCentro, double loCentro) {
        this.numCentro = numCentro;
        this.nombreCentro = nombreCentro;
        this.dirCentro = dirCentro;
        this.laCentro = laCentro;
        this.loCentro = loCentro;
    }
    public CentroV(){}

    public int getNumCentro() {
        return numCentro;
    }

    public void setNumCentro(int numCentro) {
        this.numCentro = numCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDirCentro() {
        return dirCentro;
    }

    public void setDirCentro(String dirCentro) {
        this.dirCentro = dirCentro;
    }

    public double getLaCentro() {
        return laCentro;
    }

    public void setLaCentro(double laCentro) {
        this.laCentro = laCentro;
    }

    public double getLoCentro() {
        return loCentro;
    }

    public void setLoCentro(double loCentro) {
        this.loCentro = loCentro;
    }
    
    
    
    
}
