/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.bucles2;

/**
 * Calcular el factorial del número 15. 4.
 *
 * @author angelaruiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;
        double factorial = 1;
        double factorial2 = 1;

        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
        }

        for (int j = 1; j <= num2; j++) {
            factorial2 = factorial2 * j;
        }

        System.out.println("El factorial de 15 es: " + factorial);
        System.out.println("El factorial de 4 es: " + factorial2);
    }
}
