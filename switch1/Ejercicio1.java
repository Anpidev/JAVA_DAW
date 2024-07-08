/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.switch1;

import java.util.Scanner;

/**
 *
 * 1.Haz un programa que pida un número al usuario un número de día de la semana
 * (del 1 al 7) y escriba el nombre de ese día (por ejemplo, "martes" para el
 * día 2). Debes emplear la orden SWITCH.
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número de dia de la semana (del 1 al 7)");
        int dia = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día mal introducido");
        }
    }

}
