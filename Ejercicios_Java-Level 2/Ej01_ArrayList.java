//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 01
//Fecha de crecacion:

/* 1) Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
luego imprimir por pantalla el ranking.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ej01_ArrayList {
    
    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args) 
    {
       Scanner Nombre = SCANNER;
       List<String>listCiudades = new ArrayList<>();   // crear lista
       String Ciudad = "0";
       int i = 0;

       while (!Ciudad.equals("n"));
       {
           System.out.println("Ingrese los nombre de sus ciudades favoritas. [Para finalizar la carga = x]");
           Ciudad= Nombre.nextLine();

           i = i+1;

           listCiudades.add(Ciudad); 
       }
       
       Formato (listCiudades, i);
    
    }

    public static void Formato (List<String> list_str, int city)
    {
        for(int i=0; i<city; i++)
        {
            String Ciudad = list_str.get(i);

            if(!Ciudad.equals("n"));
            {
                System.out.println("#" + (i+1) +" - " + Ciudad);
                

            }

        }
            
    }
}
