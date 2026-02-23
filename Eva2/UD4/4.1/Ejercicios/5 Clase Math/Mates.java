import java.util.Scanner;

public class Mates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("La ecuación es ax² + bx + c = 0");
        System.out.println("");
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextInt();
        System.out.print("Introduce el valor de c: ");
        double c = sc.nextInt();

        // Pedimos que se introduzcan los valores de las variables por teclado

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        // Si a es igual a cero, es una ecuación de primer grado, y lo resolvemos como
        // una ecuaci

        if (a == 0) {
            double resultadoPrimerGrado = -c / b;

            System.out.println("Es una ecuación de primer grado. El valor de x es " + resultadoPrimerGrado);
        }

        // Hacemos una variable discriminante, que básicamente es lo que hay dentro de
        // la raíz cuadrada, y dependiendo de si da positivo, cero o negativo hacemos 3
        // posibles

        if (discriminante > 0) {

            double resultadoPositivo = ((b * -1) + Math.sqrt(discriminante)) / 2 * a;
            double resultadoNegativo = ((b * -1) - Math.sqrt(discriminante)) / 2 * a;

            System.out.println("El valor de x es " + resultadoPositivo + " y " + resultadoNegativo);

        }

        if (discriminante == 0) {

            double resultadoCero = (b * -1) / 2 * a;

            System.out.println("El valor de x es " + resultadoCero);
        }

        if (discriminante < 0) {

            System.out.println("No se puede hacer, ya que la raíz cuadrada es negativa");
        }

        sc.close();

        // Cerramos el Scanner
    }

}