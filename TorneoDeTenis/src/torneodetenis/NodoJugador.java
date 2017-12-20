package torneodetenis;

public class NodoJugador 
{
    private NodoJugador HD, HI;
    private String nombre;
    private int cedula;
    private String sexo;
    private String equipo;

    public NodoJugador() {}

    
    public NodoJugador(String nombre, int cedula, String sexo, String equipo) 
    {
        this.HD = null;
        this.HI = null;
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.equipo = equipo;
    }

    public NodoJugador getHD() {
        return HD;
    }

    public void setHD(NodoJugador HD) {
        this.HD = HD;
    }

    public NodoJugador getHI() {
        return HI;
    }

    public void setHI(NodoJugador HI) {
        this.HI = HI;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public void mostrar()
    {
        System.out.println("Nombre: " + nombre
                         + "Cedula: " + cedula
                         + "Equipo: " + equipo
                         + "Sexo: " + sexo);
    }  
}
