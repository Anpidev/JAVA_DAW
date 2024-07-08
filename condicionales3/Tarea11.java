/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir un número N, y mostrar todos los números del 1 al N.
 *
 * @author angelaruiz
 */
public
        class Tarea11 {

  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int num = sc.nextInt();
    sc.close();
    System.out.printf("Los números introducidos desde 1 hasta %d son:  \n", num);
    for (int i = 1; i <= num; i++) {
      System.out.println(i);

    }
  }
}
