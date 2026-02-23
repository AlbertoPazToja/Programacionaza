package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EstructurasRepetitivas1_4DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número menor que 30:");
        int Numero = sc.nextInt(); // Pedimos que se introduzca por teclado un número menor que 30

        if (Numero > 30 || Numero < 1) { // Si el número es mayor que 30 o menor que 1

            System.out.println("Numero no válido. Introduce un número menor que 30"); // Se imprime que el número no es
                                                                                      // válido y termina el programa
        }

        else { // Si el número es válido

            System.out.println("La tabla de multiplicar de " + Numero + " es:");

            int ResultadoMultiplicacion = 0; // Creamos la variable ResultadoMultiplicacion
            int i = 0; // Creamos la variable i

            do {

                ResultadoMultiplicacion = i * Numero; // ResultadoMultiplicacion es igual a multiplicar i por el número
                                                      // introducido
                i++; // Sumamos 1 a i
                System.out.println(ResultadoMultiplicacion); // Enseñamos por pantalla el resultado de la multiplicación
                                                             // en cada vuelta
            }

            while (i <= 10); // Todo esto se hace hasta que i sea igual a 10
        }

        sc.close(); // Se cierra el Scanner

    }

}
