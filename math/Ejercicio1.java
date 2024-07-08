/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math;

import java.util.Scanner;

/**
 * 1.Programa que tome como dato de entrada un número que corresponde a la
 * longitud del radio una esfera y nos calcula y escribe el volumen de la esfera
 * que se corresponden con dicho radio La fórmula del volumen de una esfera es V
 * = 4/3 π r³, donde V = volumen y r = radio.
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        //PEDIMOS POR PANTALLA EL RADIO DE LA ESFERA
        System.out.println("Volumen de una esfera");
        System.out.println("Introduzca el radio de la esfera");
        Scanner sc = new Scanner(System.in);

        //DECLARAMOS E INICIALIZAMOS VARIABLES
        double radio = sc.nextDouble();
        sc.close(); //CIERRE DE SCANNER PARA OPTIMIZAR RECURSOS

        final double pi = 3.1415;  //También se puede conseguir mediante Math.PI

        double volumen = 0;

        //EJECUCION DEL PROGRAMA
        volumen = (4 / 3) * pi * Math.pow(radio, 3.0);

        //OPCION B DE FORMULA volumen=(4/3)*Math.PI*Math.pow(radio,3);
        //RESULTADOS
        System.out.printf("El volumen de una esfera con radio %.2f es %.2f", radio, volumen);
    }
}
