//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 06
//Fecha de crecacion:

// 6) Se desea una aplicación que solicite 2 números enteros y realice la 
// operación de potencia (sin uso de librerías).

import java.util.Scanner; 

public class Ej06_Potencia {

    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args){
        Scanner Operation= SCANNER;
        int potencia = 1;

        System.out.println("Ingrese el primer numero (potencia)");
        int num1= Operation.nextInt();

        System.out.println("Ingrese el segundo numero (base)");
        int num2= Operation.nextInt();

        for (int i=1; i<=num2; i++){
            potencia=potencia * num1;
        }    
        
        System.out.print("El resultado es " + potencia);
    }
}
    