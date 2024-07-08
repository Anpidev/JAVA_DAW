package tareas.arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/*Realizar un programa para gestionar la lista de Empleados, en que tendremos el
siguiente menú:  

Agregar Nombres.  
Modificar nombre  
Borrar Nombres.  
Visualizar un Nombre  
Visualizar todos Nombres.  
Salir.  
Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.  
La opción 2 modificará los datos de un empleado.  
La opción 3, nos dirá como queremos borrar, nos tiene que dar opción a borrar por
posición o por nombre  
La opción 4 muestra un nombre, según la posición que queremos, hay que comprobar
si la posición es correcta.  
La opción 5 muestra por pantalla un listado de todos los empleados  
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se
seleccione la opción 6, que terminará el programa.   */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Instancia de clase ArrayList
        ArrayList<String> empleados = new ArrayList<>();
        // Añadir algunos nombres al ArrayList
        empleados.add("Juan");
        empleados.add("María");
        empleados.add("Carlos");
        empleados.add("Laura");
        empleados.add("Aída");
        empleados.add("Angela");
        empleados.add("Pepe");
        empleados.add("Manolo");
        empleados.add("Javier");

        // Instancia de clase Scanner
        Scanner sc = new Scanner(System.in);

        // Boolean para control de opciones
        boolean seguir = true;
        int opcion;

        while (seguir) {
            System.out.println("\nMENÚ PRINCIPAL: LISTA EMPLEADOS"
                    + "\nElige una opción:"
                    + "\n1- Agregar nombres"
                    + "\n2- Modificar nombres"
                    + "\n3- Borrar nombres"
                    + "\n4- Visualizar un nombre"
                    + "\n5- Visualizar todos los nombres"
                    + "\n6- Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el número de nombres a agregar: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea después del número
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Escriba el nombre del empleado:");
                        String nombre = sc.nextLine();
                        empleados.add(nombre);
                    }
                    break;

                case 2:
                    System.out.println("Escriba el índice del empleado a modificar:");
                    int indice = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea después del número
                    System.out.println("Escriba el nuevo nombre:");
                    String nuevoNombre = sc.nextLine();
                    if (indice >= 0 && indice < empleados.size()) {
                        empleados.set(indice, nuevoNombre);
                    } else {
                        System.out.println("El índice proporcionado es inválido.");
                    }
                    break;

                case 3:
                    System.out.println("¿Desea borrar por posición o por nombre? (P/N)");
                    String opcionBorrar = sc.nextLine().toUpperCase();
                    if (opcionBorrar.equals("P")) {
                        System.out.println("Ingrese la posición a borrar:");
                        int pos = sc.nextInt();
                        if (pos >= 0 && pos < empleados.size()) {
                            empleados.remove(pos);
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    } else if (opcionBorrar.equals("N")) {
                        System.out.println("Ingrese el nombre a borrar:");
                        String nombreBorrar = sc.nextLine();
                        if (empleados.contains(nombreBorrar)) {
                            empleados.remove(nombreBorrar);
                        } else {
                            System.out.println("El nombre no existe en la lista.");
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese la posición del empleado a visualizar:");
                    int pos = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea después del número
                    if (pos >= 0 && pos < empleados.size()) {
                        System.out.println("Empleado en la posición " + pos + ": " + empleados.get(pos));
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Lista de empleados:");
                    for (String empleado : empleados) {
                        System.out.println(empleado);
                    }
                    break;

                case 6:
                    seguir = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
        sc.close();
    }
}