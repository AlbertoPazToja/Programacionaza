package Exemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComprobacionExpresionesRegulares {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("^abc.*");
        Matcher mat = pat.matcher("abc-proba");
        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }
        // Devolverá “Válido”

        String texto = "gato, gatonegro, gatillo";
        // Cambiamos só o primeiro que comeza por "gat"

        String resultado = texto.replaceFirst("gat\\w*", "can");
        System.out.println(resultado); // Saída: "can, gatonegro, gatillo// "

        String resultado3 = texto.replaceAll("gat\\w*", "can");
        System.out.println(resultado3); // Saída: "can, gatonegro, gatillo// "

        String texto2 = "2025-08-05";
        // Substituímos todos os guións por barras
        String resultado2 = texto2.replaceAll("-", "/");
        System.out.println(resultado2); // "2025/08/05"

    }
}
