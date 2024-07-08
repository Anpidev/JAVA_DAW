package tareas.array3;

/*
 * Práctica Final Matrices
1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
aleatorios entre 0 y 10.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Variables
        int columnas=0;
       
        //Objeto Scanner para pedir al usuario
        Scanner sc = new Scanner (System.in);

        //Petición de datos
        System.out.println("Ingrese el número de columnas que quiere para la matriz");
        System.out.println("El número debe estar entre 1 y 20, inclusives");
        
        //trycatch para controlar que se mete el número de columnas adecuado
        boolean correcto=false;
        try {
            while (!correcto) {
                columnas = sc.nextInt();
            if (columnas>=1&&columnas<=20) {
                correcto=true;
            }else{
                System.out.println("Vuelva a ingresar el número de columnas");   
            }
            }
        } catch (InputMismatchException e) {
            sc.nextLine(); // Limpiar el búfer del scanner
        }
        sc.close();
        
        //Seguimos con la ejecución del programa 
        System.out.println("Número de columnas ingresado correctamente: " + columnas);

        // Crear matriz
        int[][] numeros = new int[5][columnas];

        // Rellenar la matriz con números aleatorios
        for (int i = 0; i < 5; i++) { // filas
            for (int j = 0; j < columnas; j++) { // columnas
                numeros[i][j] = (int) (Math.random() * 11);
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d ", numeros[i][j]);
            }
            System.out.println();
        }
    }
}