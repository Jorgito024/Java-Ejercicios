//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 02
//Fecha de crecacion:

/* 2)2.	Dada una lista que contiene números enteros, se deberá generar otra 
lista que contendrá el resultado de aplicar la operación de potencia a 2.*/

import java.util.*;
import java.util.stream.*; 

public class Ejercicio2 {

  public static void main(String[] args) 
  {
    List<Integer> palabras = List.of(1, 2, 3, 4, 5);
    Integer potencia = 2;
    List<Integer> NumeroconPotencia = palabras.stream()
                                      .map(p->Ejercicio2.calcularPotencia(p, potencia))
                                      .collect(Collectors.toList());

    System.out.println(NumeroconPotencia);
  }
   
  public static Integer calcularPotencia(Integer Numero, Integer Potencia)
  {
      if(Potencia ==0)
      {
          return 1;
      }
        else
        {
            return Numero * calcularPotencia(Numero, Potencia-1);
        }
  
    }
 

}
