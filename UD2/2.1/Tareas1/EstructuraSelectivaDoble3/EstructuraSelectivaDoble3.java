package Tareas1.EstructuraSelectivaDoble3;

import java.util.Scanner; // Importamos el paquete java.util, para luego poder utilizar el Scanner

public class EstructuraSelectivaDoble3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner

        System.out.println("Introduce un año:");

        int numero = sc.nextInt();

        if (numero % 4 == 0) { // 1º Si al dividir el número del año entre 4, el resto es = 0 ...

            if (numero % 100 == 0) { // 2º ...  y al dividirlo por 100, el resto = 0 ...

                if (numero % 400 == 0) { // 3º ... y al dividirlo por 400 el resto = 0, imprime que el año SI es bisiesto

                    System.out.println("El año es bisiesto");
                }

                else { // 3º ... y al dividirlo por 400, el resto ≠ 0, imprime que el año NO es bisiesto
                    System.out.println("El año no es bisiesto");
                }
            }

            else { // 2º ... y al dividirlo por 100, el resto ≠ 0, imprime que el año SI es bisiesto

                System.out.println("El año es bisiesto");
            }
        }

        else { // 1º Si al dividir el número del año entre 4, el resto es ≠ 0, imprime que el año NO es bisiesto

            System.out.println("El año no es bisiesto");
        }
        
        sc.close(); // Cerramos el Scanner

    }

}
