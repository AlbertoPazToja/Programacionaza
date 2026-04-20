public class Froita {

    private String nome;

    public Froita(String nome) {
        this.nome = nome;
    }

    public void mostrarInfo() {

        System.out.println("Esta é unha froita chamada " + nome);
    }

    public final void comer() {

        System.out.println("Estás comendo froita");
    }
}