/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
 * Bien...
 *
 * @author angelaruiz
 */
public
        class Tarea5 {

  public static
          void main(String[] args) {
    System.out.println("Ingrese su  nota (0-10)");
    Scanner sc = new Scanner(System.in);
    double nota = sc.nextDouble();
    sc.close();

    String resultado = "";

    if (nota < 5) {
      resultado = "Insuficiente";
    }
    if (nota >= 5 && nota < 6) {
      resultado = "Suficiente";
    }
    if (nota >= 6 && nota <= 7) {
      resultado = "Bien";
    }
    if (nota >= 8 && nota < 9) {
      resultado = "Notable";
    }
    if (nota >= 9 && nota <= 10) {
      resultado = "Sobresaliente";
    }
    System.out.println("Su nota " + nota + " es " + resultado);
  }

}
