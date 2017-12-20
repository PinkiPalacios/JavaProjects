import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Juego 
{
    //**************************************************************************
    //                            VARIABLES
    //**************************************************************************
    
    private Scanner input = new Scanner(System.in);
    private Casilla matriz_i[][] = new Casilla[8][8];
    private Casilla matriz_f[][] = new Casilla[8][8];
    private R2D2 r2d2 = new R2D2();
    private Pared vectorParedes[] = new Pared[contarInstancias(0)];
    private Beeper vectorBeepersInicial[] = new Beeper[contarInstancias(1)];
    private Beeper vectorBeepersFinal[] = new Beeper[contarInstancias(2)];
    
    //**************************************************************************
    //                            FUNCIONES
    //**************************************************************************
    
    
    /**
     * Metodo llamado para crear el mundo inicial y final haciendo uso de archi_
     * vos de texto.
     */
    public void crearMundo()
    {
        //Se crear matriz inicial de puras casillas vacias
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++) 
            {
                Camino casillaVacia = new Camino(i,j,' ');
                matriz_i[i][j] = casillaVacia;  
            }
        }
        
        //Se crear matriz inicial de puras casillas vacias
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++) 
            {
                Camino casillaVacia = new Camino(i,j,' ');
                matriz_f[i][j] = casillaVacia;  
            }
        }
        
        /**
         * Variables auxiliares
         * aux1: posicion 'i' del vector de paredes
         * aux2: posicion 'i' del vector de beepers iniciales
         * aux3: posicion 'i' del vector de beepers finales
         */
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        
        try
        {
            /**
             * Llamada del lector al archivo de texto que leera el archivo linea
             * a linea y la va guardando en la variable linea_i
             */
            BufferedReader br = new BufferedReader(new FileReader("D:\\My NetBeans Proyects\\El_Mundo_de_R2D2\\Text_files\\mundo.txt"));
            String linea_i;
            
            while((linea_i = br.readLine()) != null)
            {
                /**
                 * El String linea_i es separado en un vector de Strings tokens_linea_i
                 * donde cada posicion del vector es una palabra de la linea_i.
                 * Condicion de separacion: ' ' (espacio)
                 */
                String[] tokens_linea_i = linea_i.split(" ");
                
                /**
                 * Verifica la primera posicion del vector tokens_linea_i.
                 * Si es "pared", guardo la info de las siguientes 2 posiciones 
                 */
                if (tokens_linea_i[0].equalsIgnoreCase("pared"))
                {
                    int calleX = Integer.parseInt(tokens_linea_i[1]);
                    int avenidaY = Integer.parseInt(tokens_linea_i[2]);
                    crearPared(calleX, avenidaY, aux1, 0);
                    crearPared(calleX, avenidaY, aux1, 1);
                    aux1++;
                }
                /**
                 * Si es "arturito inicial", guardo la info de las siguientes 2 posiciones 
                 * del vector en enteros y se las paso al metodo crearR2D2().
                 */
                if (tokens_linea_i[0].equalsIgnoreCase("arturito.i"))
                {
                    int calleX = Integer.parseInt(tokens_linea_i[1]);
                    int avenidaY = Integer.parseInt(tokens_linea_i[2]);
                    
                    crearR2D2(calleX, avenidaY, 0);
                }
                /**
                 * Si es "beeper inicial", guardo la info de las siguientes 2 posiciones 
                 * del vector en enteros y se las paso al metodo crearBeeper().
                 */
                if (tokens_linea_i[0].equalsIgnoreCase("beeper.i"))
                {
                    int calleX = Integer.parseInt(tokens_linea_i[1]);
                    int avenidaY = Integer.parseInt(tokens_linea_i[2]);
                    crearBeeper(calleX, avenidaY, aux2, 0);
                    aux2++;
                }
                /**
                 * Si es "arturito final", guardo la info de las siguientes 2 posiciones 
                 * del vector en enteros y se las paso al metodo crearR2D2().
                 */
                if (tokens_linea_i[0].equalsIgnoreCase("arturito.f"))
                {
                    int calleX = Integer.parseInt(tokens_linea_i[1]);
                    int avenidaY = Integer.parseInt(tokens_linea_i[2]);
                    crearR2D2(calleX, avenidaY, 1);
                }
                /**
                 * Si es "beeper final", guardo la info de las siguientes 2 posiciones 
                 * del vector en enteros y se las paso al metodo crearBeeper().
                 */
                if (tokens_linea_i[0].equalsIgnoreCase("beeper.f"))
                {
                    int calleX = Integer.parseInt(tokens_linea_i[1]);
                    int avenidaY = Integer.parseInt(tokens_linea_i[2]);
                    crearBeeper(calleX, avenidaY, aux3, 1);
                    aux3++;
                }
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
	}
    }
    
    //Muestra matriz inicial
    public void mostrarMundoInicial()
    {
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                System.out.print("[" + matriz_i[i][j].getForma() + "]");
            }
             System.out.println("");
        }
    }
    
    //Muestra matriz final
    public void mostrarMundoFinal(int gano_perdio)
    {
        if(gano_perdio == 0)
        {
            
            System.out.println("****************************************************");
            System.out.println("* El mundo sigue desordenado. Continue jugando.    *");
            System.out.println("****************************************************");
            for (int i = 0; i < 8; i++) 
            {
                for (int j = 0; j < 8; j++) 
                {
                    System.out.print("[" + matriz_f[i][j].getForma() + "]");
                }
                System.out.println("");
            }
            System.out.println("****************************************************");
        }
        else
        {
            System.out.println("****************************************************");
            System.out.println("* FELICITACIONES! El mundo esta ordenado.          *");
            System.out.println("****************************************************");
            for (int i = 0; i < 8; i++) 
            {
                for (int j = 0; j < 8; j++) 
                {
                    System.out.print("[" + matriz_f[i][j].getForma() + "]");
                }
                System.out.println("");
            }
            System.out.println("****************************************************");
        }
    }
    
    /**
     * Metodo para crear a R2D2
     * 
     * @param calleX: coordenada X de; r2d2 a crear
     * @param avenidaY coordenada Y de; r2d2 a crear
     * @param inicial_final identifica si es un R2D2 inicial o final
     */
    public void crearR2D2(int calleX, int avenidaY, int inicial_final)
    {
        if (inicial_final == 0)
        {
            System.out.println("****************************************************");
            System.out.println("Desea inciar en la posicion por defecto o hacer un\n"
                             + "inicio personalizado?");
            System.out.println("1. Inicio por defecto");
            System.out.println("2. Inicio personalizado");
            System.out.println("****************************************************");
            int opc = input.nextInt();
        
            switch(opc)
            {
                case 1:
                    r2d2.setCalleX(calleX);
                    r2d2.setAvenidaY(avenidaY);
                    r2d2.setForma('A');
                    r2d2.setSentido("N");

                    for (int i = 0; i < 8; i++) 
                    {
                        for (int j = 0; j < 8; j++) 
                        {
                            if (r2d2.getCalleX() == matriz_i[i][j].getCalleX() && r2d2.getAvenidaY() == matriz_i[i][j].getAvenidaY())
                            {
                                matriz_i[i][j] = r2d2;
                            }
                        }
                    }
                    
                    System.out.println("****************************************************");
                    System.out.println("* R2D2 inicia en la posicion (" + calleX + "," + avenidaY + ")               *");
                    System.out.println("****************************************************");
                    break;
                case 2:
                    System.out.println("****************************************************");
                    System.out.println("Introduzca coordenada X inicial:");
                    int calleXP = input.nextInt();
                    System.out.println("Introduzca coordenada Y inicial:");
                    int avenidaYP = input.nextInt();
                    System.out.println("****************************************************");
                    
                    r2d2.setCalleX(calleXP);
                    r2d2.setAvenidaY(avenidaYP);
                    r2d2.setForma('A');
                    r2d2.setSentido("N");

                    for (int i = 0; i < 8; i++) 
                    {
                        for (int j = 0; j < 8; j++) 
                        {
                            if (r2d2.getCalleX() == matriz_i[i][j].getCalleX() && r2d2.getAvenidaY() == matriz_i[i][j].getAvenidaY())
                            {
                                matriz_i[i][j] = r2d2;
                            }
                        }
                    }
                    
                    System.out.println("****************************************************");
                    System.out.println("* R2D2 inicia en la posicion (" + calleXP + "," + avenidaYP + ")               *");
                    System.out.println("****************************************************");
                break;
            }
            
            
        }
        else
        {
            R2D2 r2d2Final = new R2D2();
            r2d2Final.setCalleX(calleX);
            r2d2Final.setAvenidaY(avenidaY);
            r2d2Final.setForma('A');
            r2d2Final.setSentido("N");

            for (int i = 0; i < 8; i++) 
            {
                for (int j = 0; j < 8; j++) 
                {
                    if (r2d2Final.getCalleX() == matriz_f[i][j].getCalleX() && r2d2Final.getAvenidaY() == matriz_f[i][j].getAvenidaY())
                    {
                        matriz_f[i][j] = r2d2Final;
                    }
                }
            }
        }
    }
    
    /**
     * Metodo para crear Beepers
     * 
     * @param calleX: coordenada X del beeper a crear
     * @param avenidaY: coordenada Y del beeper a crear
     * @param beeper_i: posicion i del beeper a crear
     * @param inicial_final : identifica si es beeper inicial o final
     */
    public void crearBeeper(int calleX, int avenidaY, int beeper_i, int inicial_final)
    {
        if (inicial_final == 0)
        {
            Beeper beeper = new Beeper(calleX, avenidaY, 'B');
            vectorBeepersInicial[beeper_i] = beeper;
            
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++) 
                {
                    if (vectorBeepersInicial[beeper_i].getCalleX() == matriz_i[i][j].getCalleX() && vectorBeepersInicial[beeper_i].getAvenidaY() == matriz_i[i][j].getAvenidaY())
                    {
                        matriz_i[i][j] = vectorBeepersInicial[beeper_i];
                    }
                }
            }
        }
        else
        {
            Beeper beeper = new Beeper(calleX, avenidaY, 'B');
            vectorBeepersFinal[beeper_i] = beeper;
            
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++) 
                {
                    if (vectorBeepersFinal[beeper_i].getCalleX() == matriz_f[i][j].getCalleX() && vectorBeepersFinal[beeper_i].getAvenidaY() == matriz_f[i][j].getAvenidaY())
                    {
                        matriz_f[i][j] = vectorBeepersFinal[beeper_i];
                    }
                }
            }
        }
    }
    
    /**
     * Metodo para crear Paredes
     * 
     * @param calleX: coordenada X de la pared a crear
     * @param avenidaY: coordenada Y de la pared a crear
     * @param pared_i: posicion i la pared a crear
     * @param inicial_final identifica si es una pared incial o final
     */
    public void crearPared(int calleX, int avenidaY, int pared_i, int inicial_final)
    {
        if (inicial_final == 0) 
        {
            Pared pared = new Pared(calleX, avenidaY, '#');
            vectorParedes[pared_i] = pared;

            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++) 
                {
                    if (vectorParedes[pared_i].getCalleX() == matriz_i[i][j].getCalleX() && vectorParedes[pared_i].getAvenidaY() == matriz_i[i][j].getAvenidaY())
                    {
                        matriz_i[i][j] = vectorParedes[pared_i];
                    }
                }
            } 
        }
        else
        {
            Pared pared = new Pared(calleX, avenidaY, '#');
            vectorParedes[pared_i] = pared;

            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++) 
                {
                    if (vectorParedes[pared_i].getCalleX() == matriz_f[i][j].getCalleX() && vectorParedes[pared_i].getAvenidaY() == matriz_f[i][j].getAvenidaY())
                    {
                        matriz_f[i][j] = vectorParedes[pared_i];
                    }
                }
            }
        }
        
    }
    
    
    public boolean jugar()//Metodo donde se desarrollaran los movimientos y las acciones que realizara R2D2
    {
        System.out.println("****************************************************");
        System.out.println("* R2D2 se encuentra viendo en direccion: " + r2d2.getSentido() + "         *");
        System.out.println("* Numero de BEEPERS guardados: " + r2d2.getNumBeepers() + "                   *");
        System.out.println("****************************************************");
        System.out.println("Seleccione una de las opciones a continuacion:");
        System.out.println("1. Mover 1 casilla hacia adelante");
        System.out.println("2. Mover n casillas hacia adelante");
        System.out.println("3. Girar Izquierda");
        System.out.println("4. Girar Derecha");
        System.out.println("6. Dejar Beeper");
        System.out.println("7. Mostrar mundo final");
        System.out.println("8. Finalizar juego");
        System.out.println("****************************************************");
        int opc = input.nextInt();
        System.out.println("****************************************************");
        Casilla aux = new Camino(r2d2.getCalleX(), r2d2.getAvenidaY(), ' ');
        Casilla aux1 = new Beeper(r2d2.getCalleX(), r2d2.getAvenidaY(), 'B');
        int v;
        
        switch(opc)
        {
            case 1: 
                
                v = verificarMovimientos(1);
                if (v == 3)
                {
                        if (r2d2.isEncimaBeeper())
                        {
                            r2d2.setEncimaBeeper(r2d2.numBeepers());  
                        }
                        r2d2.mover();
                        matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()]=r2d2;
                        if (!r2d2.isEncimaBeeper())
                        {
                            matriz_i[aux.getCalleX()][aux.getAvenidaY()]=aux;
                        }
                        else
                        {
                            matriz_i[aux1.getCalleX()][aux1.getAvenidaY()]=aux1;
                            r2d2.setEncimaBeeper(false);
                        }
                    
                }
                else if (v == 0)
                    System.out.println("*****ERROR****** No mE sAqUes De Mi MuNdO(//&%!&/%!)");
                else if (v == 1)
                    System.out.println("*****ERROR****** PaReD pArEd PaReD(//&%!&/%!)");
                else if (v == 2)
                {
                        if (r2d2.isEncimaBeeper())
                        {
                            r2d2.setEncimaBeeper(r2d2.numBeepers());  
                        }
                        r2d2.mover();
                        matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()]=r2d2;
                        if (!r2d2.isEncimaBeeper()) 
                        {
                           matriz_i[aux.getCalleX()][aux.getAvenidaY()]=aux; 
                        }
                        else
                        {
                           matriz_i[aux1.getCalleX()][aux1.getAvenidaY()]=aux1;
                        }
                        r2d2.setEncimaBeeper(true);
                }
                return true; 
            case 2: 
                System.out.println("Introducir numero de casillas");
                int num = input.nextInt();
                v = verificarMovimientos(num);               
                if(v == 3)
                {   
                        if (r2d2.isEncimaBeeper())
                        {
                            r2d2.setEncimaBeeper(r2d2.numBeepers());  
                        }
                        r2d2.mover(num);
                        matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()]=r2d2;
                        if (!r2d2.isEncimaBeeper())
                        {
                            matriz_i[aux.getCalleX()][aux.getAvenidaY()]=aux;
                        }
                        else
                        {
                            matriz_i[aux1.getCalleX()][aux1.getAvenidaY()]=aux1;
                            r2d2.setEncimaBeeper(false);
                        }
                }
                else if (v == 0)                  
                    System.out.println("*****ERROR****** No mE sAqUes De Mi MuNdO(//&%!&/%!)");
                else if (v == 1)
                    System.out.println("*****ERROR****** PaReD pArEd PaReD(//&%!&/%!)");
                else if (v == 2)
                {
                        if (r2d2.isEncimaBeeper())
                        {
                            r2d2.setEncimaBeeper(r2d2.numBeepers());  
                        }
                        r2d2.mover(num);
                        matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()]=r2d2;
                        if (!r2d2.isEncimaBeeper()) 
                        {
                           matriz_i[aux.getCalleX()][aux.getAvenidaY()]=aux; 
                        }
                        else
                        {
                           matriz_i[aux1.getCalleX()][aux1.getAvenidaY()]=aux1;
                        }
                        r2d2.setEncimaBeeper(true);
                }
                return true;
      
            case 3:
                    r2d2.girarIzquierda();
                return true;
            case 4:
                    r2d2.giraDerecha();
                return true;
            case 6:
                if (r2d2.getNumBeepers()==0)
                {
                    System.out.println("Error, r2d2 no tiene beepers para soltar");
                }
                else 
                {
                    r2d2.setEncimaBeeper(true);
                    r2d2.setNumBeepers(r2d2.getNumBeepers()-1);
                }
                return true;
            case 7:
                boolean gano_perdio = compararMatrices();
                if (gano_perdio == true)
                {
                    mostrarMundoFinal(0);
                }
                else
                {
                    mostrarMundoFinal(1);
                }
                return gano_perdio;
            case 8: 
            return false;   
            default:
                System.out.println("Comando invalido");
        }

        return true;
    }

    
    public int verificarMovimientos(int a)
    {
        if (r2d2.getSentido().equalsIgnoreCase("N"))
        {
            if (r2d2.getCalleX()-a<0)
            {
                return 0;
            }
            else if (matriz_i[r2d2.getCalleX()-a][r2d2.getAvenidaY()]instanceof Pared)
            {
               return 1; 
            }
            else if (matriz_i[r2d2.getCalleX()-a][r2d2.getAvenidaY()]instanceof Beeper)
            {
                return 2;
            }
            else 
                return 3;
        }
        else if (r2d2.getSentido().equalsIgnoreCase("S"))
        {
            if (r2d2.getCalleX()+a>7)
            {
                return 0;
            }
            else if (matriz_i[r2d2.getCalleX()+a][r2d2.getAvenidaY()]instanceof Pared)
            {
               return 1; 
            }
            else if (matriz_i[r2d2.getCalleX()+a][r2d2.getAvenidaY()]instanceof Beeper)
            {
               return 2; 
            }
            else 
                return 3;
        }
        else if (r2d2.getSentido().equalsIgnoreCase("E"))
        {
            if (r2d2.getAvenidaY()+a>7)
            {
                return 0;
            }
            else if (matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()+a]instanceof Pared)
            {
               return 1; 
            }
            else if (matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()+a]instanceof Beeper)
            {
                return 2;
            }
            else 
                return 3;
        }
        else if (r2d2.getSentido().equalsIgnoreCase("O"))
        {
            if (r2d2.getAvenidaY()-a<0)
            {
                return 0;
            }
            else if (matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()-a]instanceof Pared)
            {
               return 1; 
            }
            else if (matriz_i[r2d2.getCalleX()][r2d2.getAvenidaY()-a]instanceof Beeper)
            {
                
            }
            else 
                return 3;
        }
        return 0;
    }
    
    public int contarInstancias(int pared_beeper)
    {
        int numParedes = 0;
        int numBeepers_i = 0;
        int numBeepers_f = 0;
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\My NetBeans Proyects\\El_Mundo_de_R2D2\\Text_files\\mundo.txt"));
            String linea_i;
            
            while((linea_i = br.readLine()) != null)
            {
                String[] tokens_linea_i = linea_i.split(" ");
                if (tokens_linea_i[0].equalsIgnoreCase("pared"))
                {
                    numParedes++;
                }
                if (tokens_linea_i[0].equalsIgnoreCase("beeper.i"))
                {
                    numBeepers_i++;
                }
                if (tokens_linea_i[0].equalsIgnoreCase("beeper.i"))
                {
                    numBeepers_f++;
                }
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
	}
        
        if (pared_beeper == 0) 
        {
            return numParedes;
        }
        else if (pared_beeper == 1)
        {
            return numBeepers_i;
        }
        else
        {
            return numBeepers_f;
        }
    }
    
    public boolean compararMatrices()
    {
        boolean ganar_perder = false;
        
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                if (matriz_i[i][j].getForma() != matriz_f[i][j].getForma()) 
                {
                    j = 7;
                    i = 7;
                    ganar_perder = true;
                }
            }
        }
        
        return ganar_perder;
    }
}


