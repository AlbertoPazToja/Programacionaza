package Tareas1.EstructuraSelectivaDoble;

import java.util.Scanner;

public class EstructuraSelectivaDoble1_3 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número:");

        double numero1 = sc.nextDouble(); // Para que lea el número introducido

        System.out.println("Introduce otro número:");

        double numero2 = sc.nextDouble(); // Para que lea el segundo número introducido

        if (numero1 < numero2) { // Si el primer número es menor que el segundo, va a aparecer en pantalla el primer número
                                 

            System.out.println(numero1 + " es el número más pequeño de los dos");

            if (numero1 == numero2){

                System.out.println(numero1 + " y " + numero2 + " son iguales");
            }
        }

        if (numero2 < numero1) { // Si el segundo número es menor que el primero, va a aparecer en pantalla el segundo número
                                 

            System.out.println(numero2 + " es el número más pequeño de los dos");

                if (numero1 == numero2){

                System.out.println(numero1 + " y " + numero2 + " son iguales");
            }
        }

        sc.close(); // Cerramos el Scanner
    }

}

