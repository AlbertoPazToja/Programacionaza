import java.util.Scanner;

public class SumaDecimais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Crear o obxecto Scanner

        System.out.println("Introduce el primer número: ");
        float numero1 = sc.nextFloat();

        System.out.println("Introduce el segundo número: ");

        float numero2 = sc.nextFloat();

        float resultado = numero1 + numero2;

        System.out.println("El resultado es: " + resultado);

        sc.close();

    }

}
