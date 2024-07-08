import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoSinEspacios {
    public static void main(String[] args) {
        try {
            // Llama a la función leerArchivo con el nombre del archivo
            leerArchivo("mi_archivo.txt");
        } catch (IOException e) {
            // Maneja cualquier error de lectura de archivo
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) throws IOException {
        // Utiliza un try-with-resources para asegurar que el FileReader se cierre correctamente
        try (FileReader reader = new FileReader(nombreArchivo)) {
            int caracter;
            // Lee el archivo carácter por carácter hasta el final
            while ((caracter = reader.read()) != -1) {
                // Verifica si el carácter no es un espacio en blanco
                if (!Character.isWhitespace(caracter)) {
                    // Imprime el carácter si no es un espacio en blanco
                    System.out.print((char) caracter);
                }
            }
        }
    }
}
