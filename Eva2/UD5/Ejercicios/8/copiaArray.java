import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

// Clase principal
public class copiaArray {

    public static void main(String[] args) {

        // Se crea un objeto Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        // Se declara un array de 5 posiciones para almacenar números enteros
        Integer[] a = new Integer[5];

        // Se declara otro array de 5 posiciones que será la copia del primero
        Integer[] copia = new Integer[5];

        // Bucle para pedir al usuario que introduzca los 5 números
        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce el número en la posición " + i);

            // Se guarda el número introducido en la posición correspondiente del array
            a[i] = sc.nextInt();
        }

        // Bucle para copiar los elementos del array 'a' al array 'copia'
        for (int i = 0; i < a.length; i++) {
            copia[i] = a[i];
        }

        // Se muestran los elementos del array original
        System.out.println("Array a:");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Se muestran los elementos del array copia
        System.out.println("Array copia:");

        for (int i = 0; i < a.length; i++) {
            System.out.println(copia[i]);
        }

        // Se ordena el array original en orden ascendente
        Arrays.sort(a);
        System.out.println("Elementos del array ordenados ascendentemente:" + Arrays.toString(a));

        // Se ordena el array copia en orden descendente
        Arrays.sort(copia, Collections.reverseOrder());
        System.out.println("Elementos del array ordenados descendentemente:" + Arrays.toString(copia));

        // Línea separadora final
        System.out.println("--------------------------------------------------------------------------------");

        sc.close();

    }

}
