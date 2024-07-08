package tareas.array;

/**
 * Diseña un array con los números del 1-57, se debe mostrar el número de celdas
 * que
 * contienen números pares y el número de celdas que contienen números impares
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        // Declaracion del array
        int[] numero = new int[57];

        // Declaracion de variables para pares e impares
        int pares = 0;
        int impares = 0;

        // Ejecución del bucle
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i + 1;
            if (numero[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        // Resultados
        System.out.println("Del 1 al 57 hay " + pares + " pares y " + impares + " impares.");
    }
}
