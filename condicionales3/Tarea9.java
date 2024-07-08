/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
 * introducidos.
 *
 * @author angelaruiz
 */
public
        class Tarea9 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    int suma = 0;

    do {
      System.out.println("Ingrese un número. Si introduce cero el bucle terminará");
      num = teclado.nextInt();
      suma += num;

    }
    while (num != 0);

    System.out.println("La suma de los números introducidos es:  " + suma);
    teclado.close();
  }

}
