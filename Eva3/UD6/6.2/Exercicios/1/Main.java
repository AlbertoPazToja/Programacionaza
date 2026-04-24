public class Main {

    public static void main(String[] args) {

        Cadrado ca1 = new Cadrado(2.5);

        Circulo ci1 = new Circulo(3);

        System.out.println("El área de un cuadrado con una longitud de " + ca1.getLado() + " cm por lado es de: "
                + ca1.calcularArea());
        System.out.println("El área de un círculo con una radio de " + ci1.getRadio() + " cm es de: "
                + ci1.calcularArea());

    }

}
