import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del fichero que quieres copiar");
        String directorioViejo = sc.nextLine();
        System.out.println("Introduce el nombre del fichero nuevo copiado");
        String copia = sc.nextLine();
        File directorioNuevo = new File(copia);

        try {
            BufferedReader f = new BufferedReader(new InputStreamReader(new FileInputStream(directorioViejo)));

            String linea;

            PrintWriter w = new PrintWriter(directorioNuevo);

            while ((linea = f.readLine()) != null) {

                w.println(linea);

            }

            w.close();
            f.close();

        } catch (IOException e) {

            System.out.println("Muy muy mal");
        }

        sc.close();

    }
}

// NO DEJAR QUE EL PROPIO VISUAL PONGA THROWS IOEXCEPCION EN EL MAIN, PONER TRY
// CATCH ANTER DE CREAR LOS BUFFERED
