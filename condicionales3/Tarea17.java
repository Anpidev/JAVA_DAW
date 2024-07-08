/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
 * y suspensos.
 *
 * @author angelaruiz
 */
public
        class Tarea17 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int aprobados = 0;
    int condicionados = 0;
    int suspensos = 0;
    int contador = 0;

    do {
      System.out.println("Ingrese una nota (0-10)");
      double nota = teclado.nextDouble();
      if (nota > 0 && nota < 10) {
        
        if (nota < 4) {
          suspensos++;
        }
        else if (nota > 4) {
          aprobados++;
        }
        else {
          condicionados++;
        }
        contador++;
      }
      else {
        System.out.println("Nota mal introducida");
      }

    }
    while (contador < 6);

    System.out.printf("La cantidad de aprobados es %d, los condicionados son %d y los suspensos %d", aprobados, condicionados, suspensos);
  teclado.close();
  }

}
