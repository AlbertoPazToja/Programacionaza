import java.util.Scanner;

public class BuscarPalabras {

    // Scanner para leer lo que escribe el usuario
    static Scanner sc = new Scanner(System.in);

    // Método que cuenta cuántas veces aparece un texto dentro de otro
    public static void aparicionsPalabra() {

        // Variables
        String frasePrincipal;
        String fraseSecundaria;
        int posicion = 0;
        int contador = 0;

        // Pedimos la frase principal
        System.out.print("Introduce la frase: ");
        frasePrincipal = sc.nextLine();

        // Pedimos la palabra o caracteres a buscar
        System.out.print("Introduce los caracteres a buscar: ");
        fraseSecundaria = sc.nextLine();

        // Pasamos todo a minúsculas para evitar problemas con mayúsculas
        frasePrincipal = frasePrincipal.toLowerCase();
        fraseSecundaria = fraseSecundaria.toLowerCase();

        // Buscamos la palabra dentro de la frase (busca la frase secundaria desde la
        // posición "posicion")
        while ((posicion = frasePrincipal.indexOf(fraseSecundaria, posicion)) != -1) {

            // Cada vez que la encuentra, sumamos 1
            contador++;

            // Avanzamos la posición para seguir buscando
            posicion = posicion + fraseSecundaria.length();

        }

        // Mostramos el resultado
        System.out.println(
                "El número de ocurrencias de \"" + fraseSecundaria + "\" es: " + contador);
    }

    // Método principal
    public static void main(String[] args) {
        aparicionsPalabra();
    }
}