import java.util.Scanner;

public class SolucionArrayParesOrdenados {

    public static void soloPares(int[] arrayInicial, int[] arrayFinal) {
        int auxiliar = 0; // Auxiliar para recorrer y rellenar el segundo array

        // Recorremos el primer array
        for (int j = 0; j < arrayInicial.length; j++) {
            // Comprobamos si el número es par
            if (arrayInicial[j] % 2 == 0) {
                // Si es par, lo guardamos en el segundo array
                arrayFinal[auxiliar] = arrayInicial[j];
                auxiliar++; // Avanzamos la posición del segundo array
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el tamaño del array
        System.out.print("¿Cuántos números quieres meter en el Array?: ");
        int tamañoArray = sc.nextInt();

        // Creamos el array con el tamaño indicado
        int[] numeros = new int[tamañoArray];

        // Rellenamos el array con los números que introduce el usuario
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Contamos cuántos números pares hay en el array
        int contador = 0;
        for (int i = 0; i < tamañoArray; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        // Creamos un nuevo array con el tamaño exacto de números pares
        int[] arrayDePares = new int[contador];

        // Llamamos al método para copiar solo los números pares
        soloPares(numeros, arrayDePares);

        // Mostramos por pantalla los números pares
        System.out.println("Números pares:");
        for (int i = 0; i < arrayDePares.length; i++) {
            System.out.println(arrayDePares[i]);
        }

        // Cerramos el Scanner
        sc.close();
    }
}