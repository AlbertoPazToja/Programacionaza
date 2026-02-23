package Tareas1;

import java.util.Scanner; // Importamos el paquete java.util, para luego poder utilizar el Scanner

public class EstructuraSelectivaSimple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número:");

        int numero = sc.nextInt(); // Para que lea el número introducido

        if (numero % 2 == 0) { // Si al dividir el número entre 2 el resto es 0, el número es par

            System.out.println("Tu número es par: " + numero);
        }

        else { // Si al dividir el número entre 2 el resto no es 0, el número es impar

            System.out.println("Tu número es impar: " + numero);
        }

        sc.close(); // Se cierra el objeto Scanner

    }

}
