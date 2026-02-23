import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coincidencias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una expresión regular: ");

        String expresion = sc.nextLine();

        System.out.print("Introduce la cadena a comprobar: ");

        String comprobante = sc.nextLine();

        Pattern pat = Pattern.compile(expresion);
        Matcher mat = pat.matcher(comprobante);

        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }

        sc.close();

    }

}
