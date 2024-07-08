
import java.util.*;

// Clase PlantaInterior que hereda de la clase Planta
public class PlantaInterior extends Planta {
    // Constructor de la clase PlantaInterior
    public PlantaInterior(String nombre, String color, boolean tieneOlor) {
        super(nombre, "interior", color, tieneOlor);
    }

    // Implementación del método abstracto sistemaRiego
    public String sistemaRiego() {
        return "riego por goteo";
    }
}