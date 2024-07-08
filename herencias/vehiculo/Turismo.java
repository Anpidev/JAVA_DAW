// Clase Turismo
public class Turismo extends Vehiculo {


    // Constructor
    public Turismo(String matricula, String marca, String modelo, String color, int numPuertas, int potencia, int numPlazas) {
        super(matricula, marca, modelo, color, numPuertas, potencia);
        this.numPlazas = numPlazas;
    }

    // Getter y setter específico de Turismo
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    //campos de clase
        private int numPlazas;
}
