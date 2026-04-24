package ComparableEjemplo;

public class AppEstudante {
    public static void main(String[] args) {

        Estudante eva = new Estudante("Eva", 24);
        Estudante xan = new Estudante("Xan", 23);
        if (eva.compareTo(xan) > 0) {
            System.out.println("Eva é maior que Xan");
        }
    }
}
