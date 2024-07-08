// Clase Persona
public class Persona {


    // Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

// Método para imprimir datos utilizando StringBuilder
    public void imprimirDatos() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(nombre).append("\n");
    sb.append("Apellidos: ").append(apellidos).append("\n");
    sb.append("Edad: ").append(edad).append("\n");

    System.out.println(sb.toString());
}
    //Campos de clase
    private String nombre;
    private String apellidos;
    private int edad;
}
