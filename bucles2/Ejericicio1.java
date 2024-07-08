
package tareas.bucles2;

import java.util.Scanner;

/**
 * 1.Se pide por pantalla, un número, para comprobar si es primo. Si se
 * introduce el número cero termina el juego.
 *
 * @author angelaruiz
 */
public class Ejericicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean primo = true;
        do {
            System.out.println("Ingrese un número entero por pantalla, si escribe 0 el bucle acaba");
            num = sc.nextInt();

            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if ((num % i) == 0) {
                        primo = false;
                    }
                }

                if (primo) {
                    System.out.println("El número introducido es primo.");
                } else {
                    System.out.println("El número introducido no es primo.");
                }
            } else if (num == 0) {
                System.out.println("Número igual a cero, el bucle se cierra");
            }

        } while (num > 0);
        sc.close();
    }
}
