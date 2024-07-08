import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número >0 y >100: ");
            double numero1 = scanner.nextDouble();

            if (numero1 <= 0 || numero1 >= 100) {
                throw new IllegalArgumentException("El número debe ser mayor que 0 y menor que 100");
            }

            System.out.println("Ingresa otro número (no puede ser 0):");
            double numero2 = scanner.nextDouble();

            if (numero2 == 0) {
                throw new IllegalArgumentException("El segundo número no puede ser cero");
            }

            double resultado = dividirNumeros(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.err.println("Error: Debes introducir un número válido.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: Se ha producido una división por cero.");
        } finally {
            scanner.close();
        }
    }

    public static double dividirNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
}
