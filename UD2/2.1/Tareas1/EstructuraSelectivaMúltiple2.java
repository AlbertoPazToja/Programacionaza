package Tareas1;

import java.util.Scanner;

public class EstructuraSelectivaMúltiple2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int Dia;

    System.out.println("Introduce el número de un día de la semana");
    Dia = sc.nextInt();

    switch (Dia) {

      case 1:

        System.out.println("El día de la semana es Lunes");

        break;

      case 2:

        System.out.println("El día de la semana es Martes");

        break;

      case 3:

        System.out.println("El día de la semana es Miércoles");

        break;

      case 4:

        System.out.println("El día de la semana es Jueves");

        break;

      case 5:

        System.out.println("El día de la semana es Viernes");

        break;

      case 6:

        System.out.println("El día de la semana es Sábado");

        break;

      case 7:

        System.out.println("El día de la semana es Domingo");

        break;

      default:

        System.out.println("El día de la semana no existe");

        break;

    }

    sc.close();
  }

}
