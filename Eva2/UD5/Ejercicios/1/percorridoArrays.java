public class percorridoArrays {

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5 };

        int resultado = 0;

        // Hacemos un array con varios números e inicializamos una variable que será el
        // resultado de la suma

        for (int valor : numeros) {

            System.out.print(valor + " ");
        }

        // Va imprimiento uno por uno

        for (int valor : numeros) {

            resultado = resultado + valor;
        }

        System.out.println("\nLa suma de todos los valores es: " + resultado);

        // Va sumándolos y añadiéndolos a la variable resultado

    }

}
