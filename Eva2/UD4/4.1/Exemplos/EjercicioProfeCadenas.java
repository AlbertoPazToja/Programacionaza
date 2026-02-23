package Exemplos;
// Leer 2 cadenas por teclado, que las concatene de las 2 maneras que vimos, que calcule la longitud de la cadena concatenada y que muestre para cada posición el caracter asigna

import java.util.Scanner;

public class EjercicioProfeCadenas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce una segunda cadena");
        String cadena2 = sc.nextLine();

        String cadenaConcat = cadena1 + cadena2;

        System.out.println("Método 1: " + cadenaConcat);

        System.out.println("Método 2: " + cadena1.concat(cadena2));

        int longitud = cadenaConcat.length();

        System.out.println("La cadena concatenada tiene " + longitud + " caracteres");

        int contador = 0;

        do {

            System.out.println("Caracter número " + contador + ": " + cadenaConcat.charAt(contador));

            contador++;
        }

        while (contador < longitud);

        System.out.println("Parte 2 ------------------------------------------------------");

        String cadenavacia = "";

        System.out.println("¿Está vacía la cadena? " + cadenavacia.isEmpty());

        System.out.println("¿Son iguales?: " + cadena1.equals(cadena2));
        System.out.println("¿Son iguales? Ignorando mayúsculas: " + cadena1.equalsIgnoreCase(cadena2));
        System.out.println("¿Es mayor lexicográficamente?: " + cadena1.compareTo(cadena2));
        // Mira si la primera letra es la misma, para ordenarlos por orden alfabetico (a
        // es 1, va antes que c que es 3)
        System.out
                .println("¿Es mayor lexicográficamente? Ignorando mayúsculas: " + cadena1.compareToIgnoreCase(cadena2));

        System.out.println("Parte 3 ------------------------------------------------------");

        System.out.println("La cadena se convierte a mayúsculas: " + cadena1.toUpperCase());
        System.out.println("La cadena se convierte a minúsculas: " + cadena1.toLowerCase());

        System.out.println("Se cambian las 'a' por 'o': " + cadena1.replace('a', 'o'));

        String primitivo = "67";

        int n = Integer.parseInt(primitivo);

        System.out.println("Paso de String a int (primitivo): " + n);

        System.out.println("Parte 4 -------------------------------------------------------");

        System.out.println("El caracter en la posición 3 es: " + cadena1.charAt(3));
        System.out.println("El valor de ese caracter en unicode es: " + cadena1.codePointAt(3));

        System.out.println("Busca la posición de 'hola' en la cadena: " + cadena1.indexOf("hola"));

        if (cadena1.contains("hola")) {

            System.out.println("'hola' SI está en la cadena");

        }

        else {

            System.out.println("'hola' NO está en la cadena");
        }

        if (cadena1.startsWith("h")) {

            System.out.println("Esta cadena SI empieza por 'h'");
        }

        else {

            System.out.println("Esta cadena NO empieza por 'h'");
        }

        if (cadena1.endsWith("tal")) {

            System.out.println("Esta cadena SI termina por 'tal'");

        }

        else {

            System.out.println("Esta cadena NO termina por 'tal'");
        }

        System.out.println("Parte 4 ---------------------------------------------------------");

        String izaskun = " Ola mundo ";
        System.out.println("'" + izaskun.trim() + "'"); // 'Ola mundo'
        System.out.println(izaskun.trim().substring(4)); // "mundo"
        System.out.println(izaskun.trim().substring(0, 3)); // "Ola"

        sc.close();

    }

}
