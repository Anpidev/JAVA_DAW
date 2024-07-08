/*Rellena un vector de manera aleatoria(1 a 10) y muéstralo al derecho y al revés.
Vamos a tener dos métodos uno para mostrarlo al derecho y otro para mostrarlo al revés. */

import java.util.Random;

public class VectorAleatorio {



    //Metodo principal para realizar los metodos
    public static void main(String[] args) {
        VectorAleatorio programa = new VectorAleatorio();
        System.out.println("VECTOR ORIGINAL");
        programa.mostrarVector(programa.vector);
        System.out.println();
        System.out.println("VECTOR INVERSO");
        programa.mostrarVectorAlReves(programa.vector);
    }

    //Constructor

    public VectorAleatorio(){
        iniciarVector();
    }

    //Metodo para iniciar el vector en el constructor
    private void iniciarVector(){
        Random aleatorio = new Random();
        vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(10) + 1; // Rellena el vector con números aleatorios del 1 al 10
        }
    }

    //Metodos para mostrar el vector al derecho y al reves
    private void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    private void mostrarVectorAlReves(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
    }

    //CAMPOS DE CLASE
    private int[] vector;


}
