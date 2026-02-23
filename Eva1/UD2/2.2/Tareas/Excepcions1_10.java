package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class Excepcions1_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto del Scanner y le asignamos una variable

        System.out.println("Introduce un número:");
        int Numero1 = sc.nextInt(); // Pedimos que se introduzca un número por teclado, y lo asignamos a la variable
                                    // Numero1

        System.out.println("Introduce otro número:");
        int Numero2 = sc.nextInt(); // Pedimos que se introduzca otro número por teclado, y lo asignamos a la
                                    // variable Numero2

        int Resultado = 0; // Creamos la variable resultado y le asignamos el valor de 0

        try {

            if (Numero1 > Numero2) {

                Resultado = Numero1 / Numero2;

                System.out.println(Resultado);

            }

            else {

                Resultado = Numero2 / Numero1;

                System.out.println(Resultado);
            }

            // Si Numero1 es mayor que Numero2 se divide el primero por el segundo, y si
            // Numero2 es mayor se hace lo contrario

        }

        catch (ArithmeticException e) {

            System.out.println("Error, no se puede dividir entre 0.");
        }

        // Si hay un error aritmético (uno de los números asignados es el 0), indicamos
        // que no se puede realizar la operación

        sc.close(); // Cerramos el Scanner

    }

}
