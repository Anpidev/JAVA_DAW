/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir dos números y decir cual es el mayor o si son iguales.
 *
 * @author angelaruiz
 */
public
        class Tarea3 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int num1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número entero");
    int num2 = teclado.nextInt();
    teclado.close();

    if (num1 > num2) {
      System.out.printf("El número %d es mayor que %d", num1, num2);

    }
    else if (num2 > num1) {
      System.out.printf("El número %d es mayor que %d", num2, num1);
    }
    else if (num1 == num2) {
      System.out.println("Los números son iguales");
    }
  }

}
