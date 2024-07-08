/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.switch1;

import java.util.Scanner;

/**
 * 2.Crea una variante del ejercicio 5.1, en la que emplees varios SI-ENTONCES
 * en vez de SWITCH.
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número de día de la semana (del 1 al 7)");
        int dia = sc.nextInt();
        sc.close();

        if (dia == 1) {
            System.out.println("Es lunes");
        } else if (dia == 2) {
            System.out.println("Es martes");

        } else if (dia == 3) {
            System.out.println("Es miércoles");

        } else if (dia == 4) {
            System.out.println("Es jueves");

        } else if (dia == 5) {
            System.out.println("Es viernes");

        } else if (dia == 6) {
            System.out.println("Es sábado");

        } else if (dia == 7) {
            System.out.println("Es domingo");

        } else {
            System.out.println("Día mal introducido");
        }
    }
}
