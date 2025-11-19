package Tareas1.EjerciciosProfe;

import java.util.Scanner;

public class ProfeEjercicio2_2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe 6 números:");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int numero3 = sc.nextInt();
    int numero4 = sc.nextInt();
    int numero5 = sc.nextInt();
    int numero6 = sc.nextInt();

    int menor = 0;
    menor = numero1;

    if (numero2 < menor) {
      menor = numero2;
    }

    if (numero3 < menor) {
      menor = numero3;
    }

    if (numero4 < menor) {
      menor = numero4;
    }

    if (numero5 < menor) {
      menor = numero5;
    }

    if (numero6 < menor) {
      menor = numero6;
    }

    System.out.println("El número más pequeño es: " + menor);

    int mayor = 0;
    mayor = numero1;

    if (numero2 > mayor) {
      mayor = numero2;
    }

    if (numero3 > mayor) {
      mayor = numero3;
    }

    if (numero4 > mayor) {
      mayor = numero4;
    }

    if (numero5 > mayor) {
      mayor = numero5;
    }

    if (numero6 > mayor) {
      mayor = numero6;
    }

    System.out.println("El número más grande es: " + mayor);

    sc.close();
  }

}
