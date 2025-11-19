public class orden {
    public static void main(String[] args) {

        int dato = 2;

        int a = (++dato) + dato;

        System.out.println("Valor de 'a': " + a);
        System.out.println("Valor de dato: " + dato);
        System.out.println("--------------------");

        dato = 2;

        int b = dato + (dato++);

        System.out.println("Valor de 'b': " + b);
        System.out.println("Valor de dato: " + dato);
        System.out.println("--------------------");

        dato = 2;

        boolean c = (dato>2) && (dato++<10);

        System.out.println("Valor de 'c': " + c);
        System.out.println("Valor de dato: " + dato);
        System.out.println("--------------------");

        dato = 2;

        boolean d = (dato>2) || (dato++<10);

        System.out.println("Valor de 'd': " + d);
        System.out.println("Valor de dato: " + dato);
        System.out.println("--------------------");

        dato = 2;

        boolean e = !(dato++<2);

        System.out.println("Valor de 'e': " + e);
        System.out.println("Valor de dato: " + dato);
        System.out.println("--------------------");

    }

}
