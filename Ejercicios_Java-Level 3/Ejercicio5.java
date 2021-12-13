//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 05
//Fecha de crecacion:

/* 5)5.	Se posee una Lista con objetos de clase Alumno con los atributos: 
apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). 
Se desea generar un Map<String, Integer> donde la clave de Map será el 
apellido concatenado con el nombre (con separador de espacio en blanco) y el 
value la edad del alumno.
●	La lista de entrada debe estar cargada con varios alumnos (al menos 5) para 
subir el ejemplo y demostrar su funcionamiento.
●	En ejemplo se muestra solo con 1 Alumno a modo de abreviar
●	En el ejemplo también se usa LocalDate.now().minusYears(30), en el 
ejercicio a presentar se deberá usar otra tecnica de construcción para la 
fecha (no usar .now(). Pueden ver métodos .parse(), etc)*/

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        List <Alumno> alumnos = List.of(new Alumno ("Homero", "Simpson", LocalDate.now().minusYears(30)),
                                       new Alumno ("Marge", "Simpson", LocalDate.of(1965, 1, 10)),
                                       new Alumno ("Bart", "Simpson", LocalDate.of(1999, 2, 11)),
                                       new Alumno ("Lisa", "Simpson", LocalDate.of(1998, 3, 12)),
                                       new Alumno ("Maggie", "Simpson", LocalDate.of(2000, 4, 13)));
    Map<String, Integer> Edad = alumnos.stream()
                                       .collect (Collectors.toMap(p-> (p.getNombre()+ " "+ p.getApellido()),
                                                                  p-> Ejercicio5.getEdad(p.getdiaCumpleaños())));
           
        System.out.println(Edad);  
    }
    
    public static Integer getEdad(LocalDate cumpleañosDate)
    {
        return Period.between(cumpleañosDate, LocalDate.now()).getAños();
    }

}
