package tareas.poo.herencias;

public class Empleado {

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetro String
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo String
    public String toString(){
        return  "Empleado " + nombre;
    }

    // Campo de clase
    private String nombre;

}
