/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math2;

import java.util.Scanner;

/**
 * 3.Diseñar un programa que pide dos números por pantalla, y se deben generar
 * los números aleatorios entre ellos.
 *
 * @author angelaruiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        //Petición de numeros por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double numero2 = sc.nextDouble();
        sc.close();

        //Generación de números aleatorios entre los dos solicitados (ambos inclusives)
        double numeroFinal = Math.random() * (numero2 - numero1+1) + numero1;

        //Mostramos número generado
        System.out.println(numeroFinal);
    }
}
