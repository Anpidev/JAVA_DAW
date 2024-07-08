package tareas.array2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Diseña el siguiente programa:
 * • Se pide por pantalla el número de celdas de la tabla o Array
 * • Si hay 10 celdas, cada celda guarda el número correspondiente a su
 * posición.
 * • Imprimir el array con un bucle for
 * • Imprimir el array con un bucle while
 * • Se debe pintar la tabla, con caracteres gráficos -------, o por el
 * contrario: |, simulando una tabla
 * visualmente.
 */
public class ArrayForWhile {

    public static void main(String[] args) {
        // Objeto Scanner para pedir espacio de memoria del array
        Scanner sc = new Scanner(System.in);
        int longitud;
        boolean continua;

        // Añador controlador de excepciones
        do {
            try {
                continua = false;
                System.out.println("Introduzca la longitud del array (número entero positivo)");
                longitud = sc.nextInt();
                int numero[] = new int[longitud];

                // Ejecución e impresión con bucle for
                System.out.println("Array con bucle for");
                for (int i = 0; i < numero.length; i++) {

                    numero[i] = i;
                    System.out.println("----------");
                    System.out.printf("|%8d|%n", numero[i]);
                    System.out.println("----------");
                }

                // Ejecución e impresion con while
                System.out.println("Array con while");
                int contador = 0;
                while (contador < longitud) {
                    numero[contador] = contador;

                    System.out.println("----------");
                    System.out.printf("|%8d|%n", numero[contador]);
                    System.out.println("----------");
                    contador++;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                sc.next();
                continua = true;
            }
        } while (continua);
        sc.close();
    }

}
