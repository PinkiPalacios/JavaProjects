import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Buffer {
    private String[] BTrenza = new String [50];      //String de Buffer de Trenza
    private String[] BSuela = new String [12];    //String de Buffer de Suela
    private String[] BPlantilla = new String [7];//String de Buffer de Plantilla
    private int pVacia;         //Puntero    
    private int pLLena;         //Puntero
    private String name;
    
    int tipo1;
    int tipo2;

   
    
    Buffer(String name){
        pVacia=0; 
        pLLena=0;
        this.name=name;
//    ArchivoTexto at = new ArchivoTexto();
//    
//    tipo1 = at.ExtraerTipo1();
//    tipo2 = at.ExtraerTipo2();
    }
    
    Buffer(){
       
   }
    synchronized public void CrearTrenza(String Trenza){ //Se crea el producto
      BTrenza[pVacia]=Trenza;  //Se introduce componente en la posicion vacia
     
      pVacia= (pVacia+1) % BTrenza.length; 

    }
    
    
    synchronized public String ConsumirTrenza(){  //Se consume el producto
        String Trenza=BTrenza[pLLena];       //Se recibe el componente en la posicion llena
        BTrenza[pLLena] = null;
        pLLena=(pLLena+1)%BTrenza.length;      //Mueve el apuntador a la proxima posicion llena
        return Trenza;
    }    
    
    synchronized public void CrearSuela(String Suela)   //Se crea el producto
    { 
      BSuela[pVacia]=Suela; //Se introduce componente en la posicion vacia
      pVacia= (pVacia+1) % BSuela.length;   //Mueve el apuntador a la proxima posicion vacia
        

    }
    
    
    synchronized public String ConsumirSuela()  //Se consume el producto
    {  
        String Suela=BSuela[pLLena];//Se recibe el componente en la posicion llena
        BSuela[pLLena] = null; 
        pLLena=(pLLena+1)%BSuela.length;      //Mueve el apuntador a la proxima posicion llena
        return Suela;
    }    
    
    synchronized public void CrearPlantilla(String Plantilla)   //Se crea el producto
    { 
      BPlantilla[pVacia]=Plantilla;                          //Se introduce componente en la posicion vacia
      pVacia= (pVacia+1) % BPlantilla.length;                 //Mueve el apuntador a la proxima posicion vacia
    }
    
    
    synchronized public String ConsumirPlantilla()  //Se consume el producto
    {  
        String Plantilla=BPlantilla[pLLena];       //Se recibe el componente en la posicion llena
        BPlantilla[pLLena] = null;
        pLLena=(pLLena+1)%BPlantilla.length;      //Mueve el apuntador a la proxima posicion llena
        return Plantilla;
    }
    
    public boolean estaVacioTrenza(){
        if (BTrenza[pVacia] == null) {
            return true;
        }else{
            return false;
        }
    }

    public boolean estaVacioSuela(){
        if (BSuela[pVacia] == null) {
            return true;
        }else{
            return false;
        }
    }
    public boolean estaVacioPlantilla(){
        if (BPlantilla[pVacia] == null) {
            return true;
        }else{
            return false;
        }
    }
    public boolean estaLlenoTrenzaT2(){
        if(BTrenza[pLLena] != null && BTrenza[(pLLena+1)%BTrenza.length] != null && BTrenza[(pLLena+2)%BTrenza.length] != null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaLlenoTrenzaT1(){
        
        
        if(BTrenza[pLLena] != null && BTrenza[(pLLena+1)%BTrenza.length] != null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaLlenoSuela(){
        if(BSuela[pLLena] != null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean estaLlenoPlantilla(){
        if(BPlantilla[pLLena] != null){
            return true;
        }else{
            return false;
        }
    }

    public int getTipo1() {
        return tipo1;
    }

    public void setTipo1(int tipo1) {
        this.tipo1 = tipo1;
    }

    public int getTipo2() {
        return tipo2;
    }

    public void setTipo2(int tipo2) {
        this.tipo2 = tipo2;
    }
    
    
}
