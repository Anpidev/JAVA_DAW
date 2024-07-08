package tareas.string2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * 2.Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres
 * palabras. •Implementar los siguientes métodos: •Imprimir la primera mitad de
 * los caracteres de la cadena •Imprimir el último carácter •Imprimir la cadena
 * de forma inversa •Imprimir cada carácter del String separado por un guión
 * •Imprimir la cantidad de vocales almacenadas NOTA: Verificar si la cadena se
 * lee igual de izquierda a derecha tanto como de derecha a izquierda.
 *
 * @author angelaruiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        // Pedimos por pantalla los datos 
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra:");
        String palabra = sc.nextLine().toLowerCase(); // Convertimos la palabra a minúsculas

        // Imprimir la primera mitad de los caracteres de la cadena
        String nuevaPalabra = palabra.substring(0, palabra.length() / 2);
        System.out.println("La primera mitad de los carácteres de la cadena es: " + nuevaPalabra);

        // Imprimir el último carácter
        System.out.println("El último carácter de la cadena es: " + palabra.charAt(palabra.length() - 1));

        // Imprimir la cadena de forma inversa
        String palabraReversa = new StringBuilder(palabra).reverse().toString();
        System.out.println("La cadena de forma inversa es: " + palabraReversa);

        // Imprimir cada carácter del String separado por un guión
        System.out.print("Los carácteres de la cadena son:");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i));
            if (i < palabra.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println(); //PARA AÑADIR ESPACIO CON EL SIGUIENTE APARTADO

        // Imprimir la cantidad de vocales almacenadas
        int contador = 0;
        System.out.print("Las vocales presentes en la cadena son: ");
        String vocales = "aeiou";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            for (int j = 0; j < vocales.length(); j++) {
                char letraVocal = vocales.charAt(j);
                if (letra == letraVocal) {
                    contador++;
                    System.out.print(letra + " ");
                }
            }
        }

        System.out.println("\nLa cantidad de vocales en la cadena es: " + contador);

        // Verificar si la palabra es capicúa
        if (palabra.equals(palabraReversa)) {
            System.out.println("La palabra es capicúa");
        } else {
            System.out.println("La palabra no es capicúa");
        }

        sc.close();
    }
}
