import java.util.Scanner;

public class usoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] listaEnteros = new int[10];

        for (int i = 0; i <= listaEnteros.length - 1; i++) {

            System.out.println("Introduce el número en la posición " + i + ": ");
            listaEnteros[i] = sc.nextInt();
        }

        for (int i = 0; i <= listaEnteros.length - 1; i++) {

            System.out.print(listaEnteros[i] + ", ");
        }

        int temporal = 0;
        int longitud = listaEnteros.length;

        temporal = listaEnteros[0];
        listaEnteros[0] = listaEnteros[longitud - 1];
        listaEnteros[longitud - 1] = temporal;

        System.out.println("\nAhora cambiando el primer número por el último:");

        for (int valores : listaEnteros) {

            System.out.print(valores + ", ");
        }

        sc.close();

    }
}
