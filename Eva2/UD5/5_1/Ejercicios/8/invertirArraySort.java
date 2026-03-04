import java.util.Arrays;

// Clase principal
public class invertirArraySort {

    public static void main(String[] args) {

        // Se declara e inicializa un array de tipo int con 5 valores
        int[] numerillos = { 1, 6, 7, 4, 2 };

        // Se muestra el array original
        System.out.println("Array original: ");

        // Bucle for-each para recorrer y mostrar cada valor del array
        for (int valor : numerillos) {
            System.out.println(valor);
        }

        // Se ordena el array en orden ascendente usando Arrays.sort()
        Arrays.sort(numerillos);

        System.out.println("Array ordenado ascendente");

        // Se muestra el array ya ordenado ascendentemente
        for (int valor : numerillos) {
            System.out.println(valor);
        }

        // Variable auxiliar que servirá para intercambiar valores
        int auxiliar = 0;

        // Bucle para invertir el array (convertirlo en descendente)
        // Solo se recorre hasta la mitad del array
        for (int i = 0; i < numerillos.length / 2; i++) {

            // Se guarda temporalmente el valor actual
            auxiliar = numerillos[i];

            // Se intercambia el valor de la posición actual
            // con el valor simétrico del final
            numerillos[i] = numerillos[numerillos.length - i - 1];

            // Se coloca el valor guardado en la posición opuesta
            numerillos[numerillos.length - i - 1] = auxiliar;
        }

        System.out.println("Array ordenado descendentemente");

        // Se muestra el array ya invertido (orden descendente)
        for (int valor : numerillos) {
            System.out.println(valor);
        }
    }

}