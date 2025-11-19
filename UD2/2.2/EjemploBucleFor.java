//Pide un número de vueltas y en cada vuelta dice el número de vueltas que es

import java.util.Scanner; // Importamos el escaner

public class EjemploBucleFor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
    System.out.println("Introduce el número de vueltas: "); // Pedimos que introduzca un número de vueltas, por teclado
    int numVueltas = sc.nextInt(); // Creamos la variable "número de vueltas"

    for (int c = 1; c <= numVueltas; c++) { // Creamos la variable c, c es igual a 1, c es menor o igual que la variable
                                            // numVueltas, se le suma 1 a c

      System.out.println("Esta es la vuelta: " + c); // Imprimimos "Esta es la vuelta" y la variable c

    }

    sc.close(); // Cerramos el Scanner

  }
}
