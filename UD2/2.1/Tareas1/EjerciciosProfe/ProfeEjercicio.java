//Dados dos números enteros introducidos por teclado, indicar si alguno es divisor del otro

package Tareas1.EjerciciosProfe;

import java.util.Scanner; //importamos el Scanner

public class ProfeEjercicio {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número:"); // Pedimos que introduzca dos números por teclado
    int numero1 = sc.nextInt();

    System.out.println("Introduce otro número:");
    int numero2 = sc.nextInt();

    if (numero1 > numero2) {

      if (numero1 % numero2 == 0) { // Si al dividir el primero entre el segundo el resto = 0 sí es divisible

        System.out.println(numero1 + " es divisible por " + numero2);

      }

      else {

        System.out.println(numero1 + " no es divisible por " + numero2); // Si no, no es divisible

      }

    }

    else if (numero2 > numero1) {

      if (numero2 % numero1 == 0) { // Si al dividir el segundo entre el primero el resto = 0 sí es divisible

        System.out.println(numero2 + " es divisible por " + numero1);

      }

      else {

        System.out.println(numero2 + " no es divisible por " + numero1); // Si no, no es divisible

      }

    }

    else {

      System.err.println("(error)"); // Y si no se cumple ninguna condición, que imprima "error"

    }

    sc.close();

  }

}
