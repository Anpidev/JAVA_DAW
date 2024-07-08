/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math3;

/**
 * 2. Dado el siguiente código, diseña el enunciado del ejercicio y explica el
 * flujo del código.
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String args[]) {

        //ENUNCIADO DEL EJERCICIO : Declara 5 variables de diferentes tipos primitivos (según sea más adecuado)
        // Y usa la clase Math con ellas , en concreto las funciones Math.random, Math.abs, Math.round, Math.pow
        //Y Math.max, por último muestra los resulados.
        
        
        
        //Paso 1 Declaración de variables
        int x;
        double rand, y, z;
        float max;

        //Paso 2 Ejecución
        //Se inicializa una variable rand con valor aleatorio entre 0 y 1 de tipo double (decimal)
        rand = Math.random();

        //Se inicializa una variable x de tipo entero con el valor absoluto de -123 que al ser negativo es 123, si fuera 
        //positivo se quedaría el valor igual, también se queda igual si el valor es cero.
        x = Math.abs(-123);

        //Se inicializa una variable y de tipo double redondeando el valor de 123,567 a 124.0
        y = Math.round(123.567);

        //Se inicializa una variable de z de tipo double elevando 2 a 4
        z = Math.pow(2, 4);

        //Se inicializa una variable max de tipo float comparando dos variables que se especifica de tipo float
        //ya que se puede introducir variables de tipo int, double, long y float.
        //los dos valores a comparar son 10000000000 (1 seguido de diez ceros) y 3000000000 (3 seguido de nueve ceros)
        max = Math.max((float) 1e10, (float) 3e9);

        //Se imprime por pantalla los resultados de las operaciones
        System.out.println(rand);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(max);
    }
}
