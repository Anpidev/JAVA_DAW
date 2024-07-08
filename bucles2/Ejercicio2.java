/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.bucles2;

import java.util.Scanner;

/**
 * 2.Calcular los n, los 10 primeros números de la serie de fibonnaci. -La serie
 * de Fibonacci, consiste en una serie infinita de números, empezando en 0 y 1,
 * el siguiente elemento obtiene la suma de los anteriores. Ej:0,1,1,2,3 3.
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Serie de Fibonacci con  n términos .\n Introduzca n:\n");
        int n = sc.nextInt();
        sc.close();
        int fibo1 = 0;
        int fibo2 = 1;
        int fiboAux = 0;

        for (int i = 0; i < n; i++) {
            fibo1 = fiboAux;
            fiboAux = fibo1 + fibo2;
            fibo2 = fibo1;
            System.out.println(fibo2);

        }
    }

}
