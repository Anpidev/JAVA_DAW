/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.switch1;

import java.util.Scanner;

/**
 * 4.Crea una variante del ejercicio 5.3, en la que emplees varios SI-ENTONCES
 * en vez de SWITCH
 *
 * @author angelaruiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del mes (del 1 al 12)");
        int mes = sc.nextInt();
        sc.close();

        if (mes == 1) {
            System.out.println("Enero");
        } else if (mes == 2) {
            System.out.println("Febrero");
        } else if (mes == 3) {
            System.out.println("Marzo");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Mayo");
        } else if (mes == 6) {
            System.out.println("Junio");
        } else if (mes == 7) {
            System.out.println("Julio");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Septiembre");
        } else if (mes == 10) {
            System.out.println("Octubre");
        } else if (mes == 11) {
            System.out.println("Noviembre");
        } else if (mes == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Mes mal introducido");
        }
    }

}
