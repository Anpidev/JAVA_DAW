package tareas.arraylist;

import java.util.ArrayList;

/**
 * Ejercicio1
 * Diseña un programa en Java que crea un arraylist, que contiene los nombres de
 * 4
 * personas. Mostrar los datos del array al completo.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        // Instanciamos el ArrayList nombres
        ArrayList<String> nombres = new ArrayList<String>();

        /*
         * A partir de java 7 también se acepta lo siguiente:
         * ArrayList<String> nombres = new ArrayList<>();
         */

        // Añadimos nombres al Arraylist
        nombres.add("Angela");
        nombres.add("Maria");
        nombres.add("Manuel");
        nombres.add("Pilar");

        // Mediante un foreach accedemos a los nombres del Arraylist y los imprimimos
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

}