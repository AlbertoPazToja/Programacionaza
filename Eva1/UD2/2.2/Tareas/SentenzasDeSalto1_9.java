package Tareas;

public class SentenzasDeSalto1_9 {

    public static void main(String[] args) {

        int Numeros; // Declaramos la variable Numeros

        for (Numeros = 1; Numeros <= 10; Numeros++) { // Numeros tiene el valor de 1, va a repetirse el bucle hasta el
                                                      // 10, y en cada vuelta se le suma 1 a Numeros

            if (Numeros == 5) {
                continue; // Cuanto Numeros tenga el valor 5, el continue hace que se deje de ejecutar el
                          // bucle y siga en el siguiente número (6) (no se hace el print)
            }

            if (Numeros == 8) {
                break; // Cuando Numeros tenga el valor 8, se termina el bucle automáticamente y
                       // continua el programa
            }

            System.out.println(Numeros);

        }

        System.out.println("Fuera del bucle");
    }

}
