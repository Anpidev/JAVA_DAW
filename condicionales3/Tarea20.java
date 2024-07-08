/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Realizar un programa que nos pida un número n, y nos diga cuantos números hay
 * entre 1 y n que son primos.
 *
 * @author angelaruiz
 */
public
        class Tarea20 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroMin = 2;
    int numeroMax;
    System.out.println("Introduzcna un número entero");
    numeroMax = teclado.nextInt();
    teclado.close();

    System.out.printf("Los números primos entre 1 y %d son: \n", numeroMax);

    //SE INICIALIZA EN DOS YA QUE UNO NO ES PRIMO
    for (int numeroActual = numeroMin; numeroActual <= numeroMax; numeroActual++) {
      boolean esPrimo = true;  //SE PONE AQUI PARA QUE CADA VEZ QUE EMPIECE EL CICLO SE REINICE CON CADA NUMERO
      if (numeroActual > 1) {
        for (int i = 2; i < numeroActual; i++) {
          if ((numeroActual % i) == 0) {
            esPrimo = false;
            break; // Si ya no es primo, no es necesario seguir verificando

          }
        }

      }
      else {
        esPrimo = false; // Números menores o iguales a 1 no son primos
      }
      if (esPrimo) {
        System.out.print(numeroActual + " ");
      }

    }
  }

}
