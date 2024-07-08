
package tareas.math3;

import java.math.BigDecimal;

/**
 * 3.Diseña el enunciado del ejercicio y explica el flujo del código:
 *
 * @author angelaruiz
 */
public class Ejercicio3 {

    public static void main(String args[]) {

        /*Declaración de variables usando objetos de la clase BigDecimal, 
        esta permite manejar grandes números sin perdidas de informacion
        como sucede con double o float*/
        BigDecimal e;
        BigDecimal factor;

        //Inicializacion de las variables
        //e se inicializa en 1 con escala de 300 digitos decimales y redondeado hacia abajo
        e = new BigDecimal("1").setScale(300, BigDecimal.ROUND_DOWN);

        //factor se inicializa como la variable e
        factor = new BigDecimal("1").setScale(300, BigDecimal.ROUND_DOWN);
        // Se obtiene la expresión del paréntesis de la fórmula

        //Divide factor entre 200 
        factor = factor.divide(new BigDecimal(200), BigDecimal.ROUND_DOWN);
        //Se suma uno a factor
        factor = factor.add(new BigDecimal(1));
        // Se multiplica la expresión para obtener la potencia adecuada
        // es decir 199 veces e*factor
        for (int i = 1; i < 200; i++) {
            e = e.multiply(factor);
        }

        //se imprime el resultado
        System.out.println(e);

        //el enunciado del ejercicio seria:
        //Represente la fórmula de ecuación exponencial. La fórmula en cuestión es:
        //e=(1+1/200)^200 (Numero de Euler elevado a 200)
    }
}
