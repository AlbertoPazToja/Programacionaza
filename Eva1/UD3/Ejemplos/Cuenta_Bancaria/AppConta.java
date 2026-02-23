package Ejemplos.Cuenta_Bancaria;

public class AppConta {

    public static void main(String[] args) {
        // Hacemos un main para poder ejecutar

        /* Conta c = new Conta(); */
        // Creamos el objeto c a partir de la clase Conta

        /*
         * c.idConta = 01;
         * c.titular = "Alberto";
         * c.saldo = 6.70;
         */
        // Le asignamos valores a los atributos del objeto c

        /*
         * System.out.println(c.idConta);
         * System.out.println(c.titular);
         * System.out.println(c.saldo);
         */
        // Mostramos los valores por pantalla

        /*
         * Conta c1 = new Conta(02, "Jorge", 20000);
         * 
         * System.out.println(c1.idConta);
         * System.out.println(c1.titular);
         * System.out.println(c1.saldo);
         */

        /*
         * Conta c2 = new Conta();
         * 
         * c2.idConta = 03;
         * c2.titular = "Catalina";
         * c2.saldo = 1000000;
         * 
         * System.out.println(c2.idConta);
         * System.out.println(c2.titular);
         * System.out.println(c2.saldo);
         * 
         * }
         */

        Conta c3 = new Conta();

        c3.setIdConta(04);
        c3.setTitular("Paraninfo");
        c3.setSaldo(19.99);

        System.out.println(c3.getIdConta());
        System.out.println(c3.getTitular());

        System.out.println("-------------------------------------");

        c3.movemento(true, 20, "Libro Economía");

        System.out.println(c3.getConceptoUltimoMovimiento());

        System.out.println("-------------------------------------");

        c3.mostrarInformacion();

    }
}