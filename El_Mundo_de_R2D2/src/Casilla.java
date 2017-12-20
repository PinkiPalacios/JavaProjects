
public class Casilla 
{
    //**************************************************************************
    //                            VARIABLES
    //**************************************************************************
    
    protected int calleX;
    protected int avenidaY;
    protected char forma;
    
    //**************************************************************************
    //                     CONSTRUCTORES, GETTER Y SETTERS
    //**************************************************************************

    public Casilla() {}
    
    public Casilla(int calleX, int avenidaY, char forma) 
    {
        this.calleX = calleX;
        this.avenidaY = avenidaY;
        this.forma = forma;
    }

    public int getCalleX() {return calleX;}

    public void setCalleX(int calleX) {this.calleX = calleX;}

    public int getAvenidaY() {return avenidaY;}

    public void setAvenidaY(int avenidaY) {this.avenidaY = avenidaY;}

    public char getForma() {return forma;}

    public void setForma(char forma) {this.forma = forma;}
    
}
