package tareas.poo.cine;

public class Comprobaciones {



        // Método para comprobar si un espectador puede sentarse en un asiento específico
        public boolean sePuedeSentar(Espectador espectador, Sala sala, int fila, char columna) {
            Asiento[][] asientos = sala.getAsientos();
        
            // Verificar si las coordenadas de fila y columna son válidas
            if (fila < 1 || fila > sala.getFILAS() || columna < 'A' || columna > (char) ('A' + sala.getCOLUMNAS() - 1)) {
                System.out.println("Las coordenadas del asiento no son válidas.");
                return false;
            }
        
            // Obtener el asiento en la fila y columna especificadas
            Asiento asiento = asientos[fila - 1][columna - 'A'];
        
            // Verificar si el asiento está ocupado
            if (asiento.ocupado()) {
                System.out.println("El asiento " + fila + columna + " ya está ocupado.");
                return false;
            }
        
            // Verificar si el espectador tiene suficiente dinero
            if (espectador.getDineroDisponible() < sala.getPrecio()) {
                System.out.println("El espectador no tiene suficiente dinero para la entrada.");
                return false;
            }
        
            // Verificar si el espectador tiene la edad mínima para ver la película
            if (espectador.getEdad() < sala.getPelicula().getEdadMinima()) {
                System.out.println("El espectador es demasiado joven para ver esta película.");
                return false;
            }
        
            // Si se cumplen todas las condiciones, el espectador puede sentarse en el asiento
            return true;
        }
    }