package tareas.poo.colegio;

public class Aula {

    // Constructor
    public Aula( int capacidad, Materias materia, Profesor profesor) {
        this.identificador=siguienteId++;
        this.capacidad = capacidad;
        this.materia = materia;
        this.estudiantes = new Estudiante[capacidad];
        this.numEstudiantes = 0;
        this.profesor = profesor;

    }

    // Getter and setter

    public int getIdentificador() {
        return identificador;
    }

    

    public int getCapacidad() {
        return  capacidad;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    // Metodo para la información de los estudiantes
    public String getEstudiantesInfo() {
        StringBuilder estudiantesInfo = new StringBuilder();
        estudiantesInfo.append("Lista de estudiantes en el aula:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                estudiantesInfo.append("Nombre: ").append(estudiante.getNombre()).append(", Edad: ")
                        .append(estudiante.getEdad()).append(", Calificación: ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        return estudiantesInfo.toString();
    }

    // Metodo para agregar Estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        if (numEstudiantes < capacidad) {
            estudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
        } else {
            System.out.println("El aula está llena. No se puede agregar más estudiantes.");
        }
    }

    // Metodo para contar y separar los alumnos según aprobado y suspenso
    public String notasEstudiantes() {
        int aprobados = 0;
        int suspensos = 0;
        StringBuilder estudiantesAprobados = new StringBuilder();
        StringBuilder estudiantesSuspensos = new StringBuilder();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) { // Verificar si el estudiante no es null
                if (estudiante.getCalificacion() >= 5) {
                    estudiantesAprobados.append("Nombre: ").append(estudiante.getNombre()).append(", Edad: ")
                            .append(estudiante.getEdad()).append(", Calificación: ")
                            .append(estudiante.getCalificacion())
                            .append("\n");
                    aprobados++;
                } else {
                    estudiantesSuspensos.append("Nombre: ").append(estudiante.getNombre()).append(", Edad: ")
                            .append(estudiante.getEdad()).append(", Calificación: ")
                            .append(estudiante.getCalificacion())
                            .append("\n");
                    suspensos++;
                }
            }
        }
        return "Aprobados: " + aprobados + "\n" + estudiantesAprobados.toString() + "\n" +
                "Suspensos: " + suspensos + "\n" + estudiantesSuspensos.toString();
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Metdodo para comprobar si se puede dar clase
    public String sePuedeDarClase() {
        // Verificar si el profesor está disponible
        if (!profesor.getAsistencia()) {
            return "El profesor no tiene clases hoy";
        }

        // Verificar si el profesor da la materia correspondiente al aula
        else if (profesor.getMateria() != materia) {
            return "El profesor asignado no imparte la materia correspondiente al aula.";
        } else {
            // Verificar si hay más del 50% de alumnos asistiendo
            int estudiantesAsisten = 0;
            for (Estudiante estudiante : estudiantes) {
                if (estudiante != null && estudiante.getAsistencia()) {
                    estudiantesAsisten++;
                }
            }
            if (estudiantesAsisten >= (capacidad / 2)) {
                return "Se puede dar clase";
            } else {
                return "Los alumnos que han asistido son menos del 50%, no se puede dar clase";
            }
        }
    }


    // Campos de clase
    private int identificador;
    private int siguienteId=1; //Para hacer la id autoincremental
    private int capacidad;
    private Materias materia;
    private Estudiante[] estudiantes;
    private int numEstudiantes;
    private Profesor profesor;

}
