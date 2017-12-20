package torneodetenis;

public class NodoCategoria 
{
    private int categoria;
    private NodoCategoria proximo;
    private ABBJugadores abb_femenino;
    private ABBJugadores abb_masculino;
    private char sexo;

    public NodoCategoria() {
    }

    public NodoCategoria(int categoria) {
        this.categoria = categoria;
        this.proximo = null;
        this.abb_femenino = null;
        this.abb_masculino = null;
    }

    public NodoCategoria(int categoria, char sexo) {
        this.categoria = categoria;
        this.sexo = sexo;
    }

    public ABBJugadores getAbb_femenino() {
        return abb_femenino;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAbb_femenino(ABBJugadores abb_femenino) {
        this.abb_femenino = abb_femenino;
    }

    public ABBJugadores getAbb_masculino() {
        return abb_masculino;
    }

    public void setAbb_masculino(ABBJugadores abb_masculino) {
        this.abb_masculino = abb_masculino;
    }

    
    
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public NodoCategoria getProximo() {
        return proximo;
    }

    public void setProximo(NodoCategoria proximo) {
        this.proximo = proximo;
    }
    
        public void mostrar(){
        System.out.println("Categoria: " + categoria);
    }
}
