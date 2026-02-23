package Paquete_Prueba;

import Paquetes_Principales.*;

public class Prueba2 {

    public static void main(String[] args) {
        AccesoPaquete a2 = new AccesoPaquete();

        // System.out.println(a2.atrib1); No funciona porque es privado
        // System.out.println(a2.atrib2); No funciona, tiene que ser público, solo
        // funciona si están en la misma carpeta
        System.out.println(a2.atrib3);
    }

}
