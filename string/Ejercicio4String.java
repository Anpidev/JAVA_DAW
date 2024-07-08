
package tareas.string;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4String {

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

