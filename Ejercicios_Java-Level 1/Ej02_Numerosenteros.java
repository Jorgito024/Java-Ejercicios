//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 02
//Fecha de crecacion:

// 2) Realizar un programa que solicite por consola 2 números enteros. 
//Para luego imprimir el resultado de la suma, resta, multiplicación, 
//división y módulo (resto de la división) de ambos números.

import java.util.Scanner;

public class Ej02_Numerosenteros {

    private static final Scanner SCANNER = new Scanner (System.in); 

    public static void main(String[] args) {
        Scanner Operation = SCANNER;
        int Num1, Num2;

        System.out.println("Ingrese el primer numero");
        Num1 = Operation.nextInt(); 

        System.out.println("Ingrese el segundo numero");
        Num2 = Operation.nextInt();

        System.out.println(Num1 + "+" + Num2 + "=" + (Num1+Num2));
        System.out.println(Num1 + "-" + Num2 + "=" + (Num1-Num2));
        System.out.println(Num1 + "*" + Num2 + "=" + (Num1*Num2));
        System.out.println(Num1 + "/" + Num2 + "=" + (Num1/Num2));
        System.out.println(Num1 + "%" + Num2 + "=" + (Num1%Num2));  
    }   
}
