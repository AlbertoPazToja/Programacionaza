public class PropagacionExcepcions {

    public static int dividir(int a, int b) throws IllegalArgumentException {

        if (b == 0) {

            throw new IllegalArgumentException("ERROR. No se puede dividir entre 0");
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {
            System.out.println("El resultado de dividir " + 2 + " entre " + 1 + " es: " + dividir(2, 1));

            System.out.println("El resultado de dividir " + 2 + " entre " + 0 + " es: " + dividir(2, 0));

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }

}
