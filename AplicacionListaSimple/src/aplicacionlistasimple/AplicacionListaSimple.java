/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlistasimple;

import java.util.Scanner;

/**
 *
 * @author Brayan Fernandez
 */
public class AplicacionListaSimple {

    private ListaSimple lista;

    public AplicacionListaSimple() {
        lista = new ListaSimple();
    }

    public void Menu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Insertar primero");
        System.out.println("2. Eliminar primero");
        System.out.println("3. Insertar final");
        System.out.println("4. Eliminar final");
        System.out.println("5. Insertar posicion");
        System.out.println("6. Eliminar posicion");
        System.out.println("7. Mostrar lista");
        System.out.println("8. Mostrar numero de nodos de la lista");
        System.out.println("0. Salir");
    }

    public void inicioPrograma() {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        do {
            Menu();
            respuesta = sc.nextInt();
            accion(respuesta);
        } while (respuesta != 0);
    }

    public void accion(int respuesta) {
        Scanner sc = new Scanner(System.in);
        switch (respuesta) {
            case 1: {
                lista.insertarPrimero(crearNodo());
                break;
            }
            case 2: {
                NodoSimple eliminado=lista.eliminarPrimero();
                if(eliminado!=null){
                    System.out.println("Nodo eliminado: ");
                    eliminado.mostrar();
                }
                break;
            }
            case 3: {
                lista.insertarFinal(crearNodo());
                break;
            }
            case 4: {
                NodoSimple eliminado=lista.eliminarFinal();
                if(eliminado!=null){
                    System.out.println("Nodo eliminado: ");
                    eliminado.mostrar();
                }
                break;
            }
            case 5: {
                System.out.println("Indique posicion: ");
                int pos=sc.nextInt();
                lista.insertarPosicion(crearNodo(),pos);
                break;
            }
            case 6: {
                System.out.println("Indique posicion: ");
                int pos=sc.nextInt();
                NodoSimple eliminado=lista.eliminarPosicion(pos);
                if(eliminado!=null){
                    System.out.println("Nodo eliminado: ");
                    eliminado.mostrar();
                }
                break;
            }
            case 7: {
                if(!lista.estaVacia())
                    lista.mostrar();
                else
                    System.out.println("Lista vacia");
                break;
            }
            case 8: {
                System.out.println("Tamano de la lista: "+lista.contar());
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Opcion invalida");
                break;
            }
        }
    }

    public NodoSimple crearNodo() {
        Scanner sc = new Scanner(System.in);
        NodoSimple nodo;

        System.out.println("Introduzca dato texto: ");
        String c = sc.nextLine();
        System.out.println("Introduzca dato entero: ");
        int ent = sc.nextInt();

        nodo = new NodoSimple(c, ent);

        return nodo;
    }

    public static void main(String[] args) {
        AplicacionListaSimple app = new AplicacionListaSimple();
        app.inicioPrograma();
    }

}
