/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

import java.util.Scanner;

/**
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * más de 1.75.
 *
 * @author angelaruiz
 */
public
        class Tarea15 {

  public static
          void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int edad = 0;
    double estatura = 0;
    int contador = 0, contadorEdad = 0, contadorEstatura = 0;
    double sumaEdad = 0, sumaEstatura = 0;
    double mediaEdad, mediaEstatura;

    do {
      System.out.println("Ingrese la edad");
      edad = teclado.nextInt();
      System.out.println("Ingrese la estatura en metros");
      estatura = teclado.nextDouble();
      contador++;
      sumaEdad += edad;
      sumaEstatura += estatura;

      if (edad > 18) {
        contadorEdad++;
      }
      if (estatura > 1.75) {
        contadorEstatura++;
      }
    }
    while (contador < 5);

    mediaEdad = sumaEdad / contador;
    mediaEstatura = sumaEstatura / contador;
    System.out.println("La media de edad de los cinco alumnos es : " + mediaEdad);
    System.out.printf("Y su media de estatura es %.1f\n", mediaEstatura);
    System.out.println("Hay " + contadorEdad + " alumnos con mas de 18 años");
    System.out.println("Hay " + contadorEstatura + " alumnos con mas de 1.75 de altura");

    teclado.close();
  }
}
