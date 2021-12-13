//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 08
//Fecha de crecacion:

// 8)Crear una aplicación que solicite de entrada los datos de una persona en 
// este orden:
// Nombre y Apellido
// Edad
// Dirección
// Ciudad
// Luego imprimirá el siguiente mensaje:
// {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

import java.util.Formatter;
import java.util.Scanner; 

public class Ej08_Datos_person {

    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args){
        Scanner string = SCANNER;
        String Ciudad, Direccion, Edad, Nomb_Apell;
    
        System.out.println("ingrese su nombre y apellido");
        Nomb_Apell = string.nextLine();

        System.out.println("ingrese su Edad");
        Edad = string.nextLine();

        System.out.println("ingrese su Direccion");
        Direccion  = string.nextLine();

        System.out.println("ingrese su Ciudad");
        Ciudad = string.nextLine();

        Formatter formatter = new Formatter();

        Object strformato = formatter.format("{   %-7s} - {   %-9s} - {   %-7s} - {   %-19s}", Ciudad, Direccion, Edad, Nomb_Apell);
        System.out.println("{  Ciudad  } - { Direccion  } - {   Edad   } - {  Nombre y Apellido   }");                                   
        
        System.out.println(strformato);

    }
}
