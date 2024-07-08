/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir 10 números. Mostrar la media de los números positivos, la media de los
 * números negativos y la cantidad de ceros.
 *
 * @author angelaruiz
 */
public
        class Tarea14 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num = 0;
    int contador = 0;
    int sumaPositivos = 0, sumaNegativos = 0;
    double mediaPositivos = 0, mediaNegativos = 0;
    int ceros = 0;
    int positivos = 0;
    int negativos = 0;

    do {
      System.out.println("Ingrese un número entero");
      num = teclado.nextInt();
      if (num > 0) {
        positivos++;
        sumaPositivos += num;
      }
      else if (num < 0) {
        negativos++;
        sumaNegativos += num;

      }
      else {
        ceros++;
      }
      contador++;
    }
    while (contador <10);
    if (positivos > 0) {
      mediaPositivos = sumaPositivos / positivos;
    }
    if (negativos > 0) {
      mediaNegativos = sumaNegativos / negativos;
    }

    System.out.println("La media de los números positivos es: " + mediaPositivos);
    System.out.println("La media de los números negativos es : " + mediaNegativos);
    System.out.println("La cantidad de ceros introducidos es: " + ceros);
teclado.close();
  }

}
