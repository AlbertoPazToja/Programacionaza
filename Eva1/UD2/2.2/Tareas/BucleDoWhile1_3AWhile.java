package Tareas;

import java.util.Scanner;

public class BucleDoWhile1_3AWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numMultiplos = sc.nextInt();

        int Multiplo = 8;

        while (Multiplo <= numMultiplos) {

            System.out.println(Multiplo);

            Multiplo = Multiplo + 8;

        }

        sc.close();

    }

}
