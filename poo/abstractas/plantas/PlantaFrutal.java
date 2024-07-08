
import java.util.*;

// Clase PlantaFrutal que hereda de la clase Planta
public class PlantaFrutal extends Planta {
    // Constructor de la clase PlantaFrutal
    public PlantaFrutal(String nombre, String color, boolean tieneOlor) {
        super(nombre, "frutal", color, tieneOlor);
    }

    // Implementación del método abstracto sistemaRiego
    public String sistemaRiego() {
        return "riego discontinuo";
    }
}