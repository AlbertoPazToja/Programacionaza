import java.util.Scanner;

public class arrayParesOrdenados {

    public static void soloPares(int[] array, int[] array2) {

        int ayuda = 0;
        for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 == 0) {

                array2[ayuda] = array[j];
                ayuda++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres meter en el Array?: ");
        int tamañoArray = sc.nextInt();

        int[] numeros = new int[tamañoArray];

        int contador = 0;

        for (int i = 0; i < tamañoArray; i++) {

            if (numeros[i] % 2 == 0) {

                contador++;
            }

            int[] arrayNuevo = new int[contador];

            for (int j = 0; j < numeros.length; j++) {

                System.out.println("Número en la posicion " + j + ": ");
                numeros[i] = sc.nextInt();
            }

            soloPares(numeros, arrayNuevo);

            for (int k = 0; k < numeros.length; k++) {

                System.out.println(numeros);

            }

            sc.close();

        }

    }

}
