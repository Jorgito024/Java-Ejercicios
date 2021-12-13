//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 09
//Fecha de crecacion:

// 9)Dado un String de entrada (frase, texto, etc) calcular la cantidad de 
// veces que aparece una letra dada.

import java.util.Scanner;

public class Ej09_Cant_repet {

    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args) 
    {
        Scanner String = SCANNER;
        String str, word;
        char palabra;

        System.out.println("Ingrese la palabra /o palabras: ");
        str = String.nextLine();

        System.out.println("Ingrese la letra que desea saber:");
        word = String.nextLine();

        str = str.toLowerCase();
        palabra = word.charAt(0);

        lettersCount(str, palabra);

    }

    public static void lettersCount(String str, char chr)
    {
        String cadena = str;

        int total = 0;
        char conta_repet;

        for (int i = 0; i < cadena.length(); i++)
        {
            conta_repet= cadena.charAt(i);
            if ( conta_repet == chr)
                total++;
        }

        System.out.println("La letra " + chr + " se repite " + total + " veces");
    }
    
}
