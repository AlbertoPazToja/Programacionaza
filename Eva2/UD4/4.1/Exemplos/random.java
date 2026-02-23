package Exemplos;

import java.util.Random;

public class random {

    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        for (int i = 0; i < 9; i++) {
            System.out.println(numeroAleatorio.nextInt());
        }

    }
}
