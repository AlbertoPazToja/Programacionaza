import java.util.Scanner;

public class Caracter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadNumeros;
        int opcionMenu;

        // Creamos el objeto Scanner y los atributos de la clase

        do {

            System.out.println("Cantidad de números. Introduce un número entre 1 y 50");
            cantidadNumeros = sc.nextInt();

        }

        while (cantidadNumeros > 50 || cantidadNumeros < 0);

        // Pide por pantalla un número entr 1 y 50 hasta que el numero introducido esté
        // entre esos dos números

        if (cantidadNumeros == 0) {

            System.out.println("Has introducido un 0. Saliendo del programa.");
        }

        // Si el número introducido es 0, se acaba el programa

        else if (cantidadNumeros != 0) {

            // Si no es un 0, se haber un menú, que dependiendo de el número introducido por
            // teclado realiza una opción u otra

            do {

                System.out.println("Opciones dispoñibles");
                System.out.println("1. Indicar cantas letras hai.");
                System.out.println("2. Indicar cantos díxitos hai.");
                System.out.println("3. Indicar cantos son maiúsculas.");
                System.out.println("4. Transformalos a minúscula.");
                System.out.println("5. Saír");

                opcionMenu = sc.nextInt();

                switch (opcionMenu) {
                    case 1:

                        int contadorOpcion1 = 0;
                        int contadorOpcion1Caracteres = 0;

                        // Si elegimos el caso 1, creamos unas variables que funcionan como contadores

                        do {
                            System.out.print("Introduce un número: ");
                            int numero = sc.nextInt();

                            // Pedimos un número por teclado

                            char l = (char) numero;
                            System.out.println("Valor unicode: " + numero + " y representación: " + l);
                            // Ese número se convierte a un caracter en unicode

                            if (Character.isLetter(l)) {

                                contadorOpcion1Caracteres++;

                                // Si es una letra ese caracter, se suma 1 a un contador

                            }

                            contadorOpcion1++;
                        }

                        while (contadorOpcion1 < cantidadNumeros);

                        // Se hace hasta que se llegue al número de números introducido al principio

                        System.out.println("Hay " + contadorOpcion1Caracteres + " letras.");

                        break;

                    case 2:

                        int contadorOpcion2 = 0;
                        int contadorOpcion2Caracteres = 0;

                        do {
                            System.out.print("Introduce un número: ");
                            int numero = sc.nextInt();

                            char n = (char) numero;
                            System.out.println("Valor unicode: " + numero + " y representación: " + n);

                            if (Character.isDigit(n) == true) {

                                contadorOpcion2Caracteres++;
                            }

                            contadorOpcion2++;

                        }

                        while (contadorOpcion2 < cantidadNumeros);

                        System.out.println("Hay " + contadorOpcion2Caracteres + " números.");

                        break;

                    // Lo mismo pero con números

                    case 3:

                        int contadorOpcion3 = 0;
                        int contadorOpcion3Caracteres = 0;

                        do {
                            System.out.print("Introduce un número: ");
                            int numero = sc.nextInt();

                            char L = (char) numero;
                            System.out.println("Valor unicode: " + numero + " y representación: " + L);

                            if (Character.isUpperCase(L) == true) {

                                contadorOpcion3Caracteres++;

                                // Si es mayúscula

                            }

                            contadorOpcion3++;
                        }

                        while (contadorOpcion3 < cantidadNumeros);

                        System.out.println("Hay " + contadorOpcion3Caracteres + " letras mayúsculas.");

                        break;

                    // Lo mismo pero solo con mayúsculas

                    case 4:

                        int contadorOpcion4 = 0;

                        do {

                            System.out.println("Introduce un número");
                            int numero = sc.nextInt();

                            char m = (char) numero;
                            System.out.println("Valor unicode: " + numero + " y representación: " + m);

                            if (Character.isUpperCase(m) && Character.isLetter(m)) {

                                System.out
                                        .println("Convertimos " + m + " a minúscula y da " + Character.toLowerCase(m));

                                // Si es una letra mayúscula se convierte en minúscula
                            }

                        }

                        while (contadorOpcion4 < cantidadNumeros);

                    default:
                        break;
                }

            }

            while (opcionMenu != 5);
            System.out.println("Termina el programa");
            sc.close();

        }

    }

}
