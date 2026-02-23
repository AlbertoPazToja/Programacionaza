public class EjemploSentenciaSwitch {

  public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    int puntuación;
    System.out.print("Introduce a puntuación:");
    puntuación = scan.nextInt(); // Lemos a puntuación
    switch (puntuación) {
      case 5:
        System.out.println("APROBADO");
        break;
      case 6:
        System.out.println("BEN");
        break;
      case 7:
      case 8:
        System.out.println("NOTABLE");
        break;
      case 9:
      case 10:
        System.out.println("SOBRESAINTE");
        break;
      default:
        System.out.println("SUSPENSO");
    } // fin do switch

    scan.close();

  }

}
