package tareas.array3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 3. Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos
piden hacer un menú con estas opciones:  
Rellenar TODA la matriz de números, debes pedírselo al usuario.  
Suma de una fila que se pedirá al usuario (controlar que elija una correcta)  
Suma de una columna que se pedirá al usuario (controlar que elija una correcta)  
Sumar la diagonal principal (ver ejemplo)  
Sumar la diagonal inversa (ver ejemplo)  
La media de todos los valores de la matriz  
IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de
ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.  
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Variables declaradas e inicializadas
        int filas = 0;
        int columnas = 0;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int sumaDiagInversa = 0;
        int contador = 0;

        // Variable booleana de control
        boolean correcto = false;
        // Matriz vacia
        int matriz[][] = new int[4][4];

        // Pedimos al usuario rellenar la matriz

        System.out.println("Ingrese los valores de la matriz de 4x4 uno por uno y pulse INTRO:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
                contador++;
            }
        }

        // Pedimos al usuario una fila para sumar
        System.out.println("Vamos a sumar una fila");

        // Control de la fila
        do {
            try {
                System.out.println("Ingrese el número de filas (1-4)");
                filas = sc.nextInt();

                if (filas >= 1 && filas <= 4) {
                    correcto = true;
                } else {
                    System.out.println("El número introducido debe estar entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        } while (!correcto);

        // Suma de la fila

        for (int j = 0; j < 4; j++) {
            sumaFila += matriz[filas - 1][j]; // Los arrays empiezan en cero
        }

        System.out.printf("La suma de la fila %d es %d", filas, sumaFila);

        // Pedimos al usuario una columna para sumar
        System.out.println("Vamos a sumar una columna");

        // Control de la columna
        correcto = false; // Reiniciamos la variable de control
        do {
            try {
                System.out.println("Ingrese el número de columnas (1-4)");
                columnas = sc.nextInt();

                if (columnas >= 1 && columnas <= 4) {
                    correcto = true;
                } else {
                    System.out.println("El número introducido debe estar entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
            }
        } while (!correcto);
        sc.close(); //CIERRE DE SCANNER 
        // Suma de la columna

        for (int i = 0; i < 4; i++) {
            sumaColumna += matriz[i][columnas - 1];
        }

        System.out.printf("La suma de la columna %d es %d", columnas, sumaColumna);

        // Suma de la diagonal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.printf("La suma de la diagonal principal es %d", sumaDiagonal);

        // Suma de la diagonal inversa
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3 - i) {
                    sumaDiagInversa += matriz[i][j];
                }
            }
        }
        System.out.printf("La suma de la diagonal inversa es %d", sumaDiagInversa);

        // Media de los valores de la matriz
        int sumaTotal = sumaColumna + sumaFila;
        int media = sumaTotal / contador;

        System.out.println("La media de los valores de la matriz es: " + media);

    }
}
