/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.string3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Tarea String
Objetivos:
• Uso de estructuras de control:
• Estructuras de selección.
• Estructuras de repetición.
• Estructuras de salto.
• Control de excepciones.
• Prueba y depuración.
• Documentación.
Codifique un programa que pide por pantalla una dirección de e-mail, comprobar si contiene el
carácter de la @ y del .
 * @author angelaruiz
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        
         // Pedimos el email por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un email:");
        String email= sc.nextLine();

        // Definimos la expresión regular que limitará el email
        Pattern patron = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher coincide = patron.matcher(email);

        // Comprobación de coincidencia de email
        if (coincide.matches()) {
            System.out.println("Enhorabuena, el email contiene @ y punto");
        } 
        sc.close();
    }
      
}
