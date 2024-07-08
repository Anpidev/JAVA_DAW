package tareas.poo.creacion_vectores;

import java.util.Random;

/*3. Desarrollar un programa que utilice:
a) Un metodo para generar dos vectores A y B de 20 valores aleatorios del 1 al 20
cada uno. Como parámetros tendremos solo un vector.
b) Mediante un método calcular C(i)=A(i)+B(i).
c) Mediante otro método visualizaremos por pantalla los tres vectores A,B,C */

public class CreacionVectores {
    public static void main(String[] args) {


        // Paso 1: Generar los vectores A y B a partir del vector dado como parámetro
        int[] vectorA = generarVectorAleatorio();
        int[] vectorB = generarVectorAleatorio();

        // Paso 2: Calcular el vector C
        int[] vectorC = calcularVectorC(vectorA, vectorB);

        // Paso 3: Visualizar los tres vectores A, B y C
        visualizarVectores(vectorA, vectorB, vectorC);
    }

    // Método para generar un vector aleatorio de tamaño 20 con valores entre 1 y 20
    private static int[] generarVectorAleatorio() {
        Random aleatorio = new Random();
        int[] vector = new int[20];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(20) + 1; // Rellena el vector con números aleatorios del 1 al 20
        }
        return vector;
    }

    // Método para calcular el vector C
    private static int[] calcularVectorC(int[] vectorA, int[] vectorB) {
        int[] vectorC = new int[20];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        return vectorC;
    }

    // Método para visualizar por pantalla los tres vectores A, B y C
    private static void visualizarVectores(int[] vectorA, int[] vectorB, int[] vectorC) {
        System.out.println("Vector A:");
        mostrarVector(vectorA);
        System.out.println("\nVector B:");
        mostrarVector(vectorB);
        System.out.println("\nVector C:");
        mostrarVector(vectorC);
    }

    // Método para mostrar un vector en consola
    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}