//Autor: Morel Sena Jorge Joel  
//Ejercicio Nro: 06
//Fecha de crecacion:

/*6)Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular 
el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.*/ 

import java.util.*; 

public class Ej06_Empleados {
  public static void main(String[] args) {
    Set<Empleado> empleados = new HashSet<>();
    Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();

    empleados.add(new Empleado (43945865, "Bruce Banner", 165, 780));
    empleados.add(new Empleado (46584212, "Otto Octavius", 240, 390));
    empleados.add(new Empleado (41265123, "Dr Jekyll", 420, 512));
    empleados.add(new Empleado (40578919, "Victor Frankenstein", 341, 651));
    empleados.add(new Empleado (42561324, "Rick Sánchez ", 875, 932));

    for(Empleado i:empleados)
    {
      int sueldo = i.getvalorPorHora() * i.gethorasTrabajadas();

      diccionario.put(i.getdni(), sueldo);

      System.out.println("Empleado- "+i.getNombre()+" - DNI - "+i.getdni()+" - Sueldo - "+sueldo);
    }

  }
    static class Empleado
    {
      private int dni;
      private String Nombre_Apellido;
      private int valorPorHora;
      private int horasTrabajadas;


      public Empleado(int dni, String Nombre_Apellido,int valorPorHora, int horasTrabajadas)
      {
        this.dni = dni;
        this.Nombre_Apellido = Nombre_Apellido;
        this.valorPorHora = valorPorHora;
        this.horasTrabajadas = horasTrabajadas;
      }

      /*Retorna todos los resultados**/ 

      public int getdni()
      {
        return dni;
      }

      public String getNombre()
      {
        return Nombre_Apellido;
      }

      public int getvalorPorHora()
      {
         return valorPorHora;
      }

      public int gethorasTrabajadas()
      {
         return horasTrabajadas;
      }

    }  
}
