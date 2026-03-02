public class Estudante {

    private String nombre;
    private int edad;
    private double notaFinal;

    public Estudante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("\n");

    }

    public static void main(String[] args) {

        Estudante[] estudiante = new Estudante[3];

        estudiante[0] = new Estudante("Alberto", 19, 6.7);
        estudiante[1] = new Estudante("Jorge", 35, 0.0);
        estudiante[2] = new Estudante("Anxo", 13, 10.2);

        for (int i = 0; i < estudiante.length; i++) {

            System.out.println("Estudiante " + (i + 1) + ":");
            estudiante[i].mostrarInfo();

        }

    }
}
