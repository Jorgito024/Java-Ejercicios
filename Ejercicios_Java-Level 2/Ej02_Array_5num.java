//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 02
//Fecha de crecacion:

/* 2) Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir 
los elementos de la lista y el tamaño de la misma (antes y despuésen la primera
y última posición).*/

import java.util.ArrayList;
import java.util.List;

public class Ej02_Array_5num {
    
    public static void main(String[] args) 
    {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
       
        int length = numeros.size();

        System.out.println("Listado de numeros " +numeros);
        System.out.println("Cantidad de numeros en lista: " +length);

        numeros.add(0 , 0);
        numeros.add(6, length+1);

        length = numeros.size();

        System.out.println("Listado de numeros " +numeros);
        System.out.println("Cantidad de numeros en lista: " +length);


    }

}
