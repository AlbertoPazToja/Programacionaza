package Tareas1.EstructuraSelectivaDoble3;


import java.util.Scanner; // Importamos el paquete java.util, para luego poder utilizar el Scanner

public class EstructuraSelectivaDoble3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un año:");

        int numero = sc.nextInt();

        if (numero % 4 == 0 && numero % 100 == 0 && numero % 400 == 0) { // Si al dividir el número del año entre 4, 100 y 400 el resto es = 0

            System.out.println("El año es bisiesto");

        }

        else if (numero % 4 == 0 && numero % 100 == 0 && numero % 400 != 0){ // Si al dividirlo entre 4 y 100 el resto es = 0 y al dividirlo entre 400 no
                    
            System.out.println("El año no es bisiesto");
         }
         
         
         else if (numero % 4 == 0 && numero % 100 != 0){

            System.out.println("El año es bisiesto");

        }


        else { // 1º Si al dividir el número del año entre 4, el resto es ≠ 0, imprime que el año NO es bisiesto

            System.out.println("El año no es bisiesto");
        }
        
        sc.close(); // Cerramos el Scanner

    }

}
