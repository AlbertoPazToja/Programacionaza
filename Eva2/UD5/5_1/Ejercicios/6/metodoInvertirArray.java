public class metodoInvertirArray {

    public static void invertir(char[] letras) {

        char auxiliar = ' ';

        for (int i = 0; i < letras.length / 2; i++) {

            auxiliar = letras[i];
            letras[i] = letras[letras.length - i - 1];
            letras[letras.length - i - 1] = auxiliar;
        }

    }

    // Creamos un método invertir, en el que mete el primer valor del array en un
    // auxiliar, mete al último valor del array en el primer espacio y luego meto el
    // auxiliar en el último valor.

    // En el bucle sumamos 1 a i en cada vuelta, así que en vez de hacerlo con el
    // primero y el último lo hace con el primero + 1 (el segundo) y con el último -
    // 1 (el penúltimo)

    // Continúa el bucle hasta que i es igual a la mitad de la longitud. Para en la
    // mitad, ya que si no volvería a cambiar los que ya están cambiados y los
    // pondría como al principio

    public static void main(String[] args) {

        char[] letrillas = { 'a', 'B', 'c', 'd', 'E', 'F', 'G', 'h', 'I' };

        System.out.println("Array original: ");

        for (char valor : letrillas) {

            System.out.println(valor);
        }

        System.out.println("Array invertido: ");

        invertir(letrillas);

        for (char valor : letrillas) {

            System.out.println(valor);
        }

    }

}
