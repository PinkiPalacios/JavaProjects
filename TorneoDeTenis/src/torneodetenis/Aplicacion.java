package torneodetenis;

/**
 * UNIVERSIDAD METROPOLITANA
 * INGENIERIA DE SISTEMAS
 * ESTRUCTURA DE DATOS
 * PROFESOR: LEILA ESCALONA
 * 
 * PROYECTO 2: TORNEO DE TENIS
 *
 * @author Guillermo Grande, Luis Palacios & Vincent Perez
 * Caracas, 11 de noviembre de 2015
 */

public class Aplicacion
{
    private LSTemporadas lsTemp = new LSTemporadas();

    public Aplicacion() {}

    public LSTemporadas getLsTemp() 
    {
        return lsTemp;
    }

    public void setLsTemp(LSTemporadas lsTemp) 
    {
        this.lsTemp = lsTemp;
    }
}
