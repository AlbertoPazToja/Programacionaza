public class Cilindro {

    private double radio;
    private double altura;

    // Creamos los atributos de la clase, privados

    public static void area(double radio, double altura) {

        double A = 2 * Math.PI * radio * (radio + altura);
        System.out
                .println("El área del cilidro con " + radio + " de radio y " + altura + " de altura es igual a: " + A);

    }

    public static void volumen(double radio, double altura) {

        double V = Math.PI * (radio * radio) * altura;

        System.out.println(
                "El volumen del cilidro con " + radio + " de radio y " + altura + " de altura es igual a: " + V);

    }

    // Creamos dos métodos static, con los que no hace falta hacer this., y
    // calculamos el área y la altura

    public void area() {

        double A = 2 * Math.PI * this.radio * (this.radio + this.altura);

        System.out
                .println("El área del cilidro con " + radio + " de radio y " + altura + " de altura es igual a: " + A);

    }

    public void volumen() {

        double V = Math.PI * (this.radio * this.radio) * this.altura;

        System.out.println(
                "El volumen del cilidro con " + radio + " de radio y " + altura + " de altura es igual a: " + V);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    // Creamos dos métodos sin static, por lo que tenemos que poner this. antes de
    // cada atributo, y además tenemos que ponerle setters y getters para poder
    // llamarlos desde otra clase

}
