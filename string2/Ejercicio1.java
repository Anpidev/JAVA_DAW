package tareas.string2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.Desarrollar un programa que solicita la contraseña o password. Se debe
 * comprobar: •Que la longitud de la cadena no es superior a 25 caracteres. •No
 * debe contener caracteres especiales:@,.,$,#,&,/ •Se debe almacenar la primera
 * letra y la última en mayúsculas
 *
 * @author angelaruiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        // Pedimos la contraseña por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña:");
        String passwordIntroducido = sc.nextLine();

        // Definimos la expresión regular que limitará la contraseña
        Pattern patron = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9]{0,23}[a-zA-Z]{1}$");
        Matcher coincide = patron.matcher(passwordIntroducido);

        // Comprobación de coincidencia de contraseña
        if (coincide.matches()) {

            // Almacenamos la primera letra y la última en mayúsculas
            char primeraLetra = Character.toUpperCase(passwordIntroducido.charAt(0));
            char ultimaLetra = Character.toUpperCase(passwordIntroducido.charAt(passwordIntroducido.length() - 1));

            // Modificamos la contraseña original
            StringBuilder passwordModificada = new StringBuilder(passwordIntroducido);
            passwordModificada.setCharAt(0, primeraLetra);
            passwordModificada.setCharAt(passwordIntroducido.length() - 1, ultimaLetra);

            // Mostramos el resultado
            System.out.println("Contraseña original: " + passwordIntroducido);
            System.out.println("Contraseña modificada: " + passwordModificada.toString());
        } else {
            System.out.println("Contraseña no válida. No puede contener carácteres especiales.");
        }

        // Cerramos el scanner
        sc.close();
    }
}
