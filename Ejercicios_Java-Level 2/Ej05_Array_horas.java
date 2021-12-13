//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 05
//Fecha de crecacion:

/*5) Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
Se debe generar otra lista que contenga los totales y luego imprimir el total
final a cobrar.*/

import java.util.*;

public class Ej05_Array_horas 
{  
    public static void main(String[] args) 
    {
       List<Integer> horas = new ArrayList<Integer>();
       List<Integer> precio_hs = new ArrayList<Integer>();
       int total=0;

       precio_hs.add(300);
       precio_hs.add(480);
       precio_hs.add(620);
       precio_hs.add(600); 
       precio_hs.add(272);
       precio_hs.add(164);

       horas.add(6);
       horas.add(6);
       horas.add(9);
       horas.add(8);
       horas.add(5);
       horas.add(7);

       System.out.print(" [ ");

        for(int i=0; i<=4; i++)
        {
            int resultado = horas.get(i) * precio_hs.get(i);
            System.out.print(resultado + " ");
            total += resultado;
        }

        System.out.println(" ] ");
        System.out.print("El total es: "+ total);

    }

}
