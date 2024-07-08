package tareas.poo.persona;

import java.util.Scanner;

public class Methods {
// Metodos pedidos (cargar datos, mostrar datos, cambiar datos)
public static void cargarDatos(Persona persona, Scanner scanner) {
    System.out.println("Ingrese el nombre:");
    persona.setName(scanner.nextLine());
    System.out.println("Ingrese el apellido:");
    persona.setSurname(scanner.nextLine());
    System.out.println("Ingrese la dirección:");
    persona.setAddress(scanner.nextLine());
    System.out.println("Ingrese el teléfono:");
    persona.setPhone(scanner.nextLine());
    System.out.println("¿Cuáles son tus hobbies?");
    persona.setHobbies();
}

public static void cambiarDatos(Persona persona,  Scanner scanner) {
    System.out.println("Vamos a cambiar los datos de la persona seleccionada: ");
    System.out.println("Ingrese el nuevo nombre:");
    persona.setName(scanner.nextLine());
    System.out.println("Ingrese el nuevo apellido:");
    persona.setSurname(scanner.nextLine());
    System.out.println("Ingrese la nueva dirección:");
    persona.setAddress(scanner.nextLine());
    System.out.println("Ingrese el nuevo teléfono:");
    persona.setPhone(scanner.nextLine());
    System.out.println("¿Cuáles son tus nuevos hobbies?");
     persona.setHobbies();
}


public static String mostrarDatos(Persona persona){
    StringBuilder datos = new StringBuilder();
    datos.append("La persona se llama ").append(persona.getName()).append(".\n");
    datos.append("Se apellida  ").append(persona.getSurname()).append(".\n");
    datos.append("Su dirección es  ").append(persona.getAddress()).append(".\n");
    datos.append("El número de teléfono es  ").append(persona.getPhone()).append(".\n");
    datos.append("Y sus aficciones son : ").append(persona.getHobbiesToString()).append(".\n");
    return datos.toString() ;
}

}
