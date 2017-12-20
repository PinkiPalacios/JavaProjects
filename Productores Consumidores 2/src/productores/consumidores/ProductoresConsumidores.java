/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productores.consumidores;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Estudiantes
 */
public class ProductoresConsumidores {
    
    private Almacen alm;
    private Semaphore semaProductores;
    private Semaphore semaConsumidores;
    private Semaphore semaExclusividad;
    private Semaphore semaImpresion;
    private Productor p1, p2;
    private Productor c1, c2, c3;

    public ProductoresConsumidores() {
          int x=5;
          alm=new Almacen(x); 
          semaProductores=new Semaphore(x);
          semaConsumidores=new Semaphore(0);
          semaExclusividad=new Semaphore(1);
          semaImpresion=new Semaphore(1);

          p1=new Productor(alm, semaProductores, semaConsumidores, semaExclusividad, 1, semaImpresion);
          c1=new Productor(alm,semaConsumidores, semaProductores, semaExclusividad,  0, semaImpresion);
          p2=new Productor(alm, semaProductores, semaConsumidores, semaExclusividad, 1, semaImpresion);
          c2=new Productor(alm,semaConsumidores, semaProductores, semaExclusividad,  0, semaImpresion);
          c3=new Productor(alm,semaConsumidores, semaProductores, semaExclusividad,  0, semaImpresion);
    }

   
    public static void main(String[] args) {
       ProductoresConsumidores a= new ProductoresConsumidores();
       a.c1.start();
       a.p1.start();
       a.c2.start();
       a.p2.start();
       a.c3.start();
    }
    
}
