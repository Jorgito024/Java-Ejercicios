//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 01
//Fecha de crecacion:

// 1)Solicitar por consola el nombre del usuario e imprimir por pantalla el 
// siguiente mensaje “HOLA {USUARIO}!!!

import java.util.Scanner; 

public class Ej01_Hola 
{

    private static final Scanner SCANNER = new Scanner(System.in); 

    public static void main(String[] args)
    {
        Scanner nombre = SCANNER; 
        String Usuario;
    
        System.out.println("Ingrese nombre de Usuario: ");
        Usuario = nombre.nextLine(); 

        System.out.println("Hola" + Usuario);
    }
 
}
