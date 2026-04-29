public class Circulo extends Figura {

    private double radio;

    public Circulo(double area, String cor, double radio) {
        super(area, cor);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return (Math.PI * Math.pow(this.getRadio(), 2));
    }

    @Override
    public String toString() {
        return "Un circulo de radio = " + radio + " tiene un area = " + getArea() + " y es de color " + getCor();
    }

}
