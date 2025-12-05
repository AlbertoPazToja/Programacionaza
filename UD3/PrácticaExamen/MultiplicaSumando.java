package PrácticaExamen;

import java.util.Scanner;

public class MultiplicaSumando {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");

        double numero1 = sc.nextDouble();

        System.out.println("Introduce un segundo número:");

        double numero2 = sc.nextDouble();

        int contador = 1;

        double resultado = 0;

        while (contador <= numero2) {

            resultado = resultado + numero1;

            contador++;
        }

        System.out.println("El resultado es: " + resultado);

        sc.close();

    }
}
