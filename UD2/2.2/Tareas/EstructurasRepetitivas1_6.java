package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class EstructurasRepetitivas1_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un número:");
        int Numero = sc.nextInt();

        if (Numero <= 0) { // Si el número es negativo, se imprime lo siguiente

            System.out.println("El número no es primo, es negativo");
        }

        else {

            int flag = 0; // Creamos la variable flag, que funciona parecido a un boolean

            for (int i = 2; i <= (Numero / 2); i++) { // Creamos la variable i, que compruebe en cada vuelta si y es
                                                      // igual o menor al número que pusimos entre 2, y se suma i en
                                                      // cada vuelta para comprobar la division entre el número entre
                                                      // cada número
                if (Numero % i == 0) { // Si encuentra un divisor, es porque NO es un número primo

                    flag = 1;
                }

            }

            if (flag == 0) {

                System.out.println(Numero + " es un número primo");
            }

            else { // (Flag == 1)

                System.out.println(Numero + " no es un número primo");
            }

        }

        sc.close();
    }

}
