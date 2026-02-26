import java.util.Scanner;

public class SolucionArrayParesOrdenados {

    public static void soloPares(int[] array, int[] array2) {
        int indice = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                array2[indice] = array[j];
                indice++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres meter en el Array?: ");
        int tamañoArray = sc.nextInt();

        int[] numeros = new int[tamañoArray];

        // 1️⃣ Llenar el array
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print("Número en la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // 2️⃣ Contar pares
        int contador = 0;
        for (int i = 0; i < tamañoArray; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        // 3️⃣ Crear nuevo array con tamaño correcto
        int[] arrayNuevo = new int[contador];

        // 4️⃣ Copiar solo pares
        soloPares(numeros, arrayNuevo);

        // 5️⃣ Mostrar resultado
        System.out.println("Números pares:");
        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.println(arrayNuevo[i]);
        }

        sc.close();
    }
}