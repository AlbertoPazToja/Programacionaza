import java.util.Scanner;

public class OperacionsCadeas {

    static Scanner sc = new Scanner(System.in);

    public static String reves(String cadena1) {

        String cadenareves = "";

        int longitudCadena = cadena1.length();

        int contador = longitudCadena - 1;

        // Como el cadena1.length empieza en 0, pongo que contador sea cadena1.length
        // -1, para que el contador empiece en el último caracter de la cadena y no en
        // uno de más.

        do {

            char letra = cadena1.charAt(contador);

            cadenareves = cadenareves + letra;

            contador--;

            // Añado los caracteres de derecha a izquierda a otra variable cadena, y voy
            // restando 1 al contador en cada vuelta para que pille un caracter menos cada
            // vez
        }

        while (contador >= 0);

        return cadenareves;

        // Se hace hasta que el contador sea igual que 0 (termine la cadena)

    }

    public static String sinEspazos(String cadena1) {

        String cadenaSinVacios = "";
        int longitudCadena = cadena1.length();
        int contador = 0;

        do {

            int unicode = cadena1.codePointAt(contador);

            if (unicode != 32) {

                char caracter = cadena1.charAt(contador);

                cadenaSinVacios = cadenaSinVacios + caracter;

            }

            // Va mirando que número de unicode es cada caracter, el espacio en blanco es
            // 32, si es cualquier número distinto de 32, se añade el caracter a otra
            // cadena, y se devuelve esa cadena cuando termine

            contador++;

        } while (contador <= longitudCadena - 1);

        // Se repite hasta que termine la cadena

        return cadenaSinVacios;

    }

    /*
     * public static boolean palindromo(String cadena1) {
     * 
     * String original = cadena1.toLowerCase();
     * original = sinEspazos(original);
     * 
     * }
     * 
     * }
     */
}
