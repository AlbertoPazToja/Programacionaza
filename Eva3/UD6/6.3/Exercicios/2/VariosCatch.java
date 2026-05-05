import java.util.InputMismatchException;
import java.util.Scanner;

public class VariosCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numPosicion = 0;
        int[] numerillos = { 3, 2, 1 };

        do {
            // Reiniciamos el contador; si llega al final del try sin errores, valdrá 0 y
            // saldrá del bucle
            contador = 0;

            try {
                System.out.println("Introduce un número enteiro> 0 e < 4");
                numPosicion = sc.nextInt() - 1;

                // Si esta línea falla, el programa salta directamente al catch correspondiente
                System.out.println(numerillos[numPosicion]);

            } catch (InputMismatchException e) {
                // Limpiamos el buffer para evitar un bucle infinito si el usuario mete texto
                sc.nextLine();
                System.out.println("Excepción. Debes introducir un número enteiro.");
                contador = 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Se ejecuta si el número está fuera del rango del array (0-2)
                System.out.println("Excepción. Esa posición no existe en el Array");
                contador = 1;
            } catch (Exception e) {
                // Captura cualquier otro error genérico no previsto anteriormente
                System.out.println("Excepción. Hay un error en el programa");
                contador = 1;
            } finally {
                // Este bloque se ejecuta siempre, haya error o no
                System.out.println("Me ejecuto siempre y tal");
            }

        } while (contador == 1);

        // Una vez validado el índice, mostramos el resultado final
        System.out.println("Valor en la posición " + (numPosicion + 1) + ": " + numerillos[numPosicion]);

        sc.close();
    }
}