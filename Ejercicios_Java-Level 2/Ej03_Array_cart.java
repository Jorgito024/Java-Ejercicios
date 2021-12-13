//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 03
//Fecha de crecacion:

/* 3) Crear una lista que contenga como elementos la numeración de cartas de 
una baraja francesa (solo los valores, no figuras). Se deberá cargar el 
ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), 
desordenar (mezclar) el arrayList y volver a imprimir.*/

import java.util.*;

public class Ej03_Array_cart {
    
    public static void main(String[] args) 
    {
        Set <Integer>Orden = new LinkedHashSet<Integer>();

        Orden.add(1);
        Orden.add(2);
        Orden.add(3);
        Orden.add(4);
        Orden.add(5);
        Orden.add(6);
        Orden.add(7);
        Orden.add(8);
        Orden.add(9);
        Orden.add(10);
        Orden.add(11);
        Orden.add(12);
        Orden.add(13);

        System.out.println("Lista con componentes Original" + Orden);

        List<Integer> shuffleMe = new ArrayList<Integer>(Orden);
        Collections.shuffle(shuffleMe);

        Set<Integer> suffledSet  = new LinkedHashSet<Integer>();
        suffledSet.addAll(shuffleMe);

        System.out.println("Lista con componentes Ordenados" + suffledSet);

    }


}
