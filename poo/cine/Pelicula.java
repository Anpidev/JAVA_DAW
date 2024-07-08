package tareas.poo.cine;

public class Pelicula {


//Constructor de la clase
    public Pelicula(String titulo, String director, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }


//Getter and setter 

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }


// Método toString
@Override
public String toString() {
    StringBuilder peliculaInfo = new StringBuilder();
    peliculaInfo.append("El nombre de la película es: ").append(titulo).append(". ");
    peliculaInfo.append("El director de la película es: ").append(director).append(". ");
    peliculaInfo.append("La duración de la película es: ").append(duracion).append(".");
    peliculaInfo.append("Finalmente la edad mínima para ver la película es:").append(edadMinima).append(".");
    return peliculaInfo.toString();
}


    //Campos de clase 
    String titulo;
    String director;
    int duracion;
    int edadMinima; 
}
