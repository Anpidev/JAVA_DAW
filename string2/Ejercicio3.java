package tareas.string2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


import java.util.Scanner;

/**
 * 3. Diseña un programa que pide un texto por pantalla y se muestra de la
 * siguiente manera: Por ejemplo se teclea: Buenas tardes Lola Debe aparecer:
 * Buenas Tardes Lol
 *
 * @author angelaruiz
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Pedimos por pantalla los datos 
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un texto por pantalla:");
        String textoIntroducido = sc.nextLine();
        // Encuentra la posición del primer espacio en blanco
        int indiceEspacio = textoIntroducido.indexOf(' ');

        while (indiceEspacio != -1) { //indexof. devuelve -1 cuando no se encuentra el parámetro en la cadena
            // Extrae la palabra hasta el primer espacio en blanco y la imprime
            String palabra = textoIntroducido.substring(0, indiceEspacio);
            System.out.println(palabra);

            // Actualiza el texto para excluir la palabra y el espacio en blanco que la sigue
            textoIntroducido = textoIntroducido.substring(indiceEspacio + 1); //Añado mas uno para que empiece despues del espacio en blanco la nueva cadena

            // Encuentra la posición del próximo espacio en blanco en el texto actualizado
            indiceEspacio = textoIntroducido.indexOf(' ');
            
            
            // Imprime la última palabra o el texto restante
            System.out.println(textoIntroducido);
        }

        sc.close();
    }
}
