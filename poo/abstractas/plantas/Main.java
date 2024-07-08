
import java.util.*;

// Clase Principal
public class Main {

 // Crear una instancia de una planta interior
        Planta plantaInterior = new PlantaInterior("Cactus", "Verde", false);

        // Mostrar las propiedades de la planta interior
        System.out.println("Nombre de la planta: " + plantaInterior.getNombre());
        System.out.println("Tipo de planta: " + plantaInterior.getTipo());
        System.out.println("Color de la planta: " + plantaInterior.getColor());
        System.out.println("¿Tiene olor? " + (plantaInterior.tieneOlor() ? "Sí" : "No"));

        // Utilizar el método sistemaRiego
        System.out.println("Sistema de riego recomendado para planta interior: " + plantaInterior.sistemaRiego());
        System.out.println();

        // Crear una instancia de una planta exterior
        Planta plantaExterior = new PlantaExterior("Rosa", "Blanca", true);

        // Mostrar las propiedades de la planta exterior
        System.out.println("Nombre de la planta: " + plantaExterior.getNombre());
        System.out.println("Tipo de planta: " + plantaExterior.getTipo());
        System.out.println("Color de la planta: " + plantaExterior.getColor());
        System.out.println("¿Tiene olor? " + (plantaExterior.tieneOlor() ? "Sí" : "No"));

        // Utilizar el método sistemaRiego
        System.out.println("Sistema de riego recomendado para planta exterior: " + plantaExterior.sistemaRiego());
        System.out.println();

        // Crear una instancia de una planta frutal
        Planta plantaFrutal = new PlantaFrutal("Mango", "Verde", true);

        // Mostrar las propiedades de la planta frutal
        System.out.println("Nombre de la planta: " + plantaFrutal.getNombre());
        System.out.println("Tipo de planta: " + plantaFrutal.getTipo());
        System.out.println("Color de la planta: " + plantaFrutal.getColor());
        System.out.println("¿Tiene olor? " + (plantaFrutal.tieneOlor() ? "Sí" : "No"));

        // Utilizar el método sistemaRiego
        System.out.println("Sistema de riego recomendado para planta frutal: " + plantaFrutal.sistemaRiego());
    }
}
