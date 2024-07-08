/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.condicionales3;

/**
 * Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los
 * números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que
 * aparezca un 3 lo sustituya por una E.
 *
 * @author angelaruiz
 */
public
        class Tarea19 {

  public static
          void main(String[] args) {
    String letra = "E";

    for (int i = 0; i < 100000; i++) {
      int d1 = i / 10000;
      int d2 = (i / 1000) % 10;
      int d3 = (i / 100) % 10;
      int d4 = (i / 10) % 10;
      int d5 = i % 10;

      String resultado = "(";

      if (d1 == 3) {
        resultado += letra;
      }
      else {
        resultado += d1;
      }

      resultado += "-";

      if (d2 == 3) {
        resultado += letra;
      }
      else {
        resultado += d2;
      }

      resultado += "-";

      if (d3 == 3) {
        resultado += letra;
      }
      else {
        resultado += d3;
      }

      resultado += "-";

      if (d4 == 3) {
        resultado += letra;
      }
      else {
        resultado += d4;
      }

      resultado += "-";

      if (d5 == 3) {
        resultado += letra;
      }
      else {
        resultado += d5;
      }

      resultado += ")";

      System.out.println(resultado);
    }
  }
}
