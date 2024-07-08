/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math;

/**
 * 2. Programa Java que calcule el área de un triángulo en función de las
 * longitudes de sus lados (a, b, c), según la siguiente fórmula: Area =
 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2 Para calcular la raíz
 * cuadrada se utiliza el método Math.sqrt()
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        //Primer paso declaracion e inicializacion de variables
        //Pedimos la generacion random de tres numeros enteros comprendidos entre 1 y 99
        int a = (int) (Math.random() * 100 + 1);
        int b = (int) (Math.random() * 100 + 1);
        int c = (int) (Math.random() * 100 + 1);

        //Ejecucion de programa
        //Fórmula p
        double p = (a + b + c) / 2;
        //Fórmula intermedia para la raiz cuadrada
        double auxiliar = p * (p - a) * (p - b) * (p - c);

        //Fórmula de area
        double area = Math.sqrt(auxiliar);

        //Resolución de programa con resultados
        System.out.printf("Teniendo las variables a=%d, b=%d,c=%d. El area del triángulo es %.2f", a, b, c, area);

    }
}
