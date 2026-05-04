public class Guitarra extends Instrumento {

    public Guitarra(String nome, String familia) {
        super(nome, familia);
    }

    public Guitarra() {
    }

    @Override
    public void tocar() {

        System.out.println("Strum strum");
    }

    public void afinarCorda(int corda) {

        System.out.println("Estoy afinando la cuerda número " + corda);
    }

}
