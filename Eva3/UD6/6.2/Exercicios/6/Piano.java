public class Piano extends Instrumento {

    public Piano(String nome, String familia) {
        super(nome, familia);
    }

    public Piano() {
    }

    @Override
    public void tocar() {

        System.out.println("Plink plonk");
    }

    public void abrirTapa() {

        System.out.println("Tapa do piano aberta");
    }

}
