package tareas.array;

import java.util.Scanner;

/**
 * Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se
 * piden por
 * pantalla. Se debe calcular su nota media final.
 * Si la media>=5, la calificación es aprobado
 * Si la media<5, la calificación es suspenso
 * Si la media>5 y <=6.5 la calificación es bien
 * Si la media >6.5 y <=8.5 la calificación es notable
 * Si la media >8.5 y >=9 la calificación es sobresaliente
 * 
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        // Declaracion de scanner, array y variable.
        Scanner sc = new Scanner(System.in);
        double[] nota = new double[6];
        double total = 0;

        try {
            // Ingresar las calificaciones
            for (int i = 0; i < 6; i++) {
                System.out.println("Ingrese la nota obtenida en la asignatura " + (i + 1) + ": ");
                nota[i] = sc.nextDouble();
                total += nota[i];
            }

            // Calcular la media
            double media = total / nota.length;

            // Determinar la calificación
            if (media < 5) {
                System.out.println("Su calificación es suspenso");
            } else {
                System.out.println("Está aprobado");
                if (media > 5 && media <= 6.5) {
                    System.out.println("Su calificación es bien");
                } else if (media > 6.5 && media <= 8.5) {
                    System.out.println("Su calificación es notable");
                } else if (media > 8.5 && media <= 9) {
                    System.out.println("Su calificación es sobresaliente");
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("No ha introducido una nota válida");
        }
    }
}
