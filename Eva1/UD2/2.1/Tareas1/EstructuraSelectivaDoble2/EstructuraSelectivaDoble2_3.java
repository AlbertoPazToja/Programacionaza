package Tareas1.EstructuraSelectivaDoble2;

import java.util.Scanner; // Importamos el paquete java.util, para luego poder utilizar el Scanner

public class EstructuraSelectivaDoble2_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número: ");

        double numero = sc.nextDouble(); // Para que lea el número introducido

        if (numero == 0) { // Si el número es mayor o igual a 0, saldrá por pantalla que el número es positivo
                           

            System.out.println("El número es igual a 0");

            
        }

        else { // De lo contrario, saldrá por pantalla que el número es negativo

            if (numero > 0){

            System.out.println("El número es positivo");
            }

            else{

                System.out.println("El número es negativo");
            }
        }



        sc.close(); // Se cierra el objeto Scanner
    }

}

