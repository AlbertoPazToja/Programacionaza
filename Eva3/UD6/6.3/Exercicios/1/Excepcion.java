public class Excepcion {

    public static void main(String[] args) {

        try {

            throw new Exception("Hola soy una excepción");

        } catch (Exception e) {

            System.out.println("Produciuse unha excepción. " + e.getMessage());

        } finally {
            System.out.println("Yo siempre me ejecuto me la suda");
        }
    }
}
