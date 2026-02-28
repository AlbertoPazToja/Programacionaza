/*Crear un programa en Java que:
1- Cree unha matriz (array bidimensional) de enteiros de dimensións filas x columnas. O
número de filas e columnas pediránselle ao usuario por pantalla.
2- Encha a matriz con números enteiros do 1 ao 9. Pódense crear de forma aleatoria (Random).
3- Mostre a matriz en forma de táboa.
4- Calcule a suma de todos os elementos. */

import java.util.Scanner;

public class ArrayBidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numFilas = 0;
        int numColumnas = 0;

        do {

            System.out.println("Introduce el número de filas de tu array (1-10): ");
            numFilas = sc.nextInt();

            if (numFilas < 1 || numFilas > 10) {

                System.out.println("Error. El número debe estar entre 1 y 10");
            }
        } while (numFilas < 1 || numFilas > 10);

        do {

            System.out.println("Introduce el número de columnas de tu array (1-10): ");
            numColumnas = sc.nextInt();

            if (numColumnas < 1 || numColumnas > 10) {

                System.out.println("Error. El número debe estar entre 1 y 10");
            }
        } while (numColumnas < 1 || numColumnas > 10);

        int[][] matriz = new int[numFilas][numColumnas];

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + i + "\n\t");

            for (int j = 0; j < matriz[i].length; j++) {
                // Así imprime números aleatorios del 0 al 8 (el nueve no cuenta), y le sumas
                // uno para que sea del 1 al 9. Math.random da doubles, así que lo convertimos
                // en int poniendo int entre paréntesis al principio
                matriz[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print("numeros[" + i + "][" + j + "] = " + matriz[i][j] + "\t");
            }
        }

    }
}
