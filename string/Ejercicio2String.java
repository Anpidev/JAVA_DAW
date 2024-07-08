
package tareas.string;
import java.util.Scanner;

public class Ejercicio2String {
     public static void main(String[] args) {
        
        
        //Pedimos contraseña por pantalla
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca una contraseña");
        String password=sc.nextLine();
        sc.close();
        
        
        //Imprimir la primera mitad de los caráctares de la cadena.
        String mitad=password.substring(0, password.length()/2);
        System.out.println("La primera mitad de la contraseña es: "+mitad);
        
        //Imprimir el último carácter
        char ultimaLetra=password.charAt(password.length()-1);
        System.out.println("El último carácter es: "+ultimaLetra);
        
        //Imprimirlo en forma inversa
        
        StringBuilder reverse= new StringBuilder(password).reverse();
        System.out.println(reverse);
        
        //Imprimir cada carácter del String separado con un guión
        
        for (int i = 0; i < password.length(); i++) {
          char letra=password.charAt(i);
            if (i<password.length()-1) {
               System.out.print(letra+"-"); 
            }else {
                System.out.println(letra);
            } 
        }
        
        //Imprimir la cantidad de vocales almacenadas (Aunque no es lo más optimo y se puede hacer
        //con el bucle anterior, creo nuevo bucle para que quede visualmente mas limpio.
        
        int vocales=0; //Contador de vocales
        
       
        
        for (int i = 0; i < password.length(); i++) {
          char letra=password.charAt(i);
            switch (letra) {
                case 'a':
                case 'A':
                    vocales++;
                    break;
                case 'e':
                case 'E':
                     vocales++;
                    break;
                case 'i':
                case 'I':
                     vocales++;
                    break;
                case 'o':
                case 'O':
                     vocales++;
                    break;
                case 'u':
                case 'U':
                     vocales++;
                    break;
            }
        }
        System.out.println("Las vocales de la contraseña son: "+vocales);
        
        //Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto
        //como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)
        
        if (password.contentEquals(reverse)) {
            System.out.println("La contraseña se lee igual en las dos direcciones");
        }else{
            System.out.println("La contraseña no se lee igual en ambas direcciones");
        }
    }
}

