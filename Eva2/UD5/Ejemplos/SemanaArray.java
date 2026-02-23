package Eva2.UD5.Ejemplos;

public class SemanaArray {

    public static void main(String[] args) {

        String[] semana = new String[7];

        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miércoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sábado";
        semana[6] = "Domingo";

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        // "for" mejorado

        System.out.println("\"for\" mejorado:");

        for (String valorDias : semana) {

            System.out.print(valorDias + " ");
        }

        System.out.println("");

        for (String valorMeses : meses) {

            System.out.print(valorMeses + " ");
        }

        System.out.println("\n-------------------------------------------------------------------");

        // "for normal"

        System.out.println("\"for\" normal:");

        for (int i = 0; i < semana.length; i++) {

            System.out.print(semana[i] + " ");

        }

        System.out.println("");

        for (int j = 0; j < meses.length; j++) {

            System.out.print(meses[j] + " ");
        }

        System.out.println("\n---------------------------------------------------------------");

        System.out.println("Cambiar a mayúsculas:");

        for (String valorMeses : meses) {

            valorMeses = valorMeses.toUpperCase();

        }

        for (String valorMeses : meses) {

            System.out.print(valorMeses + " ");
        }

        // El de arriba no ha cambiado a mayúsculas

        for (int j = 0; j < meses.length; j++) {

            meses[j] = meses[j].toUpperCase();

        }

        System.out.println("");

        for (int j = 0; j < meses.length; j++) {

            System.out.print(meses[j] + " ");
        }

        // Éste ha cambiado a mayúsculas

    }
}