package Tareas;

import java.util.Scanner;

public class EstructurasRepetitivas1_8 {

    public static void main(String[] args) {

        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número por teclado");
        int Numero1 = sc.nextInt();

        System.out.println("Introduce el segundo número por teclado");
        int Numero2 = sc.nextInt();

        if (Numero1 <= 0 || Numero2 <= 0) {

            System.out.println("Número inválido. Introduce números positivos");
        }

        else if (Numero1 == Numero2) {

            System.out.println("Números inválidos. Introduce dos números distintos");
        }

        else if (Numero1 > Numero2) {

            for (i = Numero1; Numero1 % i == 0 && Numero2 % i == 0; i++) {

                if (Numero1 % i == 0 && Numero2 % i == 0) {

                    System.out.println("El mínimo común múltiplo de " + Numero1 + " y " + Numero2 + " es " + i);

                }

            }

        }

        sc.close();

    }

}
