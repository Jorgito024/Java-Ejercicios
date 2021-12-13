//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 05
//Fecha de crecacion:

// 5)Se desea una aplicación que solicite 2 números enteros y realice la operación
//de multiplicación por sumas sucesivas (sin uso de librerías).

import java.util.Scanner;

public class Ej05_Sumasucesiva {
    
    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main (String[] args){
        Scanner Operation = SCANNER;
        int suma = 0;

        System.out.println("Ingrese el primer numero");
        int num1= Operation.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2= Operation.nextInt();

        for (int i=1; i<=num2; i++){
            suma=suma + num1;
        }    
        
        System.out.print("El resultado es " + suma);
    }
}
