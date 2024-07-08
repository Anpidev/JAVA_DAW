package tareas.array;

import java.util.Scanner;

/**
 * Se pide por pantalla el número de posiciones1 que queremos que tenga nuestro
 * array, se
 * piden los datos por pantalla.
 * Se crea otro array, pidiendo el número de posiciones1 por pantalla. Los
 * valores se cargan con un
 * bucle for.
 * Crear un tercer array que contiene, los datos de los dos arrays.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Pedir por pantalla posición, declarar array y rellenar el array por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de posiciones que tendrá el array: ");
        int posiciones1 = sc.nextInt();
        int numero[] = new int[posiciones1];
        int i = 0;

        do {
            System.out.println("Introduzca un número entero");
            numero[i] = sc.nextInt();
            i++;
        } while (i < posiciones1);

        // Segundo array con posiciones1 por teclado pero por bucle for
        System.out.println("Introduzca el número de posiciones que tendrá el array: ");
        int posiciones2 = sc.nextInt();
        sc.close();
        int numero2[] = new int[posiciones2];

        for (i = 0; i < numero2.length; i++) {
            numero2[i] = (int) (Math.random() * 10 + 1);// Valores aleatorios del 1 al 10
        }

        // Tercer array que contiene los dos anteriores

        int numero3[] = new int[posiciones1 + posiciones2];

        // Primera parte del array
        for (i = 0; i < numero.length; i++) {
            numero3[i] = numero[i];
            System.out.println(numero3[i]);
        }

        // Segunda parte del array

        for (i = posiciones1; i < numero3.length; i++) {
            numero3[i] = numero2[i - posiciones1];
            System.out.println(numero3[i]);
        }
        
    }
}
