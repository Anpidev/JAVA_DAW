package tareas.poo.calculadora;

public class Calculos {

    // Constructor por defecto (privado para evitar instancias)
    private Calculos() {
        // El constructor privado evita que se instancie la clase
    }

    // Metodos especificos

    public static double devuelveNumero(double numero) {
        return numero;
    }

    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return numero1 / numero2;
    }

}
