package Exemplos;

import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numerito: ");
        int valor = sc.nextInt();
        char car = (char) valor;
        System.out.println("Valor unicode " + valor);
        System.out.println("Representacion " + car);

        sc.close();
    }

}
