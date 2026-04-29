// Implementamos la interfaz Comparable para cambiar el método compareTo y que al hacer
// Arrays.sort() los ordene según el parámetro que queramos, en este caso el area
public abstract class Figura implements Comparable<Figura> {

    private double area;
    private String cor;

    public Figura(double area, String cor) {
        this.area = area;
        this.cor = cor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    abstract double calcularArea();

    @Override
    public int compareTo(Figura obx) {

        Figura unaFigura = obx;
        if (this.area < unaFigura.area) {
            return -1;
        }

        if (this.area > unaFigura.area) {
            return 1;
        }

        return 0;

    }

}
