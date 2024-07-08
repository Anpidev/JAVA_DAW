package tareas.arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> asignaturas = new ArrayList<>();

        // Asignaturas predeterminadas
        asignaturas.add("Programación");
        asignaturas.add("Base de datos");
        asignaturas.add("Lenguaje de marcas");

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al gestor de asignaturas!");

        // Menú del programa
        int opcion;
        boolean seguir = true;
        while (seguir) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar nueva asignatura");
            System.out.println("2. Mostrar lista de asignaturas");
            System.out.println("3. Buscar asignatura por nombre");
            System.out.println("4. Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre de la nueva asignatura:");
                        String nuevaAsignatura = sc.nextLine();
                        asignaturas.add(nuevaAsignatura);
                        System.out.println("¡Asignatura agregada con éxito!");
                        break;
                    case 2:
                        System.out.println("Lista de asignaturas:");
                        for (String asignatura : asignaturas) {
                            System.out.println(asignatura);
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre de la asignatura a buscar:");
                        String nombre = sc.nextLine();
                        if (asignaturas.contains(nombre)) {
                            System.out.println("La asignatura \"" + nombre + "\" está en la lista.");
                        } else {
                            System.out.println("La asignatura \"" + nombre + "\" no está en la lista.");
                        }
                        break;
                    case 4:
                        seguir = false;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error. Por favor, ingrese una opción válida.");
                sc.nextLine(); // Limpiar el buffer en caso de error
            }
        }

        sc.close();
    }
}
