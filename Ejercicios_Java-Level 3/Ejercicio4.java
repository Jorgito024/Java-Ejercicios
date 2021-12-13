//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 04
//Fecha de crecacion:

/* 4)Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos.*/

import java.util.*;
import java.util.stream.*;

public class Ejercicio4 {

    public static void main(String[] args) 
    {
       List<Integer> palabras = List.of(1, 2, 4, 4, 4);
       List<Integer> palabras_v2 = palabras.stream()
                                 .map(x->Ejercicio4.factorial(x))
                                 .distinct()
                                 .collect(Collectors.toList());
        
        System.out.println(palabras_v2);
    }
    
    public static Integer factorial(Integer num)
    {
        int result = 1;
        for(int i = num; i > 0; i--)
        {
            result= result*i;
        }
        return result;
    }

}
