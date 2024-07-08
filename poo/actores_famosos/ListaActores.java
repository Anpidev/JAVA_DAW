package tareas.poo.actores_famosos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaActores {

// Constructor sin parametros
 public ListaActores() {
    this.actores = new ArrayList<>();
}


// Método para agregar actores con su comprobación
public void agregarActor() {
    Scanner scanner = new Scanner(System.in);
    String nombreActor;
    do {
        System.out.println("Ingrese el nombre de un actor (o deje en blanco para terminar): ");
        nombreActor = scanner.nextLine().trim(); // trim para eliminar espacios en blanco adicionales
        if (nombreEsValido(nombreActor)) {
                actores.add(nombreActor);
                System.out.println("Actor agregado correctamente.");
            } else {
                System.out.println("¡Error! El actor ya está en la lista.");
            }
    } while (!nombreEsValido(nombreActor));
}

// Método para modificar actores con su comprobación
public void modificarActor() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del actor que desea modificar: ");
    String nombreActor = scanner.nextLine().trim();
    if (actores.contains(nombreActor)) {
        System.out.println("Ingrese el nuevo nombre del actor: ");
        String nuevoNombre = scanner.nextLine().trim();
        if (nombreEsValido(nuevoNombre)) {
            actores.set(actores.indexOf(nombreActor), nuevoNombre);
            System.out.println("Actor modificado correctamente.");
        } else {
            System.out.println("¡Error! El nuevo nombre ya está en la lista.");
        }
    } else {
        System.out.println("¡Error! El actor no existe en la lista.");
    }
}

// Método para validar si el nombre del actor es válido
private boolean nombreEsValido(String nombre) {
  return (!nombre.isEmpty())||(!actores.contains(nombre));
}

// Método para obtener la lista de actores
public ArrayList<String> getActores() {
    return actores;
}


// Método para eliminar un actor de la lista
public void eliminarActor() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del actor que desea modificar: ");
    String nombreActor = scanner.nextLine().trim();
    if (actores.contains(nombreActor)) {
        actores.remove(nombreActor);
    }else{
        System.out.println("El actor introducido no está en la lista");
    }

}

//Metodo para buscar actores
public void buscarActor() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del actor que desea buscar: ");
    String nombreActor = scanner.nextLine().trim();
    if (actores.contains(nombreActor)) {
        System.out.println("El actor está en la lista en la posición " + actores.indexOf(nombreActor));
    } else {
        System.out.println("El nombre del actor no está en la lista");
    }
}

//Metodo para ver la cantidad de actores de la lista
public void cantidadActores(){
    System.out.println(actores.size());
}
// Método para imprimir la lista de actores
public void imprimirActores() {
    System.out.println("Lista de Actores:");
    for (String actor : actores) {
        System.out.println(actor);
    }
}

//Campos de clase
private ArrayList<String> actores;


}
