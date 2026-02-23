
public class Calculadora {

    public static void sumar(double a, double b) {

        double resultado = a + b;

        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }

    public static void restar(double a, double b) {

        double resultado = a - b;

        System.out.println("La resta de " + a + " y " + b + " es: " + resultado);
    }

    public static void multiplicar(double a, double b) {

        double resultado = a * b;

        System.out.println("El producto de " + a + " y " + b + " es: " + resultado);
    }

    public static void dividir(double a, double b) {

        if (b == 0) {

            System.out.println("No se puede dividir entre 0.");
        }

        else {

            double resultado = a / b;

            System.out.println("La division de " + a + " y " + b + " es: " + resultado);
        }

    }
    // Creamos un método para cada operación matemática

    public static void main(String[] args) {
        Calculadora.sumar(5, 3);
        Calculadora.restar(10, 4);
        Calculadora.multiplicar(6, 7);
        Calculadora.dividir(8, 2);
        Calculadora.dividir(8, 0);
    }

    // Al hacer los métodos static, no es necesario crear ningun objeto para
    // utilizar los métodos, por lo que podemos hacerlo todo en la misma clase, y
    // podemos acceder a los parámetros (la suma de a y b es:...)

}
