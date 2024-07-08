/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales2;

import java.util.Scanner;

/**
 * 1.Se pide por pantalla dos números, la aplicación debe mostrar un mensaje con
 * un mensaje del tipo: "El numero: ... es mayor que el número ..." "El numero:
 * ... es menor que el número ..." 2.Se pide un número por pantalla, comprobar
 * si el número es par o impar. En el caso de que sea par se muestra el
 * mensaje:"El número es par", en el caso de que sea impar aparece el mensaje
 * "El número es impar".
 *
 * @author angelaruiz
 */
public
        class EstructuraControl {

  public static
          void main(String[] args) {

    //PRIMER EJERCICIO
    //Declaración de variables e inicialización
    Scanner sc = new Scanner(System.in);
    System.out.println("Primer ejercicio. ¿Qué número es mayor? \nIntroduzca dos números");
    System.out.println("Primer número");
    int num1 = sc.nextInt();
    System.out.println("Segundo número");
    int num2 = sc.nextInt();
    sc.close();

    //Ejecución y resultado 
    if (num1 > num2) {
      System.out.printf("El número %d es mayor que el número %d\n", num1, num2);
    }
    else {
      System.out.printf("El número %d es mayor que el número %d\n", num2, num1);
    }

    //SEGUNDO EJERCICIO
    //Declaración de variables e inicialización
    System.out.println("Segundo ejercicio. ¿Es par o impar? \nIntroduzca un número");
    int num3 = sc.nextInt();

    //Ejecución y resultado 
    if (num3 % 2 == 0) {
      System.out.printf("El número %d es par \n", num3);
    }
    else {
      System.out.printf("El número %d es impar \n", num3);
    }

  }

}
