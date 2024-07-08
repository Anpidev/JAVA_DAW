package tareas.arraylist2;
import java.util.ArrayList;
/*Realiza un programa donde almacenamos los nombres de animales, dichos nombres se
almacenan en un Arraylist. Se piden valores hasta que se teclea la palabra SALIR. */
import java.util.Scanner;

public class Ejercicio2 {
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