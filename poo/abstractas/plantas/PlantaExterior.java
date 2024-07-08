
import java.util.*;

// Clase PlantaExterior que hereda de la clase Planta
public class PlantaExterior extends Planta {
    // Constructor de la clase PlantaExterior
    public PlantaExterior(String nombre, String color, boolean tieneOlor) {
        super(nombre, "exterior", color, tieneOlor);
    }

    // Implementación del método abstracto sistemaRiego
    public String sistemaRiego() {
        return "riego permanente";
    }
}