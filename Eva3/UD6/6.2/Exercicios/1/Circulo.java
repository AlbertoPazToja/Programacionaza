public class Circulo extends Forma {

    private double radio;

    public Circulo(double radio) {
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

        double area = (radio * radio) * Math.PI;

        return area;

    }

}
