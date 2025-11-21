package Ejemplos.Cuenta_Bancaria;

public class AppConta {

    public static void main(String[] args) {
        // Hacemos un main para poder ejecutar

        Conta c = new Conta();
        // Creamos el objeto c a partir de la clase Conta

        c.idConta = 1;
        c.titular = "Alberto";
        c.saldo = 6.70;
        // Le asignamos valores a los atributos del objeto c

        System.out.println(c.idConta);
        System.out.println(c.titular);
        System.out.println(c.saldo);
        // Mostramos los valores por pantalla

        Conta c1 = new Conta(02, "Jorge", 20000);

        System.out.println(c1.idConta);
        System.out.println(c1.titular);
        System.out.println(c1.saldo);

    }
}