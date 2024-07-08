/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math2;

import java.util.Scanner;

/**
 * 1.Se pide por pantalla el radio de un circulo, se calcula su área. Mostrar el
 * resultado aplicando una función para redondear el valor. Fórmula del area (A
 * = π r²).
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        //Pedir por pantalla el radio e inicializar variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio del circulo ");
        double radio = sc.nextDouble();
        sc.close(); //cierre de scanner para optimizar recursos.

        //Declaracion e inicializacion de variable area
        double area = 0;

        //Ejecución
        //Si el número es mayor a cero
        if (radio < 0) {
            System.out.println("Error. El radio debe ser mayor a cero");
        } else {
            area = Math.round(Math.PI * Math.pow(radio, 2));
            System.out.println(area);
        }
    }
}
