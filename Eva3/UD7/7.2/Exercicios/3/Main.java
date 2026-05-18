import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero que quieres contar las vocales");
        String nombreFichero = sc.nextLine();

        try {

            FileReader f = new FileReader(nombreFichero);

            int valor;

            int contador = 0;

            // Bucle para leer el archivo carácter por carácter hasta llegar al final (-1)
            while ((valor = f.read()) != -1) {

                char caracter = (char) valor;

                char minuscula = Character.toLowerCase(caracter);

                // Comprobamos si el carácter es una vocal
                if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u') {

                    contador++;

                }

            }

            System.out.println("Número de vogaleis: " + contador);

            f.close();

        } catch (FileNotFoundException f) {

            System.out.println("Segue sen atoparse");
        } catch (IOException e) {

            System.out.println("Non se atopa o devandito archevo");
        }

        sc.close();

    }

}