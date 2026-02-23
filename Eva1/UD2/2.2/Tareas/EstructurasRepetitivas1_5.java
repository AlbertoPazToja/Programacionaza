package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EstructurasRepetitivas1_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce el número de filas:");
        int NumeroFilas = sc.nextInt(); // Pedimos que introduzca el número de filas por teclado

        System.out.println("Introduce el número de columnas:");
        int NumeroColumnas = sc.nextInt(); // Pedimos que introduzca el número de columnas por teclado

        if (NumeroFilas > 0 && NumeroColumnas > 0) { // Si ambos números son mayores que 0

            for (int i = 0; i < NumeroFilas; i++) {
                for (int j = 0; j < NumeroColumnas - 1; j++) {

                    System.out.print("*"); // Imprime el número de columnas menos 1, ya que la última columna es la de
                                           // i
                }

                System.out.println("*"); // Imprime la última columna, y hace un salto de linea

            }

        }

        else {

            System.out.println("Numero no válido. Vuelve a intentarlo"); // Si no se cumple la condición del principio,
                                                                         // se imprime que el número no es válido y se
                                                                         // vuelve a empezar
        }

        sc.close();

    }

}
