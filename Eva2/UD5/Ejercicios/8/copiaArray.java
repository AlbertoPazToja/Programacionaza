import java.util.Scanner;

public class copiaArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        int[] copia = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número en la posición " + i);

            a[i] = sc.nextInt();

        }

    }

}
