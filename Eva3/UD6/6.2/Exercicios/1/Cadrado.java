public class Cadrado extends Forma {

    private double lado;

    public Cadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        double area = lado * lado;

        return area;
    }

}
