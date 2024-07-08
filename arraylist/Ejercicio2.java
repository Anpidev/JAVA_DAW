package tareas.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio2
 * Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan
 * en un
 * arraylist. Posteriormente se pregunta si se desean imprimir los datos, en
 * caso
 * afirmativo mostrar los datos por pantalla.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        // Instancia de la clase Scanner , objeto sc.
        Scanner sc = new Scanner(System.in);

        // Instancia de la clase ArrayList, objeto datos.
        ArrayList<Integer> datos = new ArrayList<Integer>();

        // Pedimos cinco datos por pantalla
        int contador = 0;
        int dato;

        while (contador < 5) {
            System.out.println("Por favor, introduzca un entero: ");
            dato = sc.nextInt();
            datos.add(contador, dato);
            contador++;
        }

      

        // Pedimos si quiere imprimir por pantalla los datos
        String imprimir;
        System.out.println("¿Quiere imprimir los datos? (Si/No)");
        imprimir = sc.nextLine();

        // Boolean para controlar la petición de imprimir datos
        boolean repetir = true;

        while (repetir) {
            if (imprimir.equalsIgnoreCase("si")) {
                for (Integer datosimpresos : datos) {
                    System.out.println(datosimpresos);
                }
                repetir = false; // Salir del bucle después de imprimir los datos
            } else if (imprimir.equalsIgnoreCase("no")) {
                System.out.println("No hay impresión de datos");
                repetir = false; // Salir del bucle sin imprimir datos
            } else {
                System.out.println("Respuesta incorrecta, por favor, introduzca Si o No");
                imprimir = sc.next();
            }
        }
        sc.close();
    }
}