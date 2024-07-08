package tareas.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio4
 * Realizar un programa donde se almacenan los nombres de diferentes animales.
 * Se
 * piden nombres por pantalla hasta que se introduce la palabra salir
 * Se deben visualizar todos los valores introducidos y el número de valores que
 * se
 * introducen.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        // Instanciamos la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Instanciamos la clase ArrayList
        ArrayList<String> animales = new ArrayList<>();

        // Boolean de control para petición de datos
        boolean seguir = true;
        String animalIntroducido;

        while (seguir) {
            System.out.println("Introduce un nombre de animal, para detener el programa " +
                    "introduce la palabra 'SALIR'");
            animalIntroducido = sc.nextLine();
            animales.add(animalIntroducido);

            if (animalIntroducido.equalsIgnoreCase("SALIR")) {
                System.out.println("Ha introducido 'SALIR', no se introducen más datos");
                seguir = false;
            }
        }

        for (String animal : animales) {
            System.out.println(animal);
        }
        System.out.println("Número de elementos introducidos " + animales.size());
sc.close();
    }
}