//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 04
//Fecha de crecacion:

/*4) Cargar un arrayList con 12 nombres de estudiantes (String), luego 
separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.*/

import java.util.*;

public class Ej04_Array_nomb 
{
    
    public static void main(String[] args) 
    {
       List<String> nomb_estudin = new ArrayList<String>(); 
       nomb_estudin.add("Tony Stark");
       nomb_estudin.add("Steven Strange");
       nomb_estudin.add("Cris Redfield");
       nomb_estudin.add("Steve Rogers");
       nomb_estudin.add("Leon Kennedy");
       nomb_estudin.add("Jacob Frye");
       nomb_estudin.add("Eve Frye");
       nomb_estudin.add("Ezio Auditore");
       nomb_estudin.add("Bruce Wayne");
       nomb_estudin.add("Bucky Barns");
       nomb_estudin.add("Bookekr Dewitt");
       nomb_estudin.add("Isaac Clarke");

        List<String> classroom_1 = nomb_estudin.subList(0, 4);
        List<String> classroom_2 = nomb_estudin.subList(4, 8);
        List<String> classroom_3 = nomb_estudin.subList(8, 12);

        System.out.println("Classroom-1 "+ classroom_1);
        System.out.println("Classroom-2 "+ classroom_2);
        System.out.println("Classroom-3 "+ classroom_3);

    }

}
