// Clase Deportivo
public class Deportivo extends Vehiculo {


    // Constructor
    public Deportivo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia, boolean descapotable) {
        super(matricula, marca, modelo, color, numPuertas, potencia);
        this.descapotable = descapotable;
    }

    // Getter y setter específico de Deportivo
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    //campos de clase
        private boolean descapotable;
}
