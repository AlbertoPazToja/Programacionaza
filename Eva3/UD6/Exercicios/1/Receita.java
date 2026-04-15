import java.util.ArrayList; // Importamos la clase ArrayList para poder usar listas dinámicas

public class Receita {

    // Atributos de la clase
    private String nome;
    // Lista que almacenará objetos de tipo 'Ingredientes'
    ArrayList<Ingredientes> ingredientesReceta = new ArrayList<>();

    // Constructor: Se encarga de inicializar el objeto cuando haces un "new
    // Receita"
    public Receita(String nome, ArrayList<Ingredientes> ingredientesReceta) {
        this.nome = nome;
        this.ingredientesReceta = ingredientesReceta;
    }

    // Métodos Getter y Setter: Permiten leer y modificar los atributos privados
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

        // 1. Creamos instancias (objetos) de la clase Ingredientes
        Ingredientes i1Tortilla = new Ingredientes("Patatas", 200, "gramos");
        Ingredientes i2Tortilla = new Ingredientes("Huevos", 2, "unidades");

        // 2. Creamos una lista temporal para agrupar esos ingredientes
        ArrayList<Ingredientes> ingredientesTortilla = new ArrayList<>();
        ingredientesTortilla.add(i1Tortilla); // Añadimos patatas
        ingredientesTortilla.add(i2Tortilla); // Añadimos huevos

        // 3. Creamos el objeto principal 'Receita' pasándole el nombre y la lista
        // anterior
        Receita tortilla = new Receita("Tortilla de patatas", ingredientesTortilla);

        // 4. Imprimimos el nombre de la receta
        // Nota: tortilla.nome funciona aquí porque el main está dentro de la misma
        // clase
        System.out.println("Receta para " + tortilla.nome + ", ingredientes: ");

        // 5. Bucle "for-each": recorre cada objeto 'Ingredientes' dentro de la lista
        for (Ingredientes ingredienteActual : ingredientesTortilla) {

            // Accedemos a los datos de cada ingrediente mediante sus métodos get
            System.out.println(ingredienteActual.getCantidade() + " " + ingredienteActual.getUnidade() + " de "
                    + ingredienteActual.getNome());
        }
    }
}