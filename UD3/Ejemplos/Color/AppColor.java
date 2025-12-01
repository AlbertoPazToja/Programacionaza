package Ejemplos.Color;

public class AppColor {

    public static void main(String[] args) {

        Color a = new Color(100, 0.5, -5);

        // Creamos un objeto de nombre a de la clase Color, y le asignamos la los datos
        // a los atributos

        a.amosarInformacion();

        // Imprimimos los datos asignados, comprobando si son menor que 0 o mayor que 1

        System.out.println("------------------------");

        a.gris();

        // Tras aplicar el método gris, todos los atributos tienen el mismo valor, su
        // media

        a.amosarInformacion();

        System.out.println("------------------------");

        a.filtro(1, 0, 0);

        a.amosarInformacion();

    }

}
