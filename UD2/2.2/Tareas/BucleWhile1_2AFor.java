
package Tareas;

import java.util.Scanner; // Importamos el Scanner 

public class BucleWhile1_2AFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número de personas:");
        int NumeroPersonas = sc.nextInt(); // Pedimos que introduzca el número de personas por teclado y asignamos ese
                                           // número a la variable "NumeroPersonas"

        int Altura = 0; // Creamos la variable "Altura"
        int MediaAltura = 0; // Creamos la variable "MediaAltura"

        for (int i = 1; i <= NumeroPersonas; i++) { // Creamos el bucle, que crea la variable i (contador), que debe ser
                                                    // menor o igual (igual) al número de personas (NumeroPersonas), y
                                                    // finalmente sumamos uno al contador por cada vuelta

            System.out.println("Introduce la altura de la persona " + i + " en centímetros:");
            Altura = sc.nextInt(); // Pedimos que vaya introduciendo por teclado la altura de cada persona

            MediaAltura = MediaAltura + Altura; // Se le va sumando los números de altura a la variable "MediaAltura"

        }

        MediaAltura = MediaAltura / NumeroPersonas; // Dividimos la suma de todas las alturas entre el número de
                                                    // personas

        System.out.println("La media es de: " + MediaAltura + "cm");

        sc.close();

    }

}
