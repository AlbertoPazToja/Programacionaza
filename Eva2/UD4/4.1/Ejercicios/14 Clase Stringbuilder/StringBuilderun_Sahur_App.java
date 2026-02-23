import java.util.Scanner;

public class StringBuilderun_Sahur_App {

    public static void main(String[] args) {

        // Se crea un objeto de la clase StringBuilderun_Sahur
        StringBuilderun_Sahur a1 = new StringBuilderun_Sahur();

        // Scanner para leer datos introducidos por el usuario
        Scanner sc = new Scanner(System.in);

        // Se pide al usuario el texto original
        System.out.print("Texto original: ");
        String cadenaOriginal = sc.nextLine();

        // Se pide la cadena que se quiere sustituir
        System.out.print("Cadena antigua: ");
        String antiguo = sc.nextLine();

        // Se pide la nueva cadena que reemplazará a la antigua
        System.out.print("Cadena nueva: ");
        String nuevo = sc.nextLine();

        // Se pide la palabra que se va a insertar
        System.out.print("Introduce palabra a introducir: ");
        String palabra = sc.nextLine();

        // Se pide la posición donde se insertará la palabra
        System.out.print("Introduce la posición de la palabra: ");
        int posicion = sc.nextInt();

        // Se llama al método que invierte la cadena
        a1.invertirCadena(cadenaOriginal);

        // Se llama al método que elimina las vocales
        a1.sinVocales(cadenaOriginal);

        // Se llama al método que sustituye una cadena por otra
        a1.substituir(cadenaOriginal, antiguo, nuevo);

        // Se llama al método que inserta una palabra en una posición concreta
        a1.insertar(cadenaOriginal, palabra, posicion);

        // Se cierra el Scanner
        sc.close();
    }
}