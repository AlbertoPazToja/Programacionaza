public class Producto {

    private String nome;
    private double prezo;
    private int cantidade;

    public Producto(String nome, double prezo, int cantidade) {
        this.nome = nome;
        this.prezo = prezo;
        this.cantidade = cantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    @Override
    public String toString() {

        return cantidade + " unidades de " + nome + ", con un precio de " + prezo + " euros.";
    }

}
