/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package tareas.condicionales3;

import java.util.Scanner;

/**
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 *
 * @author angelaruiz
 */
public
        class Tarea4 {

  public static
          void main(String[] args) {
    Scanner tecla = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int num1 = tecla.nextInt();
    System.out.println("Introduzca un segundo número entero");
    int num2 = tecla.nextInt();
    System.out.println("Introduzca un tercer número entero");
    int num3 = tecla.nextInt();
    tecla.close();

    if (num1 > num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }

    if (num2 > num3) {
      num2 = num2 + num3;
      num3 = num2 - num3;
      num2 = num2 - num3;
    }

    if (num1 > num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }
    System.out.println("Los numeros introducidos de mayor a menor son: " + num3 + " " + num2 + " " + num1);
  }

}
