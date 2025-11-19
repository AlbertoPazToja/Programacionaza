// Ejercicio 1.7

package Tareas;

import java.util.Scanner; // Importamos el Scanner

public class Depuracion1_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        int Dia = 0;

        int Mes = 0;

        int Año = 0;

        // Creamos las variables de día, mes y año, y les asignamos el valor de 0

        do {
            System.out.println("Introduce tu día de nacimiento:");
            Dia = sc.nextInt();

            if (Dia < 1 || Dia > 31) {
                System.out.println("Día inválido. Inténtalo de nuevo.");
            }

        } while (Dia < 1 || Dia > 31);

        do {
            System.out.println("Introduce tu mes de nacimiento:");
            Mes = sc.nextInt();

            if (Mes < 1 || Mes > 12) {
                System.out.println("Mes inválido. Inténtalo de nuevo.");
            }

        } while (Mes < 1 || Mes > 12);

        do {
            System.out.println("Introduce tu año de nacimiento:");
            Año = sc.nextInt();

            if (Año < 1 || Año > 2025) {
                System.out.println("Año inválido. Inténtalo de nuevo.");
            }

        } while (Año < 1 || Año > 2025);

        // Hacemos 3 bucles, básicamente para que si ponen mal el número, que se repita
        // lo de pedir el número hasta que esté bien

        int SumaTotal = Dia + Mes + Año;

        int Contador1000 = 0;
        int Contador100 = 0;
        int Contador10 = 0;
        int Contador1 = 0;

        // Creamos variables de cada uno (unidades de milar, centenas, decenas,
        // unidades)

        while (SumaTotal >= 1000) {
            SumaTotal = SumaTotal - 1000;
            Contador1000++;
        }

        while (SumaTotal >= 100) {
            SumaTotal = SumaTotal - 100;
            Contador100++;
        }

        while (SumaTotal >= 10) {
            SumaTotal = SumaTotal - 10;
            Contador10++;
        }

        while (SumaTotal >= 1) {
            SumaTotal = SumaTotal - 1;
            Contador1++;
        }

        // Es como un contador, se le resta el valor posicional y se le suma a un
        // contador (7000 se le resta 7 veces 1000 y se suma a las unidades de millar)

        int Total = Contador1000 + Contador100 + Contador10 + Contador1;

        // Se suma todos los contadores

        System.out.println("Tu número de la suerte es " + Total);

        sc.close();
    }
}
