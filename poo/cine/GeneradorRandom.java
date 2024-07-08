package tareas.poo.cine;

import java.util.Random;

public class GeneradorRandom {
    private Random random;

    public GeneradorRandom() {
        random = new Random();
    }

    // Método para generar aleatoriamente una fila dentro de un rango específico
    public int generarFila(int minFila, int maxFila) {
        return random.nextInt(maxFila - minFila + 1) + minFila;
    }

    // Método para generar aleatoriamente una columna dentro de un rango específico
    public char generarColumna(char minColumna, char maxColumna) {
        int min = minColumna;
        int max = maxColumna;
        char columna = (char) (random.nextInt(max - min + 1) + min);
        return columna;
    }
}
    

