package tareas.poo.colegio;
import java.util.Random;
public class Profesor extends Persona {

    //Constructor
    public Profesor(String nombre, int edad, Sexo sexo, Materias materia){
        super(nombre, edad, sexo);
        this.materia=materia;
        generarAsistencia();
    }
    

//Getter and setter
public Materias getMateria() {
    return materia;
}

public void setMateria(Materias materia) {
    this.materia = materia;
}
//Polimorfismo de asistencia
@Override
protected void generarAsistencia() {
    Random rand = new Random();
    int probabilidad = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99

    // La asistencia será true si el número generado está en el rango de 21 a 100 (80%)
    asistencia = probabilidad > 20;
}




//Campos de clase
private Materias materia;
}
