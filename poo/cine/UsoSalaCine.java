package tareas.poo.cine;

import java.util.Scanner;

public class UsoSalaCine {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la sala de cine y la película
        Sala salaCine = InputManager.crearSala();

        // Solicitar el número de espectadores
        int numEspectadores = InputManager.solicitarEntero("Número de espectadores:", 1, 100);
        Espectador[] espectadores = new Espectador[numEspectadores];

        // Crear cada espectador y asignarle un asiento manualmente
        for (int i = 0; i < numEspectadores; i++) {
            System.out.println("Datos del espectador " + (i + 1) + ":");
            espectadores[i] = InputManager.crearEspectador();
            System.out.println("Elige el asiento (fila del 1 al 8 y columna de la A hasta la I) para el espectador " + espectadores[i].getNombre() + ":");
            int fila;
            char columna;
            boolean asientoValido;
            do {
                fila = InputManager.solicitarEntero("Fila:", 1, salaCine.getFILAS());
                columna = InputManager.solicitarColumna("Columna:", 'A', (char) ('A' + salaCine.getCOLUMNAS() - 1));
                asientoValido = !salaCine.getAsientos()[fila - 1][columna - 'A'].ocupado(); // Verificar si el asiento está ocupado
                if (!asientoValido) {
                    System.out.println("El asiento seleccionado está ocupado. Intenta con otro.");
                } else {
                    Comprobaciones comprobaciones = new Comprobaciones();
                    asientoValido = comprobaciones.sePuedeSentar(espectadores[i], salaCine, fila, columna); // Verificar si el espectador puede sentarse
                    if (!asientoValido) {
                        System.out.println("El espectador no puede sentarse en ese asiento. Intenta con otro.");
                    }
                }
            } while (!asientoValido);
            Asiento asiento = salaCine.getAsientos()[fila - 1][columna - 'A'];
            salaCine.reservarAsiento(asiento, espectadores[i]); // Reservar el asiento para el espectador
            System.out.println(); // Salto de línea para separar los datos de los espectadores
        }

        // Mostrar la etiqueta de los asientos de la sala
        System.out.println("Etiqueta de los asientos:");
        System.out.println(salaCine);
    }
}
