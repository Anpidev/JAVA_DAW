


import java.util.*;

// Creamos la clase abstracta Planta
abstract class Planta {


    // Constructor de la clase Planta
    public Planta(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método abstracto sistemaRiego
    public abstract String sistemaRiego();

    // Método para obtener el nombre de la planta
    public String getNombre() {
        return this.nombre;
    }

    // Método para obtener el tipo de la planta
    public String getTipo() {
        return this.tipo;
    }
    // Método para obtener el color de la planta
    public String getColor() {
        return this.color;
    }

    // Método para verificar si la planta tiene olor
    public boolean tieneOlor() {
        return this.tieneOlor;
    }

        // Campos de clase
    private String nombre;
    private String tipo;
    private String color;
    private boolean tieneOlor;
}
