package Tareas;

import java.util.Scanner; // importamos el Scanner

public class BucleWhile1_2ADoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce el número de personas:");
        int NumeroPersonas = sc.nextInt(); // Pedimos que introduzca por teclado el número de personas, y se le asigna a
                                           // la variable "NumeroPersonas"
        if (NumeroPersonas == 0) {
            System.out.println("Valor inválido. Vuelve a intentarlo");

        }

        else {

            int i = 1; // Creamos la variable "i" (contador)
            int Altura = 0; // Creamos la variable "Altura"
            int MediaAltura = 0; // Creamos la variable "MediaAltura"

            do {
                System.out.println("Introduce la altura de la persona " + i + " en centímetros:");
                Altura = sc.nextInt(); // Pedimos que introduzca por teclado la altura de cada persona y se le asigne a
                                       // la variable "Altura"

                MediaAltura = MediaAltura + Altura; // Sumamos cada altura para meter el resultado en la variable
                                                    // "MediaAltura"

                i++; // Sumamos 1 al contador
            }

            while (i <= NumeroPersonas); // El bucle termina cuando "i" es menor o igual (igual) que el número de
                                         // personas ("NumeroPersonas")

            MediaAltura = MediaAltura / NumeroPersonas; // Dividimos la suma de alturas entre el número de personas

            System.out.println("La media es de: " + MediaAltura + "cm");

            sc.close();

        }

    }

}
