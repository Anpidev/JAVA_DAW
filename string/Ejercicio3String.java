package tareas.string;
import java.util.Scanner;

public class Ejercicio3String {
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
        
    


