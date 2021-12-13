//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 07
//Fecha de crecacion:

// 7)Realizar un programa que dado un String de entrada en minúsculas lo
// convierta por completo a mayúsculas. Sin uso de métodos o librerías que
// realicen toUppercase().

import java.util.Scanner; 

public class Ej07_Mayusculas 
{
    
    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main (String[] args)
    {
        Scanner String = SCANNER;
        String Mayuscula;

        System.out.println("Ingrese la palabra a convertir ");
        Mayuscula = String.nextLine();
    
        changeCase(Mayuscula);

    }

    public static void changeCase(String str)
    {
        int i;

        for(i = 0; i < str.length(); i++) 
        {
            int caracter =str.charAt(i);

            if(caracter>64 && caracter<91)
            {
                caracter= caracter + 32;
                System.out.print((char) caracter);
            }
            else if(caracter>96 && caracter<123)
            {
                caracter= caracter - 32;
                System.out.print((char) caracter);
            }

            if (caracter == 32)
            System.out.print(" ");
        }
    }
}
