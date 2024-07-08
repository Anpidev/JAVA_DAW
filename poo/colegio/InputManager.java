package tareas.poo.colegio;

import java.util.Scanner;

/*Clase creada para manejar las peticiones por pantalla y mantener la claridad en las clases estudiante, profesor
 * y aula.
 */
public class InputManager {
    private static Scanner scanner = new Scanner(System.in);

    // PETICION PARA ESTUDIANTE

    // Método estático para crear un estudiante solicitando datos por pantalla
    public static Estudiante crearEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca los datos del estudiante");

        System.out.println("Nombre del estudiante:");
        String nombreEstudiante = scanner.nextLine();

        int edadEstudiante = solicitarEntero("Edad del estudiante:", 12, 25);

        Sexo sexoEstudiante = solicitarSexo();

        int calificacionEstudiante = solicitarEntero("Calificación del estudiante:", 0, 10);

        return new Estudiante(nombreEstudiante, edadEstudiante, sexoEstudiante, calificacionEstudiante);
    }

    // Método estático para crear un profesor solicitando datos por pantalla
    public static Profesor crearProfesor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca los datos del profesor");

        System.out.println("Nombre del profesor:");
        String nombreProfesor = scanner.nextLine();

        int edadProfesor = solicitarEntero("Edad del profesor:", 25, 65);

        Sexo sexoProfesor = solicitarSexo();

        Materias materiaProfesor = solicitarMaterias();

        return new Profesor(nombreProfesor, edadProfesor, sexoProfesor, materiaProfesor);
    }

    // Método estático para crear un aula solicitando datos por pantalla
    public static Aula crearAula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca los datos del aula");

        int capacidadAula = solicitarEntero("Capacidad del aula", 15, 50);
        Materias materiaAula = solicitarMaterias();
        Profesor profesorAula = crearProfesor();
        return new Aula(capacidadAula, materiaAula, profesorAula);
    }

    // METODOS PRIVADOS PARA PODER HACER LAS PETICIONES
    private static int solicitarEntero(String mensaje, int min, int max) {
        while (true) {
            try {
                System.out.println(mensaje);
                int entero = Integer.parseInt(scanner.nextLine());
                if (entero >= min && entero <= max) {
                    return entero;
                } else {
                    System.out.println("El número debe estar entre " + min + " y " + max + ". Inténtelo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    private static Sexo solicitarSexo() {
        while (true) {
            System.out.println("Introduzca el sexo del estudiante: 1-Hombre, 2-Mujer");
            int opcionSexo = solicitarEntero("Seleccione una opción:", 1, 2);
            switch (opcionSexo) {
                case 1:
                    return Sexo.HOMBRE;
                case 2:
                    return Sexo.MUJER;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione 1 para Hombre o 2 para Mujer.");
            }
        }
    }

    private static Materias solicitarMaterias() {
        while (true) {
            System.out.println("Materia a impartir: ");
            System.out.println("1. MATEMATICAS");
            System.out.println("2. FILOSOFÍA");
            System.out.println("3. FÍSICA");
            int opcionMateria = solicitarEntero("Seleccione una opción", 1, 3);
            switch (opcionMateria) {
                case 1:
                    return Materias.MATEMATICAS;
                case 2:
                    return Materias.FILOSOFIA;
                case 3:
                    return Materias.FISICA;
                default:
                    System.out.println("Opción inválida, por favor elija una materia del 1 al 3.");
            }
        }
    }
}