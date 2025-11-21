package Ejemplos.Ascensor2_1;

import java.util.Scanner;

public class AppAscensor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el scanner

        int hacer = 0; // Creamos la variable hacer para luego el menú

        System.out.println("Introduce el piso en el que estás");
        int actual = sc.nextInt(); // Creamos una variable para definir el piso en el que estamos

        System.out.println("Introduce el límite de pisos");
        int limite = sc.nextInt(); // Creamos una variable para definir el límite de pisos

        if (actual > limite || actual < 0 || limite == 0) {
            System.err.print("El piso introducido no es válido, vuelve a intentarlo");
            // En el caso que el piso actual sea mayor que el límite o menor que 0, da error
        }

        else {

            Ascensor a = new Ascensor(actual, limite);

            do {

                System.out.println("¿Qué quieres hacer");
                System.out.println("");
                System.out.println("1 -> Subir");
                System.out.println("2 -> Bajar");
                System.out.println("3 -> Mostrar piso");
                System.out.println("4 -> Salir");
                System.out.println("");
                hacer = sc.nextInt();

                if (hacer == 1) {

                    System.out.println("¿Cuantos pisos quieres subir?");
                    int subimos = sc.nextInt();

                    a.subir(subimos);

                }

                else if (hacer == 2) {

                    System.out.println("¿Cuantos pisos quieres bajar?");
                    int bajamos = sc.nextInt();

                    a.bajar(bajamos);
                }

                else if (hacer == 3) {

                    a.situacion();
                }

            }

            while (hacer != 4);
        }

        sc.close();

    }

}

// Me queda por poner el límite al subir y al bajar, hay un problema (do-while)
