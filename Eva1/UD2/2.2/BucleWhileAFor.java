import java.util.Scanner;

public class BucleWhileAFor {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número mayor que 1: ");
    int numero = sc.nextInt();

    for (int c = 1; c <= numero; c++) {

      System.out.println(c);
    }

    sc.close();
  }

}
