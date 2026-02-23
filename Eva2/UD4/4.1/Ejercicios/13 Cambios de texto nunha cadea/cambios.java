import java.util.Scanner;

public class cambios {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce a cadea: ");

        String frase1 = sc.nextLine();

        System.out.print("Introduce a palabra a cambiar: ");

        String fraseCambiar = sc.nextLine();

        System.out.print("Introduce a palabra pola que se fará o reemprazo: ");

        String fraseReemplazo = sc.nextLine();

        frase1 = frase1.replaceAll(fraseCambiar, fraseReemplazo);

        System.out.println("Cadea coa substitución feita: \n" + frase1);

    }

}
