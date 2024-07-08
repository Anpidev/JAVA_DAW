package tareas.poo.calculadora;

import java.util.Scanner;

public class Menu {
    private Menu() {
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion("sumar");
                    break;
                case 2:
                    realizarOperacion("restar");
                    break;
                case 3:
                    realizarOperacion("multiplicar");
                    break;
                case 4:
                    realizarOperacion("dividir");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void realizarOperacion(String operacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;
        switch (operacion) {
            case "sumar":
                resultado = Calculos.sumar(numero1, numero2);
                break;
            case "restar":
                resultado = Calculos.restar(numero1, numero2);
                break;
            case "multiplicar":
                resultado = Calculos.multiplicar(numero1, numero2);
                break;
            case "dividir":
                resultado = Calculos.dividir(numero1, numero2);
                break;
        }

        System.out.println("El resultado de " + operacion + " es: " + resultado);
    }
}