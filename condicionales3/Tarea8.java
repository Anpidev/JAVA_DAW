/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número. Para ello pedir un número N, y
 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
 * con respecto a N. El proceso termina cuando el usuario acierta
 *
 * @author angelaruiz
 */
public
        class Tarea8 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int password = 1234;
    int num = 0;
    System.out.println("Adivine la contraseña");
    do {
      
      System.out.println("Ingrese un número entero");
      num = teclado.nextInt();
      if (num > password) {
        System.out.println("Número demasiado alto. Ingrese otro número");
      }
      else if (num < password) {
        System.out.println("Número demasiado bajo.Ingrese otro número");
      }
      else if (num == password) {
        System.out.println("¡Enhorabuena!Ha acertado la contraseña");

      }
    }
    while (num != password);
    teclado.close();
  }

}
