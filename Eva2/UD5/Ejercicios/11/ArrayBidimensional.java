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

    }

}
