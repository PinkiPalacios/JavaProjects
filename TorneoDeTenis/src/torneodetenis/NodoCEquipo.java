package torneodetenis;



public class NodoCEquipo
{
    private NodoCEquipo proximo;
    private LSCategorias ls_Categorias;
    private String nombreEquipo;

    public NodoCEquipo() {}

    public LSCategorias getLs_Categorias() {
        return ls_Categorias;
    }

    public void setLs_Categorias(LSCategorias ls_Categorias) {
        this.ls_Categorias = ls_Categorias;
    }

    public NodoCEquipo(String nombreEquipo) 
    {
        this.proximo = null;
        this.nombreEquipo = nombreEquipo;
    }

    public NodoCEquipo getProximo() {
        return proximo;
    }

    public void setProximo(NodoCEquipo proximo) {
        this.proximo = proximo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    public void mostrar(){
        System.out.println("Equipo: " + nombreEquipo);
    }
}
