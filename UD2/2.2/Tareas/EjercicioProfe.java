// Programa que lee un número entero positivo y determina si el número de digitos decimales necesarios para representar dicho valor ( 3567 -> 4 dígitos)

package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EjercicioProfe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número:");
        int Numero = sc.nextInt(); // Pedimos que introduzca un número por teclado

        int i = 10; // Creamos la variable i y le atribuímos el valor de 10
        int contador = 1; // Creamos la variable contador y le atribuímos el valor de 1

        if (Numero >= 0) { // Mientras el número sea positivo

            while ((Numero / i) > 0) { // Y mientras al dividir el número entre 10 el número siga siendo positivo

                Numero = Numero / i; // Dividimos el número entre 10

                contador++; // Sumamos 1 al contador, osea tiene otro dígito más
            }

            System.out.println("El número tiene " + contador + " dígitos");

        }

        else {

            System.out.println("El número no es válido");
        }

        sc.close();

    }

}
