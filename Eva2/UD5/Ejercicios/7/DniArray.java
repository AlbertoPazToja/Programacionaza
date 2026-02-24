import java.util.Scanner;

public class DniArray {

    public static boolean numeroDNI(char letra, int numero) {

        char[] listaLetrasDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E' };

        int resultado = numero % 23;

        // La letra de tu dni se calcula dividiendo el número del dni entre 23, y se
        // coge el resto, que es un número entre 1 y 22, y ese número es la posición de
        // la letra en una lista de letras, como el array de arriba

        if (letra == listaLetrasDNI[resultado]) {

            return true;
        }

        else
            return false;

        // Si la letra introducida no coincide con la letra en la posición que debería
        // estar tras hacer la operación con el número del dni, devuelve false, si
        // coincide da true
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los números de tu DNI");
        int numeroDNI = sc.nextInt();

        System.out.println("Introduce la letra de tu DNI (en mayúscula)");
        char letraDNI = sc.next().charAt(0);

        System.out.println(numeroDNI(letraDNI, numeroDNI));

        sc.close();

    }

}
