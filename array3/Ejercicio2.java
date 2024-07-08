package tareas.array3;

/*
 * 2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
originales y el resultado.  
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // IMPORTANTE PARA SUMAR MATRICES TIENEN QUE TENER LAS MISMAS DIMENSIONES

        // Variables
        int filas = 0;
        int columnas = 0;
        boolean correcto = false;
        // Objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Comprobacion de los resultados introducidos
        do {
            try {
                System.out.println("Ingrese el número de filas (1-5)");
                filas = sc.nextInt();
                System.out.println("Ingrese el número de columnas (1-5)");
                columnas = sc.nextInt();
                if (filas >= 1 && filas <= 5 && columnas >= 1 && columnas <= 5) {
                    correcto = true;
                } else {
                    System.out.println("El número introducido debe estar entre 1 y 5");
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        } while (!correcto);

        // Continuación de la ejecución
        System.out.println("Ingrese los valores de la matriz y pulse INTRO");
        // Creacion de matriz
        int matrizUno[][] = new int[filas][columnas];

        // Recorremos la matriz y la rellenamos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizUno[i][j] = sc.nextInt();
            }
        }

        // Impresión de primera matriz
        System.out.println("MATRIZ UNO: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d ", matrizUno[i][j]);
            }
            System.out.println();
        }

        // Continuación de la ejecución segundo array
        System.out.println("Ingrese los valores de la segunda matriz y pulse INTRO");
        // Creacion de matriz
        int matrizDos[][] = new int[filas][columnas];

        // Recorremos la matriz y la rellenamos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizDos[i][j] = sc.nextInt();
            }
        }
        sc.close(); // CERRAR OBJETO SCANER
        // Impresión de segunda matriz
        System.out.println("MATRIZ DOS: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d ", matrizDos[i][j]);
            }
            System.out.println();
        }
        // TERCERA MATRIZ
        int matrizTres[][] = new int[filas][columnas];

        // Recorremos la matriz y la rellenamos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTres[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        // Impresión de tercera matriz
        System.out.println("MATRIZ TRES: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d ", matrizTres[i][j]);
            }
            System.out.println();
        }
    }
}
