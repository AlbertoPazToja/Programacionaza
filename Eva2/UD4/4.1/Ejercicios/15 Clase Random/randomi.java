import java.util.Random;
import java.util.Scanner;

// Importamos el escaner y el random

public class randomi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        // Creamos los objetos del escaner y del random

        int minimo = 0;
        int maximo = 0;

        do {

            System.out.print("Introduce un mínimo:");
            minimo = sc.nextInt();

            System.out.print("Introduce un máximo:");
            maximo = sc.nextInt();

            if (minimo == maximo) {

                break;

            }

            // Si el mínimo es mayor que el máximo, se para el bucle y termina el programa

            else if (minimo > maximo) {

                System.out.println("El mínimo no puede ser mayor que el máximo. Intenta otra vez.");
            }

            // Si el mínimo es mayor que el máximo, se le indica al usuario, y vuelve a
            // empezar el bucle

            else if (minimo < maximo) {

                System.out.println(numeroAleatorio.nextInt(minimo, maximo + 1));

            }

            // Si el mínimo es menor que el máximo, se genera un número aleatorio entre esos
            // dos parámetros introducidos por teclado. Ponemos +1 en el máximo, porque si
            // no el máximo nunca se va a generar

        }

        while (1 < 2);

        // El bucle se repite siempre, solo se para con el break de minimo == maximo

        System.out.println("Fin del programa. Has puesto 2 números iguales.");

        sc.close();
    }

}
