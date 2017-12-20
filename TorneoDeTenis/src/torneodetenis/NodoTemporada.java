package torneodetenis;

public class NodoTemporada 
{
    private NodoTemporada proximo;
    private LCEquipos lc_Equipos = new LCEquipos();
    int temporada;
    
    public NodoTemporada(){}

    public NodoTemporada(int temporada) 
    {
        this.temporada = temporada;
        proximo = null;
    }

    public NodoTemporada getProximo() 
    {
        return proximo;
    }

    public void setProximo(NodoTemporada proximo) 
    {
        this.proximo = proximo;
    }

    public int getTemporada()
    {
        return temporada;
    }

    public void setTemporada(int temporada)
    {
        this.temporada = temporada;
    }

    public LCEquipos getLc_Equipos() {
        return lc_Equipos;
    }

    public void setLc_Equipos(LCEquipos lc_Equipos) {
        this.lc_Equipos = lc_Equipos;
    }
    
    
    public void mostrar(){
        System.out.println("Temporada: " + temporada);
    }
}
