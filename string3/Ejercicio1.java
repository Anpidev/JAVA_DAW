/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.string3;

import java.util.Scanner;

/**
 * Tarea String Objetivos: • Uso de estructuras de control: • Estructuras de
 * selección. • Estructuras de repetición. • Estructuras de salto. • Control de
 * excepciones. • Prueba y depuración. • Documentación. 1. 1.Diseña un programa
 * para utilizar el objeto String. Se pide por pantalla una dirección de correo
 * electrónico, se debe comprobar: • Que contiene la @ • Que no se teclea más de
 * 1 @ • Que aparece un punto, al final del correo electrónico. • Que la
 * longitud mínima sea de 20 caracteres. • Que los textos aparecen en
 * minúsculas.
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        // Pedimos la contraseña por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña:");
        String passwordIntroducido = sc.nextLine();

        // Definimos los caracteres @ y .
        char arroba = '@';
        char punto = '.';

        // Definimos contador de arrobas
        int contador = 0;

        //Definimos el boolean para las mayúsculas
        Boolean esMayusculas = false;

        if (passwordIntroducido.length() >= 20) {
            if (passwordIntroducido.charAt(passwordIntroducido.length() - 1) == punto) {

                for (int i = 0; i < passwordIntroducido.length(); i++) {
                    char letra = passwordIntroducido.charAt(i);
                    if (letra == arroba) {
                        contador++;
                    }

                    if (Character.isUpperCase(letra)) {
                        esMayusculas = true;
                    }

                }

                if (esMayusculas) {
                    System.out.println("La contraseña debe estar en minúsculas");
                }

                if (contador > 1) {
                    System.out.println("La contraseña solo puede tener máximo un arroba");
                } else if (contador <= 0) {
                    System.out.println("La contraseña debe tener mínimo un arroba");
                }
            } else {
                System.out.println("La contraseña debe terminar en punto");
            }
        } else {
            System.out.println("Error. Longitud mínima 20 caracteres");
        }

        sc.close();
    }
}
