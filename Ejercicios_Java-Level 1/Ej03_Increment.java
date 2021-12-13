//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 03
//Fecha de crecacion:

// 3) Confeccionar un programa que dado un número entero como dato de
//entrada imprima la secuencia de números (incrementos de 1).

import java.util.Scanner;

public class Ej03_Increment {
    
    private static final Scanner SCANNER = new Scanner (System.in);
    
    public static void main (String[] args) {
        Scanner Operation = SCANNER;
        int Numero;

        System.out.println("Ingrese un numero entero");
        Numero = Operation.nextInt();

        for (int i=1; i<= Numero; i++) 
        {
            for (int j=1; j<=Numero; j++) 
                {
                   System.out.print(j + " ");
                }
            System.out.println("");
        }            
    }
}
