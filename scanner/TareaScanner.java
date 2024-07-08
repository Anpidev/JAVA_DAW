/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.scanner;
import java.util.Scanner;

/**
 *Se pide por pantalla, utilizando el objeto Scanner:

-Nombre:

-Apellidos:

Aparece impreso en el documento:

"Buenos días nombre apellidos"
 * @author angelaruiz
 */
public
        class TareaScanner {
  public static
          void main(String[] args) {
            
            //Declaración de variables
            String nombre;
            String apellidos;
            
            //Uso de Scanner para inicialización de variables
            System.out.println("Tarea programación");
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduzca su nombre");
    nombre=sc.nextLine();
    System.out.println("Introduzca su apellido");
    apellidos=sc.nextLine();
    sc.close();
    
    //Resultados
    
    System.out.printf("Buenos días %s %s",nombre,apellidos);
  }
  
}
