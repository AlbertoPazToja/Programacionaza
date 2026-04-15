import java.util.ArrayList;

public class Receita {

    private String nome;

    ArrayList<Ingredientes> ingredientesReceta = new ArrayList<>();

    public Receita(String nome, ArrayList<Ingredientes> ingredientesReceta) {
        this.nome = nome;
        this.ingredientesReceta = ingredientesReceta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingredientes> getIngredientesReceta() {
        return ingredientesReceta;
    }

    public void setIngredientesReceta(ArrayList<Ingredientes> ingredientesReceta) {
        this.ingredientesReceta = ingredientesReceta;
    }

    public static void main(String[] args) {

        Ingredientes i1Tortilla = new Ingredientes("Patatas", 200, "gramos");
        Ingredientes i2Tortilla = new Ingredientes("Huevos", 2, "unidades");

        ArrayList<Ingredientes> ingredientesTortilla = new ArrayList<>();
        ingredientesTortilla.add(i1Tortilla);
        ingredientesTortilla.add(i2Tortilla);

        Receita tortilla = new Receita("Tortilla de patatas", ingredientesTortilla);

        System.out.println("Receta para " + tortilla.nome + ", ingredientes: ");

        for (Ingredientes ingredienteActual : ingredientesTortilla) {

            System.out.println(ingredienteActual.getCantidade() + " " + ingredienteActual.getUnidade() + " de "
                    + ingredienteActual.getNome());

        }

    }

}