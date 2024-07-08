package tareas.arrayBi;

/*
 * 1. Dada la siguiente matriz, crear un bloque de código que aparezca de la siguiente
forma:
{3 4 5 78 }
{0 0 0 0 }
{1 1 1 1}
{6 6 6 -1}
El array bidimensional es el siguiente:
Int[][]números=new int[][]{3,4,5,78},
{0,0,0,0}
{1,1,1,1}
{6,6,6,-1};

Consideraciones:
 Mostrar cual es el mayor valor de todos los que tiene la matriz
 Mostrar cual es el menor valor de todos los que tiene la matriz
 Imprime solamente los valores de la primera y la última fila de la matriz
 */
public class Ejercicio {
    public static void main(String[] args) {

        // Definir variables para máximo y mínimos
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        // Declarar array inicial con valores
        int[][] numeros = new int[][] { { 3, 4, 5, 78 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 6, 6, 6, -1 } };
        System.out.println("Impresión del array entero");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Vamos a imprimir la primera fila del array y la última");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maximo) {
                    maximo = numeros[i][j];
                } else if (numeros[i][j] < minimo) {
                    minimo = numeros[i][j];
                }
                if (i == 0 || i == numeros.length - 1) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.printf("El número mayor del array es %d y el menor %d", maximo, minimo);
    }
}
