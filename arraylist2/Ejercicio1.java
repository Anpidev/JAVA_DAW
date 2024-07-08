package tareas.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores.
Visualizar todos los valores y la media.   */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Instancia de clase ArrayList
        ArrayList<Integer> enteros = new ArrayList<>();

        // Vamos a pedir los 5 enteros por pantalla
        // Instancia de clase scanner
        Scanner sc = new Scanner(System.in);

        // Bucle while para los cinco valores
        int contador = 0;
        while (contador < 5) {
            System.out.println("Introduzca un valor entero");
            int dato = sc.nextInt();
            enteros.add(dato);
            contador++;
        }

        // Visualización del ArrayList y suma de sus componentes
        int suma = 0;
        for (Integer entero : enteros) {
            System.out.println(entero);
            suma += entero;
        }

        // Media de los enteros del ArrayList
        double media = (double) suma / enteros.size(); // calculamos la media
        System.out.println("La media de los enteros del ArrayList es: " + media);

        sc.close();
    }
}