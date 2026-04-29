public class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo(double area, String cor, double altura, double base) {
        super(area, cor);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {

        return (this.getBase() * this.getAltura()) / 2;
    }

    @Override
    public String toString() {
        return "Un triangulo de altura = " + altura + " y de base=" + base + " tiene un area = " + getArea()
                + " y es de color " + getCor();
    }

}
