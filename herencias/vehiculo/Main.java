import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Vehiculo, Turismo y Deportivo
        Vehiculo vehiculo1 = new Vehiculo("111AAAA", "Ford", "Focus", "Gris", 4, 150);
        Turismo turismo1 = new Turismo("2000BBC", "BMW", "M3", "Negro", 4, 120, 5);
        Deportivo deportivo1 = new Deportivo("789HGY", "Audi", "A3", "Rojo", 2, 720, true);

        // Almacenar los vehículos en un array
        Vehiculo[] vehiculos = {vehiculo1, turismo1, deportivo1};

        // Almacenar los vehículos en una lista
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(turismo1);
        listaVehiculos.add(deportivo1);
    }
}
