/**
 * UNIVERSIDAD METROPOLITANA
 * DEPARTAMENTO DE GESTION DE LA TECNOLOGIA
 * ESTRUCTURA DE DATOS
 * PROFESOR: LEILA ESCALONA
 * 
 * 
 * *****************************************************************************
 *                      PROYECTO 1: EL MUNDO DE R2D2
 * *****************************************************************************
 *
 * 
 * @author Guillermo Grande, Luis Palacios, Vincent Perez
 * Caracas, 13 de octubre de 2015.
 */


import java.util.Scanner;


public class Aplicacion 
{
    //**************************************************************************
    //                              VARIABLES
    //**************************************************************************
    
    private Scanner input = new Scanner(System.in);
    private Juego j1 = new Juego();

    
    //**************************************************************************
    //                                MAIN
    //**************************************************************************
    
    public static void main(String[] args) 
    {
        Aplicacion app = new Aplicacion();
        app.menu();
    }
    
    //**************************************************************************
    //                              FUNCIONES
    //**************************************************************************
  
    public void menu()
    {
        boolean salir = false;
        
        do
        {
            System.out.println("****************************************************");
            System.out.println("*===== BIENVENIDO AL JUEGO 'EL MUNDO DE R2D2' =====*");
            System.out.println("****************************************************");
            System.out.println("* Escoga una opcion del siguiente menu:            *\n"
                             + "* 1. Iniciar juego.                                *\n"
                             + "* 2. Mostrar Reglas.                               *\n"
                             + "* 0. Salir.                                        *");
            System.out.println("****************************************************");
            int menuItem = input.nextInt();
            System.out.println("****************************************************");
            
            switch (menuItem)
            {
                case 1:
                    iniciarJuego();
                    break;
                case 2:
                    System.out.println("****************************************************\n" + 
                                       "*            REGLAS: EL MUNDO DE R2D2              *\n" +
                                       "****************************************************");
                    System.out.println("* Usted debera hacer uso del robot R2D2 para mover *\n"
                                     + "* los beepers desordenados a su lugar adecuado.    *\n"
                                     + "* Haga uso de los comandos mostrados en pantalla   *\n"
                                     + "* para mover a R2D2 y tomar o colocar los beepers. *\n"
                                     + "* Vizualice el mundo final para ver el orden desea_*\n"
                                     + "* do de los beppers.                               *\n"
                                     + "* Recuerde no chocar contra las paredes o salirse  *\n"
                                     + "* fuera del mundo.                                 *\n"
                                     + "*                                                  *\n"
                                     + "* Caracteres:                                      *\n"
                                     + "* a. R2D2   ==> 'A'                                *\n"
                                     + "* b. Beeper ==> 'B'                                *\n"
                                     + "* c. Pared  ==> '#'                                *\n"
                                     + "****************************************************");
                    break;
                case 3: 
                    
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        while (!salir);
        System.out.println("Gracias por usar el programa!");
        System.out.println("****************************************************");
    }
    
    public void iniciarJuego()
    {
        boolean seguirJugando = true;

        j1.crearMundo();
        j1.mostrarMundoInicial();
        do
        {
            seguirJugando = j1.jugar();
            j1.mostrarMundoInicial();
        }
        while(seguirJugando == true);
    }
}
