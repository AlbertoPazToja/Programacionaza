package Ejemplos.Data;

import Ejemplos.Data.Data.listademeses;

public class AppData {

    public static void main(String[] args) {

        Data a = new Data();

        a.setDia(14);
        a.setMes(listademeses.Mayo);
        a.setAño(2022);

        System.out.println(a.getDia());
        System.out.println(a.getMes());
        System.out.println(a.getAño());

        System.out.println("---------------------");

        if (a.isSummer() == true) {

            System.out.println("Es verano");

        }

        else {

            System.out.println("No es verano");
        }

        // Si el boolean devuelve un true, imprime que es verano, si no no

        System.out.println(a.toString());

    }

}
