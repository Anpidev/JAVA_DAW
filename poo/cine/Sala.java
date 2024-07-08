package tareas.poo.cine;

public class Sala {

    // Constructor
    public Sala(double precio, Pelicula pelicula) {
        asientos = new Asiento[FILAS][COLUMNAS];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas();
    }

    // Getter y setter

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public int getFILAS() {
        return FILAS;
    }

    public int getCOLUMNAS() {
        return COLUMNAS;
    }

    // Métodos para crear un objeto asiento por cada posición
    private void rellenaButacas() {
        int fila = FILAS;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                char columna = (char) ('A' + j);
                asientos[i][j] = new Asiento(fila, columna);
            }
            fila--;
        }
    }

    // Método para reservar un asiento para un espectador
    public void reservarAsiento(Asiento asiento, Espectador espectador) {
        if (!asiento.ocupado()) {
            asiento.asignarEspectador(espectador);
        } else {
            System.out.println("El asiento " + asiento.getFila() + asiento.getColumna() + " ya está ocupado.");
        }
    }

    // Método para liberar un asiento ocupado
    public void liberarAsiento(Asiento asiento) {
        if (asiento.ocupado()) {
            asiento.setEspectador(null);
        } else {
            System.out.println("El asiento " + asiento.getFila() + asiento.getColumna() + " ya está libre.");
        }
    }

    // Método para liberar un asiento ocupado por un espectador específico
    public void liberarAsientoPorNombre(String nombreEspectador) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Asiento asiento = asientos[i][j];
                Espectador espectador = asiento.getEspectador();
                if (espectador != null && espectador.getNombre().equals(nombreEspectador)) {
                    asiento.setEspectador(null);
                    return;
                }
            }
        }
        System.out.println("No se encontró ningún asiento ocupado por " + nombreEspectador);
    }

    // Método para imprimir los asientos
    @Override
    public String toString() {
        StringBuilder asientosEtiquetados = new StringBuilder();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Asiento asiento = asientos[i][j];
                if (asiento.getEspectador() != null) {
                    asientosEtiquetados.append("X "); // Marcar con "X" si el asiento está ocupado
                } else {
                    asientosEtiquetados.append(i + 1); // Mostrar el número de fila
                    asientosEtiquetados.append((char) ('A' + j)); // Mostrar la letra de columna
                    asientosEtiquetados.append(" "); // Agregar espacio entre asientos
                }
            }
            asientosEtiquetados.append("\n"); // Agregar salto de línea al final de cada fila
        }
        return asientosEtiquetados.toString();
    }

    // Campos de clase
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
    private final int FILAS = 8;
    private final int COLUMNAS = 9;
}