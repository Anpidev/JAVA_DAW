/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir números hasta que se introduzca uno negativo, y calcular la media de
 * los números positivos. El 0 se considera número positivo
 *
 * @author angelaruiz
 */
public
        class Tarea10 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    double media = 0;
    int contador = 0;
    int suma = 0;
    do {
      System.out.println("Introduzca un numero entero.\n El bucle terminará cuando se "
              + "introduzca un número negativo");
      num = sc.nextInt();
      if (num >= 0) {
        suma += num;
        contador++;
      }
    }
    while (num >= 0);

    if (contador > 0) {
      media = (double) suma / contador;
      System.out.println("La media de los números introducidos es: " + media);
    }
    else {
      System.out.println("No se introdujeron números positivos.");
    }
    sc.close();
  }

}
