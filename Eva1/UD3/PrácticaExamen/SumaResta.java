package PrácticaExamen;

import java.util.Scanner;

public class SumaResta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un dividendo");

        int dividendo = sc.nextInt();

        System.out.println("Introduce ahora un divisor");

        int divisor = sc.nextInt();

        int cociente = 0;

        int resto = 0;

        int contador = 0;

        while (dividendo >= divisor) {

            dividendo = dividendo - divisor;

            contador++;

        }

        cociente = contador;

        resto = dividendo;

        System.out.println(" El cociente es: " + cociente);
        System.out.println(" El resto es: " + resto);

        sc.close();

    }

}
