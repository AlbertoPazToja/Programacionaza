package Ejemplos.Rectángulo;

public class PrincipalRectángulo {

    public static void main(String[] args) {

        Rectangulo a = new Rectangulo();

        a.setBase(2);
        a.setAltura(5);

        System.out.println("La base de a es: " + a.getBase());
        System.out.println("La altura de a es: " + a.getAltura());

        Rectangulo b = new Rectangulo(50.0, 50.0);

        System.out.println("------------------------------");

        System.out.println("La base de b es: " + b.getBase());
        System.out.println("La altura de b es: " + b.getAltura());

        System.out.println("------------------------------");

        System.out.println("El área del rectángulo a es: " + a.getArea());
        System.out.println("El área del rectángulo b es: " + b.getArea());

        System.out.println("------------------------------");

        System.out.println("¿Es el rectángulo a cuadrado?");
        if (a.esCuadrado() == true) {

            System.out.println("Sí");

        }

        else {

            System.out.println("No");
        }

        System.out.println("------------------------------");

        System.out.println("¿Es el rectángulo b cuadrado?");
        if (b.esCuadrado() == true) {

            System.out.println("Sí");

        }

        else {

            System.out.println("No");
        }

        System.out.println("------------------------------");

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------");

    }

}
