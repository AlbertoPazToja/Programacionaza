public class EmpregadoApp {

    public static void main(String[] args) {

        Empregado.setSalario(1000);
        Empregado.aumentarBase(10);

        // Introducimos el salario base y el porcentaje para aumentarlo

        Empregado Jorge = new Empregado();

        Jorge.aumentarAntigüedad("Jorge", 15);

        Empregado Charlie = new Empregado();

        Charlie.aumentarAntigüedad("Charlie", 5);

    }

}
