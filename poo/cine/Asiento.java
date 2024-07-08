package tareas.poo.cine;

public class Asiento {

    // Constructor
    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = null; // Asiento vacío por defecto
    }
    // Getter y setter

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    // Métodos para saber si está ocupado el asiento
    public boolean ocupado() {
        return espectador != null;
    }

    // Métodos para el espectador en un asiento
    public void asignarEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public void verificarEstado() {
        if (ocupado()) {
            System.out.println("El asiento está ocupado.");
        } else {
            System.out.println("El asiento está libre.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (ocupado()) {
            sb.append("El asiento ").append(fila).append(columna).append(" está ocupado.");
        } else {
            sb.append("El asiento ").append(fila).append(columna).append(" está libre.");
        }
        return sb.toString();
    }

    // Campos de clase
    private int fila;
    private char columna;
    private Espectador espectador;
}