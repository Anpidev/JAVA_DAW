package tareas.arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio4
 * Crea un programa en Java para gestionar una lista de números utilizando tanto
 * un ArrayList
 * como un array convencional. El programa permitirá realizar operaciones
 * básicas como agregar
 * números, calcular la suma y encontrar el número más grande en ambas
 * estructuras.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear un ArrayList para almacenar los números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números iniciales al ArrayList
        numeros.add(13);
        numeros.add(34);
        numeros.add(56);
        numeros.add(76);

        // Bucle para mostrar el menú y realizar operaciones
        boolean salir = false;
        while (!salir) {

            // Mostrar el menú para el ArrayList
            menu();
            int opcion = sc.nextInt();
            sc.nextLine();

            // Realizar la operación seleccionada por el usuario para el ArrayList
            switch (opcion) {
                case 1:
                    agregarNumero(numeros, sc);
                    break;
                case 2:
                    mostrarNumeros(numeros);
                    break;
                case 3:
                    calcularSuma(numeros);
                    break;
                case 4:
                    encontrarMaximo(numeros);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }

        // Reiniciar variable booleana

        salir = false;

        // Versión con array
        System.out.println("ARRAY DE NÚMEROS");
        int numerosArray[] = { 13, 5, 6, 89, 67 };

        while (!salir) {
            menu();
            int opcionArray = sc.nextInt();
            sc.nextLine();

            // Realizar la operación seleccionada por el usuario para el array
            switch (opcionArray) {
                case 1:
                    numerosArray = agregarNumero(numerosArray, sc);
                    break;
                case 2:
                    mostrarNumeros(numerosArray);
                    break;
                case 3:
                    calcularSuma(numerosArray);
                    break;
                case 4:
                    encontrarMaximo(numerosArray);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
        // Cerrar el Scanner
        sc.close();
    }

    // Método para mostrar el menú
    public static void menu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Agregar nuevo número");
        System.out.println("2. Mostrar lista de números");
        System.out.println("3. Calcular la suma de los números");
        System.out.println("4. Encontrar el número más grande");
        System.out.println("5. Salir");
    }

    // Método para agregar un nuevo número al ArrayList
    public static void agregarNumero(ArrayList<Integer> numeros, Scanner sc) {
        System.out.println("Ingrese un nuevo número:");
        int numeroNuevo = sc.nextInt();
        numeros.add(numeroNuevo);
    }

    // Método para agregar un nuevo número al array
    public static int[] agregarNumero(int[] numerosArray, Scanner sc) {
        System.out.println("Ingrese un nuevo número:");
        int valor = sc.nextInt();

        int nuevoArray[] = new int[numerosArray.length + 1];
        for (int i = 0; i < numerosArray.length; i++) {
            nuevoArray[i] = numerosArray[i];
        }
        nuevoArray[numerosArray.length] = valor;
        return nuevoArray;
    }

    // Método para mostrar los números en el ArrayList
    public static void mostrarNumeros(ArrayList<Integer> numeros) {
        System.out.println("Lista de números:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

    // Método para mostrar los números en el array
    public static void mostrarNumeros(int[] numerosArray) {
        System.out.println("Lista de números:");
        for (int nuevo : numerosArray) {
            System.out.println(nuevo);
        }
    }

    // Método para calcular la suma de los números en el ArrayList
    public static void calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de los números es: " + suma);
    }

    // Método para calcular la suma de los números en el array
    public static void calcularSuma(int[] numerosArray) {
        int suma = 0;
        for (int nuevo : numerosArray) {
            suma += nuevo;
        }

        System.out.println("La suma de los números es: " + suma);
    }

    // Método para encontrar el número más grande en el ArrayList
    public static void encontrarMaximo(ArrayList<Integer> numeros) {
        int maximo = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El número más grande de la lista es: " + maximo);
    }

    // Método para encontrar el número más grande en el array
    public static void encontrarMaximo(int[] numerosArray) {
        int maximo = Integer.MIN_VALUE;
        for (int nuevo : numerosArray) {
            if (nuevo > maximo) {
                maximo = nuevo;
            }
        }
        System.out.println("El número más grande de la lista es: " + maximo);
    }

}