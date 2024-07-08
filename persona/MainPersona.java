package tareas.poo.persona;
import java.util.Scanner;
public class MainPersona {
    public static void main(String[] args) {

        // Primero instanciamos Scanner para los datos
        Scanner scanner = new Scanner(System.in);
        // Segundo instanciamos un objeto de la clase persona
        Persona persona1 = new Persona();

        // Ahora vamos a ir pidiendo los metodos

        // 1. Mostrar datos
        Methods.cargarDatos(persona1,scanner);

        // 2.Visualizar datos
        System.out.println(Methods.mostrarDatos(persona1));

        // 3.Cambiar datos
        Methods.cambiarDatos(persona1,scanner);

        // 4.Visualizar datos cambiados
        System.out.println(Methods.mostrarDatos(persona1));

        scanner.close();

    }

}
