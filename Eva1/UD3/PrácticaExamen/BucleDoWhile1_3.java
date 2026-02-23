package PrácticaExamen;

import java.util.Scanner;

public class BucleDoWhile1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de múltiplos de 8");

        int numMultiplos = sc.nextInt();

        int numero = 0;

        for (int i = 1; i <= numMultiplos; i++) {

            numero = numero + 8;
            System.out.println(numero);
        }

        sc.close();

    }
}