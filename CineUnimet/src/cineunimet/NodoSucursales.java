
package cineunimet;

import java.io.Serializable;

public class NodoSucursales implements Serializable{
    //Atributos
    private String nombre; 
    private String dir; 
    private ListaPeliculas listaPelis; 
    private ListaSalas listaSalas; 
    private ColaBoletos colaBoletos; 
    
    private NodoSucursales proximo; 
    
    //Constructores, Gets y Sets
    public NodoSucursales()
    {   listaPelis= new ListaPeliculas();
        listaSalas= new ListaSalas();
        colaBoletos= new ColaBoletos();
        proximo=null;
        
        //crearBoletos(); 
    }
    
    public NodoSucursales(String nombre, String dir)
    {   this.nombre = nombre;
        this.dir=dir;
        listaPelis= new ListaPeliculas();
        listaSalas= new ListaSalas();
        colaBoletos=new ColaBoletos();
        proximo=null;
        
        crearBoletos(); 
    }

    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String getDir() {
        return dir;}
    public void setDir(String dir) {
        this.dir = dir;}
    public ListaPeliculas getListaPelis() {
        return listaPelis;}
    public void setListaPelis(ListaPeliculas listaPelis) {
        this.listaPelis = listaPelis;}
    public ListaSalas getListaSalas() {
        return listaSalas;}
    public void setListaSalas(ListaSalas listaSalas) {
        this.listaSalas = listaSalas;}
    public ColaBoletos getColaBoletos() {
        return colaBoletos;}
    public void setColaBoletos(ColaBoletos colaBoletos) {
        this.colaBoletos = colaBoletos;}
    public NodoSucursales getProximo() {
        return proximo;}
    public void setProximo(NodoSucursales proximo) {
        this.proximo = proximo;}
    
    //Metodos
    public void modificar(String nombre, String dir)
    {   this.nombre = nombre; 
        this.dir=dir; 
    }
    
    public NodoSalas asociarSalasPeliculas(String pelicula)
    {   NodoPelicula nodoPeli = listaPelis.buscarPelicula(pelicula);
        NodoSalas sala = listaSalas.buscarDisponible(listaSalas.getCabeza(), nodoPeli.getFormato());
        
        if(sala!=null)
        {    nodoPeli.setAnterior(null);
             nodoPeli.setProximo(null);
             sala.setPelicula(nodoPeli);
             crearBoletosAlAgregarPeli(sala); 
             return sala;
        }else return null;
    }
    
    public NodoSalas desasociarSalasPeliculasSegunPelicula(String pelicula)
    {   NodoSalas sala = listaSalas.buscarPorPelicula(listaSalas.getCabeza(), pelicula);
        if(sala!=null)
        {   sala.setPelicula(null);
            eliminarBoletosAlEliminarPeli(sala); 
            return sala;
            
        }return null;
    }
    
    public void desasociarSalasPeliculasSegunSala(int numero)
    {   if(listaSalas.buscarPorNumero(listaSalas.getCabeza(), numero)!=null)
        {   listaSalas.buscarPorNumero(listaSalas.getCabeza(), numero).setPelicula(null);
            eliminarBoletosAlEliminarPeli(listaSalas.buscarPorNumero(listaSalas.getCabeza(), numero));
        }//ELSE NO EXISTE
    }
    
    public void crearBoletos(){
        NodoSalas sala = listaSalas.getCabeza();
        while (sala != null){
            if(sala.getPelicula() != null)
            {   NodoAsientos nA = sala.getAsientos().peek();
                
                while (nA!=null)
                {   nA = nA.getProximo();
                    NodoBoletos boleto=new NodoBoletos ();
                    colaBoletos.encolar(boleto);
                }
                
            }
        sala=sala.getProximo();
       }
 
    }
    
    public void crearBoletosAlAgregarPeli(NodoSalas sala)
    {   int x= sala.getCapacidad();
        while(x>0)
        {   NodoBoletos nuevo = new NodoBoletos(); 
            colaBoletos.encolar(nuevo); 
            x--;
        }
    }
    
    public void eliminarBoletosAlEliminarPeli(NodoSalas sala)
    {   int x= sala.getCapacidad();
        while(x>0)
        {   colaBoletos.desencolar(); 
            x--;
        }
    }
    
    
    public void comprarBoleto(NodoSalas sala, int num)
    {   PilaAsientos pA = new PilaAsientos(); 
        //pA.setCabeza(sala.getAsientos().peek());
        NodoAsientos nA = sala.getAsientos().peek();
        
        while(nA.getNumero()!= num)
        {   nA= nA.getProximo(); }
        
        nA.setOcupado(true);
       
        colaBoletos.getCabeza().setPelicula(sala.getPelicula().getTitulo());
        colaBoletos.getCabeza().setSala(sala.getNumero());
        nA.setBoleto(colaBoletos.desencolar()); 
    }
    
    public int boletosDisponibles()
    {   NodoSalas aux = listaSalas.getCabeza(); 
        int cont = 0; 
        while(aux!=null)
        {   cont = cont + aux.contarAsientosDisponibles(); 
            aux=aux.getProximo();
        }
        return cont; 
    }
    

}
