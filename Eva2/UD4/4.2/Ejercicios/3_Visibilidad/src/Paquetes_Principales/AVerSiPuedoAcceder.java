package Paquetes_Principales;

public class AVerSiPuedoAcceder {

    public static void main(String[] args) {

        AccesoPaquete a1 = new AccesoPaquete();

        // System.out.println(a1.atrib1); (Este no se puede porque es private)
        System.out.println(a1.atrib2);
        System.out.println(a1.atrib3);

    }
}
