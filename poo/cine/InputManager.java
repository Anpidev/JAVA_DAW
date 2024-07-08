package tareas.poo.cine;

import java.util.Scanner;

public class InputManager {
    private static Scanner scanner = new Scanner(System.in);
//Metodo para cear Pelicula
public static Pelicula crearPelicula() {
    System.out.println("Introduzca los datos de la película");
    System.out.println("Título de la película:");
    String titulo = scanner.nextLine();
    System.out.println("Director de la película:");
    String director = scanner.nextLine();
    int duracion = solicitarEntero("Duración de la película (en minutos):", 1, 400);
    int edadMinima = solicitarEntero("Ingrese la edad mínima para ver la película:", 0, 120);
    return new Pelicula(titulo, director, duracion, edadMinima);
}

//Metodo para crear la Sala

    public static Sala crearSala() {
        System.out.println("Introduzca los datos de la sala de cine");
        double precio = solicitarDouble("Precio de la entrada:");
        Pelicula pelicula = crearPelicula();
        return new Sala(precio, pelicula);
    }

    // Método para crear un espectador solicitando datos por pantalla
    public static Espectador crearEspectador() {
        System.out.println("Introduzca los datos del espectador");

        System.out.println("Nombre del espectador:");
        String nombreEspectador = scanner.nextLine();

        int edadEspectador = solicitarEntero("Edad del espectador:", 0, 100);

        double dineroDisponible = solicitarDouble("Dinero disponible del espectador:");

        return new Espectador(nombreEspectador, edadEspectador, dineroDisponible);
    }

    // Método privado para solicitar un número entero dentro de un rango
    public static int solicitarEntero(String mensaje, int min, int max) {
        while (true) {
            try {
                System.out.println(mensaje);
                int entero = Integer.parseInt(scanner.nextLine());
                if (entero >= min && entero <= max) {
                    return entero;
                } else {
                    System.out.println("El número debe estar entre " + min + " y " + max + ". Inténtelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    // Método privado para solicitar un número decimal
    public static double solicitarDouble(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número decimal válido.");
            }
        }
    }


// Método privado para solicitar una columna dentro de un rango
public static char solicitarColumna(String mensaje, char min, char max) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        try {
            System.out.println(mensaje);
            String input = scanner.nextLine().toUpperCase();
            if (input.length() == 1 && input.charAt(0) >= min && input.charAt(0) <= max) {
                return input.charAt(0);
            } else {
                System.out.println("La columna debe estar entre " + min + " y " + max + ". Inténtelo de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingrese una letra válida.");
        }
    }
}
}