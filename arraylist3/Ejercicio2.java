package tareas.arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio2
 * Diseña un programa que almacena n números aleatorios, positivos. Se pide:
 * Imprimir todos los valores del arraylist
 * Mostrar cual es el primer valor
 * Mostrar el último valor
 * Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si,
 * se almacena
 * el valor tecleado en el arralist.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Instancia de la clase ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        // Añado valores, como ArrayList tiene por defecto asignado 10 celdas, voy a
        // meter 10 valores para optimizar recursos.
        numeros.add(10);
        numeros.add(45);
        numeros.add(15);
        numeros.add(34);
        numeros.add(29);
        numeros.add(48);
        numeros.add(2);
        numeros.add(5);
        numeros.add(30);
        numeros.add(65);

        // Instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Impresión de valores
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Mostrar primer valor
        System.out.println("El primer valor de la lista es: " + numeros.get(0));

        // Mostrar último valor
        System.out.println("El último valor de la lista es: " + numeros.get((numeros.size() - 1)));

        // Perdir por pantalla si se quiere añadir mas valores
        // Boolean para controlar la petición por pantalla
        boolean error = true;
        while (error) {
            System.out.println("¿Quiere añadir un valor a la lista? (S/N)");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("S")) {
                System.out.println("Introduzca el valor a añadir: ");
                int valor = sc.nextInt();
                // Consumir el carácter de nueva línea en el búfer de entrada (Buenas prácticas)
                sc.nextLine();
                numeros.add(valor);
                error = false;
            } else if (opcion.equalsIgnoreCase("N")) {
                System.out.println("No se introducirá ningún valor");
                error = false;
            } else {
                System.out.println("Opción incorrecta. Debe marcar S(Si) o N(NO)");
            }

        }

        sc.close();
    }

}