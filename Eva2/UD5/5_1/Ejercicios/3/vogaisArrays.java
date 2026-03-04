public class vogaisArrays {

    public static int contaVocais() {

        char[] caracteres = { 'a', 'e', '6', 'R', 'w', 'E', '7' };

        System.out.println("El array contiene los siguientes caracteres:");

        int contadorVogais = 0;

        for (char valor : caracteres) {

            System.out.print(valor + ", ");

            if (valor == 'A' || valor == 'E' || valor == 'I' || valor == 'O' || valor == 'U' || valor == 'a'
                    || valor == 'e' || valor == 'i' || valor == 'o' || valor == 'u') {

                contadorVogais++;
            }
        }

        // El for imprime los valores 1 por 1 (for mejorado), y si uno de los valores es
        // una vocal, lo suma a un contador, luego devuelve ese contador

        System.out.println("\nEl número de vocales es: ");
        return contadorVogais;

    }

}
