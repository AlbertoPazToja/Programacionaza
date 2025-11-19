// Usando una variable que se llama "menor", lee de teclado 6 números enteros y muestra cuál es el menor de ellos

package Tareas1.EjerciciosProfe;

import java.util.Scanner; // Importamos el Scanner

public class ProfeEjercicio2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce 6 números"); // Pedimos que introduzcan 6 números por teclado
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int numero3 = sc.nextInt();
    int numero4 = sc.nextInt();
    int numero5 = sc.nextInt();
    int numero6 = sc.nextInt();

    if (numero1 < numero2 && numero1 < numero3 && numero1 < numero4 && numero1 < numero5 && numero1 < numero6) {
      /*
       * Si el primer número es menor que todos, se le asigna a la variable menor, y
       * hacemos que lo imprima
       */
      int menor = 0;
      menor = numero1;
      System.out.println("El número más pequeño es: " + menor);
    }

    else if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5 && numero2 < numero6) {
      int menor = 0;
      menor = numero2;
      System.out.println("El número más pequeño es: " + menor);
    }

    else if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5 && numero3 < numero6) {
      int menor = 0;
      menor = numero3;
      System.out.println("El número más pequeño es: " + menor);
    }

    else if (numero4 < numero1 && numero4 < numero3 && numero4 < numero2 && numero4 < numero5 && numero4 < numero6) {
      int menor = 0;
      menor = numero4;
      System.out.println("El número más pequeño es: " + menor);
    }

    else if (numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4 && numero5 < numero6) {
      int menor = 0;
      menor = numero5;
      System.out.println("El número más pequeño es: " + menor);
    }

    else if (numero6 < numero1 && numero6 < numero3 && numero6 < numero2 && numero6 < numero5 && numero6 < numero4) {
      int menor = 0;
      menor = numero6;
      System.out.println("El número más pequeño es: " + menor);
    }

    else {

      System.err.println("Error");
    }

    sc.close();

  }

}
