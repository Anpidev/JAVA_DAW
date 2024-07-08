/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package tareas.condicionales3;

import java.util.Scanner;

/**
 * Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o
 * impar.
 *
 * @author angelaruiz
 */
public
        class Tarea7 {
  
  public static
          void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    
    do {
      System.out.println("Introduzca un número entero. El bucle continuará hasta que se ingrese el número cero");
      num = sc.nextInt();
      if (num != 0) {
        if (num % 2 == 0) {
          System.out.println("El número es par");
        }
        else {
          System.out.println("El número es impar");
        }
        
      }
      
    }
    while (num != 0);
    sc.close();
  }
  
}
