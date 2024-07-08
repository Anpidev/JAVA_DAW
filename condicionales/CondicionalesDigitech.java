/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales;

import java.util.Scanner;

/**
 * Se piden por pantalla tres números. Hay que comparar cual es el menor de los
 * tres y el mayor
 *
 * @author angelaruiz
 */
public
        class CondicionalesDigitech {

  public static
          void main(String[] args) {

    //Declaración de variables e inicialización
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Qué número es mayor?.Vamos a ingresar tres números");
    System.out.println("Primer número");
    int num1 = sc.nextInt();

    System.out.println("Segundo número");
    int num2 = sc.nextInt();
    System.out.println("Tercer número");
    int num3 = sc.nextInt();
    sc.close(); //CIERRE DE SCANNER PARA OPTIMIZAR RECURSOS.

    //Ejecución
    // SE REALIZA CAMBIO DE VARIABLES PARA ORDENAR LOS NÚMEROS INTRODUCIDOS DE MAYOR A MENOR.
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

    //Resultados 
    System.out.println("El número mayor es : " + num3);
    System.out.println("El número menor es: " + num1);
  }

}
