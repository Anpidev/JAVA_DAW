// Clase Empleado
public class Empleado extends Persona {


    // Constructores
    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int edad, double sueldo, double comision) {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
        this.comision = comision;
    }

    // Getters y setters
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // Método para imprimir sueldo y comisión
    public void imprimirSueldoYComision() {
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Comisión: " + comision);
    }

    // Método para calcular total cobrado
    public double calcularTotalCobrado() {
        if (sueldo > 0 && comision > 0) {
            return sueldo + comision;
        } else {
            System.out.println("Error: El sueldo y la comisión deben ser mayores que cero.");
            return 0;
        }
    }

    //Campos de clase
    private double sueldo;
    private double comision;
}
