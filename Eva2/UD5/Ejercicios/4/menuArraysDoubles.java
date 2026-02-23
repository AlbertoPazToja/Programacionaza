import java.util.Scanner;

public class menuArraysDoubles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        double[] listaNumeros = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // Creamos un array con 12 números

        while (opcion != 8) {

            System.out.println("\n1- Introducir los 12 números");
            System.out.println("2- Mostrar los 12 números");
            System.out.println("3- Pedir una posicion y escribir el valor 0");
            System.out.println("4- Pedir una posición y escribir el valor introducido por teclado");
            System.out.println("5- Intercambiar los 2 primeros valores del array");
            System.out.println("6- Intercambiar el 3º y 4º valor del array");
            System.out.println("7- Intercambiar los valores del array de 2 en 2 (1 por el 2, 3 por el 4...");
            System.out.println("8- Salir");
            System.out.println("Introduce la opción: ");

            opcion = sc.nextInt();

            // Creamos un menú, que pide un número por teclado, y dependiendo del número,
            // mediante un switch y cases, se hace cierta cosa. El menú se repite mientras
            // que se introduzca un número distinto de 8.

            switch (opcion) {
                case 1:
                    for (int i = 0; i < listaNumeros.length; i++) {

                        System.out.println("Introduce el número en la posición " + i + ": ");
                        listaNumeros[i] = sc.nextDouble();
                    }

                    break;

                // Caso 1: Se crea un bucle. Se pide que se introduzca el número en la posición
                // i (0), y en cada vuelta se suma 1 a i, por lo que va pidiendo todos los
                // números del array. Para cuando i es igual a la longitud del array (longitud =
                // 12 pero hay 11 números).

                case 2:
                    for (double valores : listaNumeros) {

                        System.out.print(valores + ", ");
                    }

                    System.out.println(" ");

                    break;

                // Caso 2: Se crea un bucle foreach, que recorre automáticamente todo el array.
                // En cada vuelta del bucle, la variable "valores" toma el valor de cada
                // posición
                // del array y lo imprime por pantalla separado por comas. Finaliza cuando ha
                // recorrido todas las posiciones del array.

                case 3:
                    System.out.println("Introduce la posición: ");
                    int posicionCaso3 = sc.nextInt();

                    if (posicionCaso3 >= listaNumeros.length) {

                        System.out.println("No puedes hacer eso browsky");
                    }

                    if (posicionCaso3 < listaNumeros.length) {

                        listaNumeros[posicionCaso3] = 0;

                    }

                    break;

                // Caso 3: Se pide al usuario que introduzca una posición del array.
                // El programa accede directamente a esa posición y le asigna el valor 0,
                // sustituyendo el número que hubiera anteriormente en esa posición.

                case 4:
                    System.out.println("Introduce la posición: ");
                    int posicionCaso4 = sc.nextInt();

                    if (posicionCaso4 >= listaNumeros.length) {

                        System.out.println("No puedes hacer eso chat.");
                    }

                    if (posicionCaso4 < listaNumeros.length) {

                        System.out.println("Introduce el número que quieres introducir: ");
                        double numeroCaso4 = sc.nextDouble();

                        listaNumeros[posicionCaso4] = numeroCaso4;
                    }

                    break;

                // Caso 4: Se pide al usuario una posición del array y después un número.
                // El número introducido se guarda en la posición indicada,
                // reemplazando el valor que estuviera almacenado anteriormente.

                case 5:
                    double posicionAyudaCaso5 = listaNumeros[0];
                    listaNumeros[0] = listaNumeros[1];
                    listaNumeros[1] = posicionAyudaCaso5;

                    break;

                // Caso 5: Se intercambian los valores de las posiciones 0 y 1 del array.
                // Para ello se usa una variable auxiliar que guarda temporalmente
                // el valor de la primera posición, permitiendo realizar el intercambio
                // sin perder ningún dato.

                case 6:
                    double posicionAyudaCaso6 = listaNumeros[2];
                    listaNumeros[2] = listaNumeros[3];
                    listaNumeros[3] = posicionAyudaCaso6;

                    break;

                // Caso 6: Se intercambian los valores de las posiciones 2 y 3 del array.
                // Al igual que en el caso anterior, se utiliza una variable auxiliar
                // para guardar uno de los valores mientras se realiza el cambio.

                case 7:
                    int posicionCaso7Numero1 = 0;
                    int posicionCaso7Numero2 = 1;

                    double posicionAyudaCaso7 = 0;

                    while (posicionCaso7Numero1 < listaNumeros.length) {

                        posicionAyudaCaso7 = listaNumeros[posicionCaso7Numero1];
                        listaNumeros[posicionCaso7Numero1] = listaNumeros[posicionCaso7Numero2];
                        listaNumeros[posicionCaso7Numero2] = posicionAyudaCaso7;

                        posicionCaso7Numero1 = posicionCaso7Numero1 + 2;
                        posicionCaso7Numero2 = posicionCaso7Numero2 + 2;

                    }

                    break;

                // Caso 7: Se intercambian los valores del array de dos en dos.
                // Comienza intercambiando las posiciones 0 y 1, después 2 y 3,
                // luego 4 y 5, y así sucesivamente.
                // El bucle while continúa mientras la primera posición sea menor
                // que la longitud del array, aumentando ambas posiciones en 2
                // en cada vuelta para avanzar por parejas.

                default:
                    break;
            }

        }

        System.out.println("Has seleccionado el 8. Se termina el programa.");

        sc.close();
    }
}
