public class ContarPalabras {

    public static void contarFrase(String frase) {

        int longitud = frase.length() - 1;

        int nParrafos = 1;
        int nFrases = 0;
        int nPalabras = 0;

        // Iniciamos parrafos y palabra en 1, para que cuente los primeros, porque no
        // empiezan por /n ni por espacio. Las frases empiezan en 0, ya que todas
        // terminan en .

        int contador = 0;

        do {

            char letra = frase.charAt(contador);

            if (letra == ' ') {
                nPalabras++;
            }

            else if (letra == '.') {
                nFrases++;
                nPalabras++;

            }

            else if (letra == '\n') {

                nParrafos++;
            }

            contador++;
        }

        while (contador <= longitud);

        // Se va mirando cada caracter y se suma 1 al contador, hasta que el contador
        // sea igual que la longitud

        System.out.println("La frase es: \n " + "\"" + frase + "\"");
        System.out.println("El número de palabras es: " + nPalabras);
        System.out.println("El numero de frases es: " + nFrases);
        System.out.println("El número de parrafos es: " + nParrafos);
        System.out.println("El numero de letras es: " + frase.length());

    }

    public static void main(String[] args) {
        ContarPalabras.contarFrase(
                "Isto é unha proba. É un trozo de texto para probar o método.\nConsta de varios parágrafos. Tamén de varias frases e de moitas palabras.\nO resultado debe ser 3 parágrafaos, 5 frases, 38 palabras e 210 caracteres.");
    }

}
