package tareas.arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio1
 * Programa Java que lea una serie de valores numéricos enteros desde el teclado
 * y los guarde
 * en un ArrayList de tipo Integer. La lectura de números enteros termina cuando
 * se introduzca el
 * valor -99. Este valor no se guarda en el ArrayList.
 * A continuación el programa mostrará por pantalla el número de valores que se
 * han leído, su
 * suma y su media. Por último se mostrarán todos los valores leídos, indicando
 * cuántos de ellos
 * son mayores que la media.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Instancia clase ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Instancia clase Scanner
        Scanner sc = new Scanner(System.in);

        // Petición de datos por pantalla
        int valor = 0;
        int contador = 0;
        int suma = 0;
        double media = 0;
        System.out.println("Lista de valores, introduzca un valor");
        System.out.println("Si introduce -99, el programa terminará");
        while (valor != -99) {
            System.out.println("Valor: ");
            valor = sc.nextInt();
            if (valor != -99) {
                numeros.add(valor);
                contador++;
                suma += valor;
            }
        }

        // Calculo de media
        media = (double) suma / contador;
        System.out.println("Cantidad de valores leídos: " + contador);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

        int encimaMedia = 0;
        // Comprobacion de valores por encima de la media
        System.out.println("Valores por encima de la media:");
        for (Integer numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
                encimaMedia++;
            }
        }
        System.out.println("Total valores por encima de la media: " + encimaMedia);
        sc.close();

    }
}