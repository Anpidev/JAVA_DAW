/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.scanner;

import java.util.Scanner;

/**
 * Se pide por pantalla un importe en euros y se calcula la conversión en libras
 * o euros.
 * 
 * 
 * 
 * Nota: Usar el objeto Scanner
 * 
 * 
 * @author angelaruiz
 */
public class TareaEuroconversor {

        public static void main(String[] args) {
                // Declaración de variables

                int moneda;
                double cantidad;
                double resultado;
                final double PESETAS = 166.386; // CONSTANTE PESETAS
                final double EUROS = 0.000448; // CONSTANTE EUROS

                System.out.println("Bienvenido a su conversor, por favor seleccione \n"
                                + "1-para convertir de euros a pesetas\n"
                                + "2-para convertir de pesetas a euros \n");
                Scanner sc = new Scanner(System.in);
                moneda = sc.nextInt();

                System.out.println("Ahora por favor introduzca la cantidad a convertir");
                cantidad = sc.nextDouble();
                sc.close();

                if (moneda == 1) {
                        resultado = cantidad * PESETAS;
                        System.out.printf("Su conversión da como resultado %.1f pesetas", resultado);
                }
                if (moneda == 2) {
                        resultado = cantidad * EUROS;
                        System.out.printf("Su conversión da como resultado %.1f euros", resultado);

                }
        }
}
