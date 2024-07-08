package tareas.arraylist;

import java.util.ArrayList;

/**
 * Ejercicio3
 * Diseña un arrayList con los siguientes datos:
 * 
 * Sofía
 * 
 * Chema
 * 
 * Alex
 * 
 * Rosa
 * Consideraciones
 * 
 * Mostrar con la propiedad pertinente el tamaño del arraylist.
 * 
 * Buscar el valor de Juan, con el método en cuestión para ver si lo contiene.
 * Mostrar el mensaje si lo contiene o no, según proceda
 * 
 * Borra el ultimo element del arraylist
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        // Instanciamos la clase ArrayList
        ArrayList<String> nombres = new ArrayList<>();

        // Añadimos los datos
        nombres.add("Sofía");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");

        // Impresion del ArrayList
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Mostramos el tamaño del ArrayList
        System.out.println("El ArrayList tiene el tamaño: " + nombres.size());

        // Buscamos el valor de Juan
        int posicionJuan = nombres.indexOf("Juan");

        // Mostramos mensaje según esté en ArrayList o no
        if (posicionJuan == -1) {
            System.out.println("Juan no está en el ArrayList");
        } else {
            System.out.println("Juan está en la posición " + posicionJuan);
        }

        // Borramos el último elemento del ArrayList
        nombres.remove(nombres.size() - 1);

        // Impresión del ArrayList
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}