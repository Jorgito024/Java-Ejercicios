//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 01
//Fecha de crecacion:

/* 1)Dada una lista que contiene valores de tipo String, se deberá filtrar
todos los valores que NO sean null o vacío ("").*/

import java.util.*;
import java.util.stream.Collectors; 

public class Ejercicio1 {
    
    public static void main(String[] args) 
    {
      List<String> palabras = new ArrayList<>();
      palabras.add("Hola");
      palabras.add(null);
      palabras.add("Informatorio");
      palabras.add("");
      List<String>listaFiltrada = palabras.stream()
                                  .filter(Objects::nonNull)
                                  .filter(p -> !p.equals(""))
                                  .collect(Collectors.toList());

        System.out.println(listaFiltrada);
      
    }
    
}
