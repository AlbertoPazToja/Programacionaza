public class Empregado {

    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public Empregado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado " + nome;
    }

}
