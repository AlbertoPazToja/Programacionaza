public class Operadores {

    public static void main(String[] args) {

        int numero = 10;
        numero++;

        System.out.println("Valor número = " + numero);

        numero = 10;

        int resultado = 5 * numero++;

        System.out.println("Primer resultado = " + resultado + "; Número = " + numero);

        numero = 10;

        resultado = 5 * ++numero;

        System.out.println("Segundo resultado = " + resultado + "; Número = " + numero);

    }

}
