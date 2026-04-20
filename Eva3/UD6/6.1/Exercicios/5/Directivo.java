public class Directivo extends Empregado {

    public Directivo(String nome) {
        super(nome);
    }

    @Override
    public String toString() {

        return super.toString() + " -> Directivo";
    }

}
