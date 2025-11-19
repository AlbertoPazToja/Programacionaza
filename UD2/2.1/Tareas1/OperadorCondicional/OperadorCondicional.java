package Tareas1.OperadorCondicional;

import java.util.Scanner; // Importamos el Scanner

public class OperadorCondicional {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

    System.out.println("Introduce un número:"); // Pedimos que introduzca un número por teclado

    int numero = sc.nextInt();

    String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
    // Si se cumple la condición, resultado = la variable "El número es par", si no
    // se cumple, se guarda "El número es impar"

    System.out.println(resultado);

    sc.close();

  }

}
