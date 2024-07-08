/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir dos números y decir si uno es múltiplo del otro.
 *
 * @author angelaruiz
 */
public
        class Tarea2 {

  public static
          void main(String[] args) {
    System.out.println("Introduzca dos números enteros");
    Scanner teclado = new Scanner(System.in);
    System.out.println("Primer número:");
    int num1 = teclado.nextInt();
    System.out.println("Segundo número: ");
    int num2 = teclado.nextInt();
    teclado.close();

    if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
      System.out.println("Los números son múltiplos");
    }
    else {
      System.out.println("Los números no son múltiplos");
    }

  }

}
