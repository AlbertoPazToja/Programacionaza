public class Ingredientes {

    private String nome;
    private int cantidade;
    private String unidade;

    public Ingredientes(String nome, int cantidade, String unidade) {
        this.nome = nome;
        this.cantidade = cantidade;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

}
