package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EstructurasRepetitivas1_4For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número menor que 30:");
        int Numero = sc.nextInt(); // Pedimos un número por teclado

        if (Numero > 30 || Numero < 1) {
            System.out.println("Número no válido. Introduce un númenor menor que 30");
        } // Si el número es mayor que 30 o menor que 1, imprime que no es válido y
          // termina de
          // ejecutarse el programa

        else { // Si el número es menor que 30

            System.out.println("La tabla de multiplicar de " + Numero + " es:"); // Fuera del bucle, para que no se
                                                                                 // repita en cada número

            int ResultadoMultiplicacion = 0; // Creamos la variable "ResultadoMultiplicación"

            for (int i = 0; i <= 10; i++) { // Creamos la variable i (contador), debe ser menor o igual que 10 (10
                                            // primeros múltiplos) y le sumamos 1 al contador en cada vuelta

                ResultadoMultiplicacion = Numero * i; // ResultadoMultiplicación es el resultado del número introducido
                                                      // por
                                                      // teclado por i

                System.out.println(ResultadoMultiplicacion); // Mostramos cada múltiplo en cada vuelta

            }

        }

        sc.close(); // Cerramos el Scanner

    }

}
