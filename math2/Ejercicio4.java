/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math2;

import java.util.Scanner;

/**
 *
 * @author angelaruiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

       

        //La solución de una ecuacion de segundo grado es x= (-b  + o - raiz cuadrada de (b al cuadrado + 4ac))/2a
        
        //Pido por pantalla las variables y las inicializo 
        
        System.out.println("Este programa resuelve ecuaciones de segundo grado.");

        System.out.println("Por favor, introduzca los valores.");
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();
        sc.close();
        
        //Declaro e inicializo variables adicionales
         double x1, x2;

        //Ejecucion de la formula 
        
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        //Mostramos resultados según las posibilidades matemáticas de una ecuación de segundo grado 
        
        if (discriminante < 0) {
            System.out.println("La ecuacion no tiene solución");
        }

        if (discriminante == 0) {
            System.out.println("La ecuacion tiene infinitas soluciones");
        }

        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos posibles soluciones x1 y x2");
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x2 = " + x2);
        }
    }
}
