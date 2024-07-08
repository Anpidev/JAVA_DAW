package tareas.poo.colegio;

import java.util.Scanner;

public class UsoClase {

    public static void main(String[] args) {

        /*Primera forma de implementar clases y metodos de forma manual, se pueden cometer errores al
         * no estar acotados los requisitos, que tengo definidos en InputManager, por eso 
         * lo dejo solo como un comentario.
         
        // Crear un profesor
        
        Profesor profesor1 = new Profesor("Juan", 35, Sexo.HOMBRE, Materias.MATEMATICAS);

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Maria", 20, Sexo.MUJER, 7);
        Estudiante estudiante2 = new Estudiante("Manuel", 21, Sexo.HOMBRE, 6);
        Estudiante estudiante3 = new Estudiante("Pilar", 22, Sexo.MUJER, 4);

        // Crear un aula y configurarla
        Aula aula1 = new Aula( 20, Materias.MATEMATICAS, profesor1);

        aula1.agregarEstudiante(estudiante1);
        aula1.agregarEstudiante(estudiante2);
        aula1.agregarEstudiante(estudiante3);

        // Ver estudiantes del aula
        System.out.println(aula1.getEstudiantesInfo());

        // Verificar si se puede dar clase en el aula
        System.out.println(aula1.sePuedeDarClase());

        // Ver aprobados y suspensos del aula
        System.out.println(aula1.notasEstudiantes());

        // Modificar la nota del estudiante
        estudiante3.setCalificacion(5);
        */

        // Segunda forma de implementacion mediante Scanner (clase InputManager)
        Scanner scanner = new Scanner(System.in);
        //Implementacion profesor va incluida en la implementacion del aula 
       

        //Implementacion estudiantes
        System.out.println("¿Cuántos alumnos hay en clase?");
        int alumnos = scanner.nextInt();
        Estudiante[] estudiantes = new Estudiante[alumnos];
        for (int i = 0; i < alumnos; i++) {
             estudiantes[i] = InputManager.crearEstudiante();
        }

        //Implementacion aula
        Aula aula2 = InputManager.crearAula();

        //Añadir alumnos al aula 
        for (int i = 0; i < alumnos && i < aula2.getCapacidad(); i++) {
            aula2.agregarEstudiante(estudiantes[i]);
        }

        // Ver estudiantes del aula
        System.out.println(aula2.getEstudiantesInfo());

        // Verificar si se puede dar clase en el aula
        System.out.println(aula2.sePuedeDarClase());

        // Ver aprobados y suspensos del aula
        System.out.println(aula2.notasEstudiantes());

        // Modificar la nota del estudiante si hay al menos 5 estudiantes
        if (estudiantes.length >= 5) {
            estudiantes[4].setCalificacion(8);
        }
    }
}