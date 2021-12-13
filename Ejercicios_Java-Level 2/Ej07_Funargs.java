//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 07
//Fecha de crecacion:

/* 7)Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números enteros
de principio a final. Pero si el número es multiplo de 2 colocara el valor 
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4*/
 
import java.util.*;

//import javax.lang.model.util.ElementScanner6;

public class Ej07_Funargs {

    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args) {
        Scanner Nombre = SCANNER;
        int Num1 = 0; 
        int Num2 = 0;

        System.out.println("Ingrese el primer numero-");
        Num1 = Nombre.nextInt();

        System.out.println("Ingrese el segundo numero-");
        Num2 = Nombre.nextInt();

        System.out.println(fizzBuzzFuncion(Num1, Num2));

    }

    public static List<String> fizzBuzzFuncion(int x, int y)
    {
        List<String> cadena = new ArrayList<>();

        for(int i = x; i < y; i++)
        {
            if(i%2==0 && i%3==0)
            {
                cadena.add("FizzBuzz");
            }
            else if (i%2==0 )
                {
                    cadena.add("Fizz");
                }
                else if (i%3==0) 
                    {
                        cadena.add("Buzz");
                    }
                    else 
                        {
                            cadena.add(String.valueOf(i));
                        }

        }

        return cadena;
    }
   
}
