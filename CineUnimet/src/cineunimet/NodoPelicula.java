
package cineunimet;

import java.io.Serializable;

public class NodoPelicula implements Serializable{
    //Atributos
    private String titulo; 
    private int year; 
    private String director; 
    private boolean enCartelera; 
    private String formato; 
    
    private NodoPelicula proximo; 
    private NodoPelicula anterior;
    
    //Gets, Sets y Constructor
    public NodoPelicula(String titulo, int year, String director, boolean enCartelera, String formato)
    { this.titulo=titulo;
      this.director=director;
      this.year=year;
      this.enCartelera=enCartelera;
      this.formato=formato;
      proximo=null;
      anterior=null;
    }
    
    public NodoPelicula(){}
   
    public String getTitulo() {
        return titulo;}
    public int getYear() {
        return year;}
    public String getDirector() {
        return director;}
    public boolean isEnCartelera() {
        return enCartelera;}
    public String getFormato() {
        return formato;}
    public NodoPelicula getProximo() {
        return proximo;}
    public NodoPelicula getAnterior() {
        return anterior; }
    public void setTitulo(String titulo) {
        this.titulo = titulo;}
    public void setYear(int year) {
        this.year = year;}
    public void setDirector(String director) {
        this.director = director;}
    public void setEnCartelera(boolean enCartelera) {
        this.enCartelera = enCartelera;}
    public void setFormato(String formato) {
        this.formato = formato;}
    public void setProximo(NodoPelicula proximo) {
        this.proximo = proximo;}
    public void setAnterior(NodoPelicula anterior) {
        this.anterior = anterior;}
    
    //Metodos
    public void modificar(String titulo, int year, String director, boolean enCartelera, String formato)
    { this.titulo=titulo;
      this.director=director;
      this.year=year;
      this.enCartelera=enCartelera;
      this.formato=formato;
    }

    
    
}
