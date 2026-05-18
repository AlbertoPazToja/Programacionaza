import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo del que quieres contar el número de lineas");
        String archivoViejo = sc.nextLine();

        System.out.println("Introduce el nombre del archivo nuevo");
        String archivoNuevo = sc.nextLine();
        File file = new File(archivoNuevo);

        try {
            BufferedReader f = new BufferedReader(new FileReader(archivoViejo));

            FileWriter w = new FileWriter(file);

            String linea;

            int contador = 0;
            int numCaracteres = 0;

            while ((linea = f.readLine()) != null) {

                contador++;
                numCaracteres += linea.length();

            }

            w.write("El número de lineas del archivo " + archivoViejo + " es: " + contador
                    + " y el número de caracteres: " + numCaracteres);

            f.close();
            w.close();

        } catch (IOException e) {

            System.out.println("Error");
        }

        sc.close();

    }

}
