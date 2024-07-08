/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package tareas.condicionales3;
import java.util.Scanner;

/**
 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá
 * hasta que se introduzca un 0.
 *
 * @author angelaruiz
 */
public
        class Tarea6 {

  public static
          void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = 0;

    do {
      System.out.println("Introduzca un número entero. El bucle continuará hasta ingresar 0");
      num = sc.nextInt();
      if (num > 0) {
        System.out.println("El número es positivo");
      }
      else if (num == 0) {
        System.out.println("El número es igual a cero");
      }
      else {
        System.out.println("El número es negativo");
      }

    }
    while (num != 0);
sc.close();
  }

}
