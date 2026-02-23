import java.util.Scanner;

public class ComparacionCadeas {

    static Scanner sc = new Scanner(System.in);

    public String cadena1;
    public String cadena2;

    public static int comparar(String cadena1, String cadena2) {

        // Creamos un método que devuelva un int dependiendo del resultado de comparar
        // las cadenas

        do {

            System.out.println("Introduce una cadena de texto");

            cadena1 = sc.nextLine();

            if (cadena1 == "") {

                System.err.println("La cadena no puede estar vacía, vuelve a intentarlo.");
            }

        }

        while (cadena1 == "");

        // Si la cadena está vacía, se imprime que se vuelva a intentar, y pide que se
        // introduzca la cadena mientras esté vacía

        do {

            System.out.println("Introduce el mismo texto");

            cadena2 = sc.nextLine();

            if (cadena2 == "") {

                System.err.println("La cadena no puede estar vacía, vuelve a intentarlo.");
            }

        }

        while (cadena2 == "");

        // Lo mismo que arriba

        int longitudCadena1 = cadena1.length();
        int longitudCadena2 = cadena2.length();

        if (longitudCadena1 != longitudCadena2) {

            System.out.println("Las 2 cadenas tienen longitudes distintas.");
            return -1;
        }

        // Se mete en una variable int la longitud de la cadena (un número), y se
        // comparan las 2, y si no son iguales, termina el programa y se devuelve un -1

        else {

            boolean noSonIguales = cadena1.equalsIgnoreCase(cadena2);

            if (noSonIguales == false) {

                System.out.println("No son iguales");
                return 0;
            }

            // Si no son iguales (ignorando mayúsculas), se termina el programa y se
            // devuelve un 0

            else {

                int igualesLexico = cadena1.compareTo(cadena2);

                if (igualesLexico == 0) {

                    System.out.println("Son completamente iguales (incluso mayúsculas y minúsculas)");

                    return 2;

                }

                // Si son exactamente iguales, mayúsculas y minúsculas incluído, se devuelve un
                // 2, y si no un 1.

                else {

                    System.out.println("Son iguales pero sin tener en cuenta las mayúsculas");

                    return 1;
                }

            }

        }

    }

}
