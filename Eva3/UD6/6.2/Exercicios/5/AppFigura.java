import java.util.Arrays;

public class AppFigura {
    public static void main(String[] args) {

        Figura c1 = new Circulo(0, "rojo", 2);
        c1.setArea(c1.calcularArea());

        Figura c2 = new Circulo(0, "azul", 1.5);
        c2.setArea(c2.calcularArea());

        Figura c3 = new Circulo(0, "verde", 2.5);
        c3.setArea(c3.calcularArea());

        Figura s1 = new Cadrado(0, "rojo", 2);
        s1.setArea(s1.calcularArea());

        Figura s2 = new Cadrado(0, "azul", 1.5);
        s2.setArea(s2.calcularArea());

        Figura s3 = new Cadrado(0, "verde", 2.5);
        s3.setArea(s3.calcularArea());

        Figura t1 = new Triangulo(0, "rojo", 2, 2);
        t1.setArea(t1.calcularArea());

        Figura t2 = new Triangulo(0, "azul", 1.5, 1.5);
        t2.setArea(t2.calcularArea());

        Figura t3 = new Triangulo(0, "verde", 2.5, 2.5);
        t3.setArea(t3.calcularArea());

        // Creamos objetos de la interfaz figura, diciendo si son Cuadrado, Círculo o
        // Triángulo, y los metemos en un Array

        Figura[] figurillas = { c1, c2, c3, s1, s2, s3, t1, t2, t3 };

        Arrays.sort(figurillas);

        // Las ordenamos con el método Arrays.sort que Overrideamos en la clase Figura
        // en el método compareTo
        System.out.println("Figuras ordenadas de menor a mayor área: \n");
        for (Figura figuraActual : figurillas) {

            if (figuraActual.getArea() > 4.0) {

                figuraActual.setCor("negro");
            }

            System.out.println(figuraActual);
        }

    }
}
