/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author Scarlett
 */
public class Plantilla<T> {
    private ArrayList<T> arreglo;

    public Plantilla() {
        arreglo=new ArrayList<T>();
    }

    
    public void agregar(T t){
         arreglo.add(t);
         System.out.println(t.getClass());
     }

    public T getArreglo(){
        int random = (int )(Math. random() * arreglo.size() + 1);
        
        T obj=arreglo.get(random);
        return obj ;
    }
   



}
