// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        Persona persona1 = new Persona("Maria", "Ruiz", 29);
        Persona persona2 = new Persona("Angela", "Ruiz", 35);
        Persona persona3 = new Persona("Cristian", "García", 31);
        Persona persona4 = new Persona();

        // Llamar al método imprimirDatos para cada persona
        persona1.imprimirDatos();
        persona2.imprimirDatos();
        persona3.imprimirDatos();
        persona4.imprimirDatos();

        // Crear objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Pilar", "Rivas", 62, 4500, 500);
        Empleado empleado2 = new Empleado("Carlos", "Barou", 28, 1250, 600);
        Empleado empleado3 = new Empleado("Laura", "Marin", 35, 1800, 400);
        Empleado empleado4 = new Empleado();

        // Llamar al método imprimirDatos y métodos de Empleado para cada empleado
        empleado1.imprimirDatos();
        empleado1.imprimirSueldoYComision();
        System.out.println("Total cobrado por empleado 1: " + empleado1.calcularTotalCobrado());

        empleado2.imprimirDatos();
        empleado2.imprimirSueldoYComision();
        System.out.println("Total cobrado por empleado 2: " + empleado2.calcularTotalCobrado());

        empleado3.imprimirDatos();
        empleado3.imprimirSueldoYComision();
        System.out.println("Total cobrado por empleado 3: " + empleado3.calcularTotalCobrado());

        empleado4.imprimirDatos();  // Aquí se imprimirán los datos por defecto de la persona
    }
}
