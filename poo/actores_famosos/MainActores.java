package tareas.poo.actores_famosos;

import java.util.Scanner;

public class MainActores {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ListaActores listaActores = new ListaActores();

        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1) Agregar Nombres");
            System.out.println("2) Modificar Nombres");
            System.out.println("3) Borrar Nombres");
            System.out.println("4) Buscar Nombre y en qué posición está");
            System.out.println("5) Visualizar Nombres");
            System.out.println("6) Cantidad de actores");
            System.out.println("7) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            comenzar(opcion, listaActores);
        } while (opcion != 7);
        scanner.close();
    }

    private static void comenzar(int opcion, ListaActores listaActores) {
        switch (opcion) {
            case 1:
                listaActores.agregarActor();
                break;
            case 2:
                listaActores.modificarActor();
                break;
            case 3:
                listaActores.eliminarActor();
                ;
                break;
            case 4:
                listaActores.buscarActor();
                break;
            case 5:
                listaActores.imprimirActores();
                break;
            case 6:
                listaActores.cantidadActores();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Inténtelo de nuevo.");
        }
    }
}
