package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class BucleDoWhile1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número: ");
        int numMultiplos = sc.nextInt(); // Pedimos que introduzca el número tope por teclado

        int Multiplo = 8; // Creamos la variable Multiplo y le asignamos el valor de 8

        do {
            System.out.println(Multiplo); // Enseñamos el múltiplo
            Multiplo = Multiplo + 8; // Le sumamos 8 cada vez

        }

        while (Multiplo <= numMultiplos); // Repetimos el bucle hasta que el número del múltiplo sea menor o igual al
                                          // número introducido por teclado

        sc.close();

    }

}
