package tareas.array;

/**
 * Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea
 * un array con datos
 * enteros con valores del 1 al 6.
 * Diseña un tercer array que tiene el mismo número de celdas que la suma de las
 * celdas de los
 * dos arrays anteriores.
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        // Creacion de arrays con los valores ya asignados
        char[] caracteres = { 'a', 'e', 'r', 't', 'y', 'u' };
        int[] valores = { 1, 2, 3, 4, 5, 6 };

        // Tercer array solo con la longitud añadida
        int[] resultado = new int[caracteres.length + valores.length];

        // Creamos un tercer array aleatorio con esa longitud
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = (int) (Math.random() * 50 + 1);
            System.out.print(resultado[i] + " ");

        }

    }
}
