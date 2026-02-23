package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class BucleWhile1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número de personas:"); // Pedimos por teclado el número de personas
        int numeroPer = sc.nextInt();

        int i = 1; // Creamos la variable que funciona como contador
        int MediaAltura = 0; // Creamos la variable que funciona como la media de la altura

        while (i <= numeroPer) { // Mientras el contador es menor o igual al número de personas introducido antes
            System.out.println("Introduce la altura de la persona número " + i + " en centímetros");
            int Altura = sc.nextInt(); // Pedimos cada vez la altura de cada persona

            MediaAltura = Altura + MediaAltura; // La media es la suma de cada altura

            i++; // Sumamos 1 al contador
        }

        MediaAltura = MediaAltura / numeroPer; // La media es la suma de cada altura de antes entre el número de
                                               // personas

        System.out.println("La media es de: " + MediaAltura + "cm");

        sc.close();

    }

}
