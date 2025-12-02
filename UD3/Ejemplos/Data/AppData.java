package Ejemplos.Data;

import Ejemplos.Data.Data.listademeses;

public class AppData {

    public static void main(String[] args) {

        Data a = new Data();

        a.setDia(23);
        a.setMes(listademeses.Abril);
        a.setAño(2006);

        System.out.println(a.getDia());
        System.out.println(a.getMes());
        System.out.println(a.getAño());

    }

}
