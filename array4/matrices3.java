package tareas.array4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * matrices3
 * Diseña un programa en Java que pide por pantalla una palabra de x caracteres.
 * Se
 * debe crear una matriz con el mismo número de celdas que letras tiene la
 * palabra.
 * Consideraciones:
 * Cada letra se debe almacenar en una celda.
 * Se debe comprobar si hay algún valor repetido en alguna celda.
 */

public class matrices3 {
    public static void main(String[] args) {
        // Objeto scanner para peticion de palabra
        Scanner sc = new Scanner(System.in);

        // Declaración de variables e inicialización
        String palabra = " ";
        char silaba = ' ';
        int contador = 0;

        // Boolean de comprobacion
        boolean correcto;
        boolean repetido = false;

        /*
         * Bloque de código para controlar excepciones.
         * En este caso quiero que se ingrese una palabra
         * que solo contengan letras entre A-Z.
         */

        do {
            try {
                // Petición de palabra
                System.out.println("Por favor, ingrese una palabra.");
                palabra = sc.nextLine();

                // Patrón regex para comprobar que solo tiene letras
                Pattern patron = Pattern.compile("^[a-zA-Z]+$");
                Matcher matcher = patron.matcher(palabra);

                // Inicialización del booleano
                correcto = matcher.matches();

                if (!correcto) {
                    System.out.println("Vuelva a ingresar una palabra. Solo se admiten letras (A-Z)");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ocurrió un error de tipo: " + e.getMessage());
                // Limpiar el búfer del escáner
                sc.nextLine();
                // Reinicializar para permitir al usuario ingresar una nueva palabra
                correcto = false;
            }
        } while (!correcto);

        // Array char con los caracteres de la palabra ingresada
        char letras[] = palabra.toCharArray();
        // Array char para los repetidos
        char repetidos[] = new char[letras.length];

        // Recorrido para verificar letras repetidas
        for (int i = 0; i < letras.length; i++) {
            silaba = letras[i];
            repetido = false;
            // Se empieza en i+1 para comparar la letra siguiente a la que estoy en ese
            // momento
            for (int j = i + 1; j < letras.length; j++) {
                if (silaba == letras[j]) {
                    repetido = true;

                    // Verifica si la letra ya está en el array antes de agregarla
                    boolean esta = false;
                    for (int k = 0; k < contador; k++) {
                        if (repetidos[k] == silaba) {
                         esta = true;
                        }
                    }

                    if (!esta) {
                        repetidos[contador] = silaba;
                        contador++;
                    }
                }
            }
        }

        if (contador > 0) {
            System.out.println("Se repiten letras");
            for (int i = 0; i < contador; i++) {
                System.out.println(repetidos[i]);
            }
        } else {
            System.out.println("No se repiten letras en la palabra ingresada.");
        }

        sc.close();
    }
}