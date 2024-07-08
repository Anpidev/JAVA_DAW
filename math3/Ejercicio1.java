/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math3;

import java.util.Scanner;

/**
 * Supón que un partido de fútbol tiene una duración de 90 minutos. El minuto 1
 * se considera que abarca desde los 0 segundos hasta los 59 segundos. El minuto
 * 2 abarca desde los 60 segundos hasta los 119 segundos. Así sucesivamente
 * hasta el último minuto, que es el minuto 90 y abarca desde los 5340 segundos
 * hasta los 5400 segundos. Crea un programa que pida al usuario el número de
 * segundos transcurridos y mediante el uso de alguna función de redondeo
 * (floor, ceil ó round) de la clase Math muestre el minuto en que nos
 * encontramos. El programa debe pedir valores de segundos hasta que el usuario
 * decida terminar.
 *
 * Ejemplo de ejecución.
 *
 * Introduzca valor de segundos: 32
 *
 * El minuto es el 1
 *
 * ¿Otro valor (s/n)? s
 *
 * Introduzca valor de segundos: 2595
 *
 * El minuto es el 44
 *
 * ¿Otro valor (s/n)? n
 *
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        //Creación de objeto scanner para pedir variables por pantalla
        Scanner sc = new Scanner(System.in);

        //Creamos un booleano para comprobar las condiciones necesarias para seguir 
        //preguntando variables por oantalla
        Boolean seguir = true;

        //Ejecución
        while (seguir) {
            System.out.println("Introduzca valor de segundos: ");
            int segundos = sc.nextInt();
            int minuto = Math.round(segundos / 60); // Si usamos round el redondeo es hacia abajo si usamos Math.ceil se haria redondeo hacía arriba como pide el enunciado.
            System.out.println("El minuto es el " + minuto);
            System.out.println("¿Otro valor (s/n)?");
            // Consumir el salto de línea pendiente
            sc.nextLine();

            String valor = sc.nextLine();
            if (valor.equalsIgnoreCase("n")) {
                seguir = false;

            }
        }
sc.close();
    }
}
