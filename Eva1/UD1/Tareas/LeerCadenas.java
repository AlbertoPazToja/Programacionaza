import java.util.Scanner; //Importamos el paquete java.util.Scanner para poder utilizar el Scanner

public class LeerCadenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Crear o obxecto Scanner

        System.out.println("Primera frase: ");
        String frase1 = sc.nextLine();

        /*
          Hacemos que aparezca esa frase en el terminal y que podamos escribir nosotros
          una frase, introduciendo los datos y asignándolos a la variable frase1,
          directamente desde el terminal.
         */

        System.out.println("Segunda frase: ");
        String frase2 = sc.nextLine();

        System.out.println("Resultado: " + (frase1.concat(frase2))); /*Juntamos ambas variables para que aparezcan en el
                                                                     terminal las dos cadenas de texto juntas*/

        sc.close(); //Cerramos el Scanner
    }

}
