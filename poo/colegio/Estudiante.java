package tareas.poo.colegio;

import java.util.Random;

public class Estudiante extends Persona {

    // Constructor
    public Estudiante(String nombre, int edad, Sexo sexo, int calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
        generarAsistencia();
    }

    // Getter and setter
    public int getCalificacion() {
        return calificacion;
    }

    // vamos a acotar la calificación
    public void setCalificacion(int calificacion) {
        this.calificacion=calificacion;
    }

    

    // Implementación del metodo generarAsistencia (polimorfismo)
    @Override
    protected void generarAsistencia() {
        Random rand = new Random();
        asistencia = rand.nextBoolean(); // Genera un booleano aleatorio (true o false) con 50% de probabilidad
    }

    // Campos de clase
    private int calificacion;

}
