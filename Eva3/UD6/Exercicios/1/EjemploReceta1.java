public class EjemploReceta1 {

    public static void main(String[] args) {

        Ingredientes i1 = new Ingredientes("Patatas", 200, "gramos");
        Ingredientes i2 = new Ingredientes("Huevos", 2, "unidades");
        Receita tortillaDePatatas = new Receita();

        System.out.println("Receta para hacer tortilla de patatas: " + tortillaDePatatas);

    }

}
