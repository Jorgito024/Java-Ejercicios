//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 04
//Fecha de crecacion:

// 4) Realizar un programa que calcule el factorial de un número

import java.util.Scanner; 

public class Ej04_factorial 
{
    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main (String[] args)
    {
        Scanner Operation = SCANNER;
        int Num;

        System.out.println("Ingrese un numero ");
        Num = Operation.nextInt();

        System.out.println("El factorial de " + Num + " es " + factorial(Num));

    }

    public static Integer factorial(Integer Num)
    {
        int result = 1;

        for (int i=Num; i > 0; i--)
        {
            result= result *i;
        }
    
    return result;

    }
    
}
