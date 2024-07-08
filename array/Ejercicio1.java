package tareas.array;

/**
 * 1. Diseñar un array, que almacena los números del 1 al 10. Consideraciones:
 * Utilizar un bucle for para cargar el array
 * Se deben imprimir los datos del array en sentido inverso
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaracion de arrays y asignación de memoria
        int numero[] = new int[10];

        // Asignación de valores mediante bucle for
        for (int i = 0; i < 10; i++) {
            numero[i] = i + 1; // Para que sean números del 1 al 10
        }

        // Impresión de resultados en sentido inverso
        for (int i = 9; i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }
    }
}