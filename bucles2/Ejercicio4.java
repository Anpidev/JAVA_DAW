package tareas.bucles2;

import java.util.Scanner;

/**
 * Escribir un programa que pide por pantalla un número entre el 0 y 999. Nos
 * aparece un mensaje con el número de dígitos que tiene el número que
 * introduce. Si se teclea el valor cero, se acaba el juego.
 *
 * @author angelaruiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entre 0 y 999");
        int num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println("Juego terminado.");
        } else if (num > 0 && num <= 999) {
            int digitos = 0;
            int aux = num;

            while (aux != 0) {
                aux /= 10;
                digitos++;
            }

            System.out.println("El número " + num + " tiene " + digitos + " dígitos.");
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 999.");
        }
    }
}
