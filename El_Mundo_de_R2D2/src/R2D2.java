
import java.util.Scanner;


public class R2D2 extends Casilla
{
    //**************************************************************************
    //                            VARIABLES
    //**************************************************************************
    
    private Scanner input = new Scanner(System.in);
    private String sentido;
    private int numBeepers = 0;
    private boolean encimaBeeper = false;
    
    //**************************************************************************
    //                     CONSTRUCTORES, GETTER Y SETTERS
    //**************************************************************************

    public R2D2() {}

    public R2D2(String sentido, int numBeepers, int calleX, int avenidaY, char forma)
    {
        super(calleX, avenidaY, forma);
        this.sentido = sentido;
        this.numBeepers = numBeepers;
    }

    public String getSentido() {return sentido;}

    public void setSentido(String sentido) {this.sentido = sentido;}

    public int getNumBeepers() {return numBeepers;}

    public void setNumBeepers(int numBeepers) {this.numBeepers = numBeepers;}

    public boolean isEncimaBeeper() {return encimaBeeper;}

    public void setEncimaBeeper(boolean encimaBeeper) {this.encimaBeeper = encimaBeeper;}

    //**************************************************************************
    //                            FUNCIONES
    //**************************************************************************
    
    public void mover()
    {
        if (sentido.equalsIgnoreCase("N"))
        {
            calleX--;
        }
        else if (sentido.equalsIgnoreCase("S"))
        {
            calleX++;
        }
        else if (sentido.equalsIgnoreCase("E"))
        {
            avenidaY++;    
        }
        else if (sentido.equalsIgnoreCase("O"))
        {    
            avenidaY--;
        }
    }
    
    public boolean mover(int a)
    {
        if (sentido.equalsIgnoreCase("N"))
        {
            if (calleX-a<0)
            {    
                return false;
            }   
            else      
            {
                calleX=calleX-a;
                return true;
            }
        }
        else if (sentido.equalsIgnoreCase("S"))
        {
            if(calleX+a>7)
            {
                return false;
            }
            else
            {
                calleX=calleX+a;
                return true;
            }        
        }
        else if (sentido.equalsIgnoreCase("E"))
        {
            if (avenidaY+a>7)
            {
                    return false;
            }
            else    
            {    
                avenidaY=avenidaY+a;
                return true;
            }    
        }
        else if (sentido.equalsIgnoreCase("O"))
        {    
            if (avenidaY-a<0)
            {
                return false;
            }
            else
            {
                avenidaY=avenidaY-a;
                return true;
            }
        }
        return false;
    }
    
    public void girarIzquierda()
    {
        if (sentido.equalsIgnoreCase("N"))
        {
            sentido = "O";
        }
        else if(sentido.equalsIgnoreCase("O"))
        {
            sentido = "S";
        }    
        else if (sentido.equalsIgnoreCase("S"))
        {
            sentido = "E";
        }
        else if (sentido.equalsIgnoreCase("E"))
        {
            sentido = "N";
        }
    }
    
    public void giraDerecha()
    {
        if (sentido.equalsIgnoreCase("N"))
        {
            sentido = "E";
        }
        else if(sentido.equalsIgnoreCase("E"))
        {
            sentido = "S";
        }    
        else if (sentido.equalsIgnoreCase("S"))
        {
            sentido = "O";
        }
        else if (sentido.equalsIgnoreCase("O"))
        {
            sentido = "N";
        }
    }
    
    public boolean numBeepers()
    {
        System.out.println("R2D2 esta parado sobre un BEEPER");
        System.out.println("1. Recoger Beeper");
        System.out.println("2. Dejar Beeper");
        int opc = input.nextInt();
        System.out.println("****************************************************1"
                + "");
        switch (opc)
        {
            case 1: 
                numBeepers++;
            return false;
            case 2:
            return true;
        }
        return true;
    }
    
}
