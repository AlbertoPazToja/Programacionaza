import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEnteiros {

    public static void main(String[] args) {

        ArrayList<Integer> enteros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int menu = 0;

        while (menu != 5) {

            System.out.println("1- Engadir números ao array");
            System.out.println("2- Mostrar o array");
            System.out.println("3- Borrar por posición");
            System.out.println("4- Borrar por valor");
            System.out.println("5- Salir");
            System.out.println("");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Qué número quieres anhadir?");

                    Integer a = sc.nextInt();

                    enteros.add(a);

                    break;

                case 2:
                    Iterator<Integer> it1 = enteros.iterator();

                    System.out.println("El array contiene:");
                    while (it1.hasNext()) {

                        Integer valor = it1.next();

                        System.out.println(valor);
                    }

                    break;

                case 3:
                    Iterator<Integer> it2 = enteros.iterator();

                    System.out.println("Qué posición quieres borrar?");
                    int posicion = sc.nextInt();

                    int contador = 0;

                    while (it2.hasNext()) {

                        contador = it2.next();

                        if (posicion == contador) {

                            it2.remove();

                        }

                    }

                default:
                    break;
            }
        }

    }

}