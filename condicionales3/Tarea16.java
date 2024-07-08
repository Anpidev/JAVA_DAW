/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
 * multiplicar de dicho número.
 *
 * @author angelaruiz
 */
public
        class Tarea16 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número entero entre 0 y 10 ");
    int numero = teclado.nextInt();
    teclado.close();
    int resultado = 0;

    System.out.println("Tabla de multiplicar del número " + numero);
    for (int i = 0; i <= 10; i++) {
      resultado = numero * i;
      System.out.printf("%d X %d = %d\n", numero, i, resultado);
    }
  }

}
