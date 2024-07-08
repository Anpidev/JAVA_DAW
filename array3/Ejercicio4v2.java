package tareas.array3;

public class Ejercicio4v2 {
    public static void main(String[] args) {
        // Declaración de array
        int numero[][] = new int[3][3];

        // Generar array sin números repetidos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean repetido;
                int numeroAleatorio;

                do {
                    numeroAleatorio = (int) (Math.random() * 10);
                    repetido = false;

                    // Verificar si el número ya existe en la array
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (numeroAleatorio == numero[x][y]) {
                                repetido = true;
                            
                            }
                        }
                        
                    }
                } while (repetido);

                // Asignar el número a la array
               numero[i][j] = numeroAleatorio;
            }
        }

        // Imprimir la array aleatoria
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
