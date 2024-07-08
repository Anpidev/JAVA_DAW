package tareas.poo.cine;

public class Espectador {


//Constructor
    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }


    //Getter and setter 

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
    public double getDineroDisponible() {
        return dineroDisponible;
    }
    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    // Método toString
@Override
public String toString() {
    StringBuilder espectadorInfo = new StringBuilder();
    espectadorInfo.append("El nombre del espectador es: ").append(nombre).append(". ");
    espectadorInfo.append("Tiene la edad de: ").append(edad).append(". ");
    espectadorInfo.append("Y finalmente tiene el siguiente dinero: ").append(dineroDisponible);
    return espectadorInfo.toString();
}
    
    //Campos de clase
    String nombre;
    int edad;
    double dineroDisponible;
}
