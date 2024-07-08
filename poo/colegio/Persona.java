package tareas.poo.colegio;

public class Persona {

    // Constructor

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getter and setter de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // Metodo para poder hacer polimorfismo estricto de asistencia
    protected void generarAsistencia() {// Solo se usará para implementar luego en clase Profesor y Estudiante.
    }

    public boolean getAsistencia() {
        return asistencia ;
    }

    // Campos de clase
    private String nombre;
    private int edad;
    private Sexo sexo;
    protected boolean asistencia;

}
