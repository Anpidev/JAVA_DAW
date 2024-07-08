/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.string3;

import java.util.Scanner;

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
Codifique un programa que permita cargar una oración por teclado, después mostrar cada
palabra ingresada en una línea distinta.
Por ejemplo si cargamos:
La mañana está fría.
Debe aparecer:
La
mañana
está
fría
 * @author angelaruiz
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //Pedimos la frase por teclado
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Escriba una frase");
        String frase=sc.nextLine();
        sc.close();
        
        //Construimos el StringBuilder para ir creando la nueva palabra
        StringBuilder palabraNueva = new StringBuilder();
        
        //Declaramos el carácter espacio
        char espacio=' ';
        
        //Ejecución de código
        for (int i = 0; i < frase.length(); i++) {
            char caracter=frase.charAt(i);
            if (caracter!=espacio) {
                palabraNueva.append(caracter);
            } else {
                if (palabraNueva.length() > 0) {
                    System.out.println(palabraNueva);
                    palabraNueva.setLength(0); //Al establecer la longitud en 0 (setLength(0)), se eliminan todos los caracteres actuales del StringBuilder.
                }
            }
        }

        // Imprimimos la última palabra
        if (palabraNueva.length() > 0) {
            System.out.println(palabraNueva);
        } 
            }
        }
        
    

