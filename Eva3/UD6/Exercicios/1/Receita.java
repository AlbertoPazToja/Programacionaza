import java.util.ArrayList;

public class Receita {

    ArrayList<Ingredientes> receita = new ArrayList<>();

    public Receita() {

    }

    public Receita(ArrayList<Ingredientes> receita) {
        this.receita = receita;
    }

    public void setReceita(ArrayList<Ingredientes> receita) {
        this.receita = receita;
    }

    public ArrayList<Ingredientes> getReceita() {
        return receita;
    }

}