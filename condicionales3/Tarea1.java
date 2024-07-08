/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir un número e indicar si es positivo o negativo .
 *
 * @author angelaruiz
 */
public
        class Tarea1 {

  public static
          void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un número puede ser positivo o negativo");
    double numero = teclado.nextDouble();
    teclado.close();

    if (numero >= 0) {
      System.out.println("El número introducido es positivo");
    }
    else {
      System.out.println("El número intrdocido es negativo");
    }
  }

}
