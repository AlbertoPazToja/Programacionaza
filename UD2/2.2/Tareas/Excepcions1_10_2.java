package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class Excepcions1_10_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        int Resultado = 0;
        int Numero1 = 0;
        int Numero2 = 0;
        int contador = 0;

        // Creamos todas las variables que se van a utilizar

        do { // Comenzamos un bucle (do/while)

            contador++; // Hacemos que en cada vuelta, se le sume 1 al contador, para saber el número de
                        // divisiones que se van a hacer

            System.out.println("Introduce un número:");
            Numero1 = sc.nextInt(); // Pedimos que introduzca un número por teclado, y se lo asignamos a la variable
                                    // Numero1

            System.out.println("Introduce otro número:");
            Numero2 = sc.nextInt(); // Pedimos que introduzca otro número por teclado, y lo asignamos a la variable
                                    // Numero2

            try {

                if (Numero1 > Numero2) {

                    Resultado = Numero1 / Numero2;

                    System.out.println("El resultado de la división es: " + Resultado);

                }

                else {

                    Resultado = Numero2 / Numero1;

                    System.out.println("El resultado de la división es: " + Resultado);
                }

            }

            // Si el primero número es mayor que el segundo, se hace lo del if, y si no, lo
            // del else

            catch (ArithmeticException e) {

                System.out.println("Error, no se puede dividir entre 0.");
            }

        }

        while (Numero1 != -1 || Numero2 != -1); // Se repite el bucle hasta que los dos números introducidos por teclado
                                                // sean -1

        System.out.println("Fin del programa" + ", se han hecho " + contador + " divisiones en total.");

        sc.close();

    }

}
