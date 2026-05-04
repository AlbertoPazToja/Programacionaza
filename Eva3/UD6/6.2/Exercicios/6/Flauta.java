public class Flauta extends Instrumento {

    public Flauta(String nome, String familia) {
        super(nome, familia);
    }

    public Flauta() {
    }

    @Override
    public void tocar() {

        System.out.println("Fiu fiu");
    }

    public void limpar() {

        System.out.println("Flauta limpa");
    }

}
