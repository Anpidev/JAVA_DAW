/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.math2;

/**
 * 5.Explica el siguiente código y define un posible enunciado
 *
 * @author angelaruiz
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        System.out.println("Se presentan los participantes.A continuación, hará su lanzamiento el jugador 1");

        //Punto 1: Se declara la variable auxiliar uno y dos, ambas generan un número aleatorio entre 0,5 y 6.5 de tipo decimal (double).
        double aux1 = (Math.random() * 6) + 0.5;
        double aux2 = (Math.random() * 6) + 0.5;

        //Punto 2: Ahora se redondea ambas variables de tal forma que queda un número entero entre 0 y seis pero aun así se guarda en variable decimal double
        double intento1 = Math.round(aux1);
        double intento2 = Math.round(aux2);

        //Punto 3: Se pasa a dos variables enteras, truncando el resultado redondeado de tipo double.
        int jugador1 = (int) intento1;
        int jugador2 = (int) intento2;

        //Se imprime por pantalla los resultados obtenidos de los dos jugadores
        System.out.println("El jugador 1 ha sacado: " + jugador1
                + " y el jugador 2 ha sacado" + jugador2);

        //Se compara cual de dos los resultados es mayor
        int ganador = Math.max(jugador1, jugador2);

        //Se imprime por pantalla el resultado mayor que corresponde con el ganador 
        System.out.println("Quien sacó " + ganador + " es el ganador");

        /**
         * El punto 1, 2 y 3 podrían haberse definido en una sola linea por
         * jugador int jugador 1 = (int)(Math.random()*7); int jugador
         * 2=(int)(Math.random()*7);
         */
        /**
         * El posible enunciado del ejercicio sería: Realiza un programa que
         * simule un juego. Se crearan una tirada aleatoria para cada jugador,
         * siendo dos los jugadores totales. La tirada tiene que ser un numero
         * entero entre 0 y 7. Luego compara ambas tiradas y muestra tanto los
         * resultados de estas como quién es el ganador(la tirada mas alta).
         */
    }
}
