import java.util.Scanner;

public class PruebaFlagBooleano {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ceroIntroducido = false; // Flag para controlar a saída do bucle
        while (!ceroIntroducido) {
            System.out.print("Introduce un número (0 para saír): ");
            int num = scanner.nextInt();
            if (num == 0) {
                ceroIntroducido = true; // Activamos a flag para saír do bucle
            } else {
                System.out.println("Introduciches: " + num);
            }
        }
        System.out.println("Fin do programa. Introduciches un cero.");
        scanner.close();
    }
}
