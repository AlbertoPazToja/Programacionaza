public class Bateria extends Instrumento {

    public Bateria(String nome, String familia) {
        super(nome, familia);
    }

    public Bateria() {
    }

    @Override
    public void tocar() {

        System.out.println("Bang bang");
    }

    public void axustarTambores() {

        System.out.println("Tambores axustados");
    }

}
