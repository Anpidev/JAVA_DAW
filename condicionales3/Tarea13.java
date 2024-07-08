/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir un número y calcular su factorial.
 *
 * @author angelaruiz
 */
public
        class Tarea13 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número entero.");
    int num = sc.nextInt();
    sc.close();
    int factorial = 1;
    if (num > 0) {
      for (int i = num; i > 0; i--) {
        factorial *= i;

      }
      System.out.printf("El factorial de %d es %d ", num, factorial);
    }
    else if (num == 0) {
      System.out.println("El factorial de cero es uno");

    }
    else {
      System.out.println("No se puede calcular el factorial de un número negativo");
    }
  }
}
