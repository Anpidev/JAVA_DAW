/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

/**
 * Realizar un programa que muestre las tablas de multiplicar del 1 al 10.
 *
 * @author angelaruiz
 */
public
        class Tarea18 {

  public static
          void main(String[] args) {

    int resultado = 0;
    for (int i = 0; i <= 10; i++) {
      System.out.println("La tabla de multiplicar del número: " + i);
      for (int j = 0; j <= 10; j++) {
        resultado = i * j;
        System.out.printf("%d X %d = %d \n", i, j, resultado);
      }
    }
  }
}
