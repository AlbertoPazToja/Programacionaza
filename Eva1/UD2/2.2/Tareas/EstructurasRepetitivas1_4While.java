package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EstructurasRepetitivas1_4While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número menor de 30");
        int Numero = sc.nextInt(); // Pedimos que introduzca un número por teclado

        if (Numero > 30 || Numero < 1) { // Si el numero es mayor que 30 o menor que 1, imprime que no es válido y se
                                         // termina
            System.out.println("Número no válido. Introduce un número menor que 30");
        }

        else { // Si no
            int ResultadoMultiplicacion = 0; // Creamos la variable ResultadoMultiplicacion
            int i = 0; // Creamos la variable i

            System.out.println("La tabla de multiplicar de " + Numero + " es:");

            while (i <= 10) { // Mientras i sea menor o igual que 10 (inicia el bucle)
                ResultadoMultiplicacion = Numero * i; // ResultadoMultiplicacion es igual a multiplicar Numero
                                                      // (introducido por teclado) por i

                i++; // Sumamos 1 a i

                System.out.println(ResultadoMultiplicacion); // Mostramos la variable ResultadoMultiplicacion en cada
                                                             // vuelta del bucle
            }
        }

        sc.close(); // Cerramos el Scanner

    }

}
