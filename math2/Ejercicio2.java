/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math2;

import java.util.Scanner;

/**
 * 2.Diseñar un código que pide por pantalla cuantos números aleatorios se
 * desean calcular. Se deben generar estos números y mostrar los valores por
 * pantalla
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        //Declaracion de variables 
        int numero;
        int total;

        //Petición por pantalla del total a pedir 
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números aleatorios quiere calcular?");
        total = sc.nextInt();
        sc.close();

        //Ejecución y resultados
        for (int i = 0; i < total; i++) {
            numero = (int) (Math.random() * 101);
            System.out.print(numero + " ");

        }
        System.out.println(""); //Aumenta la claridad de la lectura de los resultados 
    }
}
