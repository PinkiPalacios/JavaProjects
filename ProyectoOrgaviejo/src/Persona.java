/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class  Persona {
    private int CI;
    private String nombre;
    private String apellido;
    private double LA;
    private double LO;
    private int dia;
    private int mes;
    private int año;
    
    
    
     public Persona(){}
     
    

    
    public Persona(int CI, String nombre, String apellido, double LA, double LO, int dia, int mes, int año) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.LA = LA;
        this.LO = LO;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getLA() {
        return LA;
    }

    public void setLA(double LA) {
        this.LA = LA;
    }

    public double getLO() {
        return LO;
    }

    public void setLO(double LO) {
        this.LO = LO;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
    
}
