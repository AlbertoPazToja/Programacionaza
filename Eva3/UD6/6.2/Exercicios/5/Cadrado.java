public class Cadrado extends Figura {

    private double lado;

    public Cadrado(double area, String cor, double lado) {
        super(area, cor);
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

        return this.getLado() * this.getLado();
    }

    @Override
    public String toString() {
        return "Un cadrado de lado = " + lado + " tiene un area = " + getArea() + " y es de color " + getCor();
    }

}
