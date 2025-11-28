package Ejemplos.Rectángulo;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {

        return (this.getBase() * this.getAltura());
    }

    public boolean esCuadrado() {

        if (this.base == this.altura) {

            return true;
        }

        else {

            return false;
        }
    }

    public String toString() {

        return ("Area = " + this.getArea() + " y la Altura = " + this.getAltura());
    }

}
