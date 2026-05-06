public class ClausulaTryCatch {

    public static void validarNotaBasesDatos(int notaBasesDeDatos) {

        try {

            if (notaBasesDeDatos < 10) {

                throw new DerivadaException("No has sacado un 10 en mi examen de Bases de Datos, estás suspenso");

            }

            System.out.println("Has sacado un 10 pero porque te lo he regalado yo");
        }

        catch (DerivadaException e) {

            System.out.println("Excepción de DerivadaException");
            System.out.println("Mensaje: " + e.getValor());

        }
    }

    public static void main(String[] args) {

        validarNotaBasesDatos(10);
    }

}
