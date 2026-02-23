
/**
 * Programa que suma dous números enteiros usando a clase Scanner
 * e o método nextInt()
 */
public class OperacionSuma {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("\n Introduce o primeiro sumando:");
        int primeiroSumando = scan.nextInt(); // Lemos o primeiro sumando

        System.out.print("\n Introduce o segundo sumando:");
        int segundoSumando = scan.nextInt(); // Lemos o segundo sumando

        System.out.println("\n\n A suma é " +
                (primeiroSumando + segundoSumando));

        scan.close();
    }
}
