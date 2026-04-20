public final class Maza extends Froita {

    private String cor;

    public Maza(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" e a cor e " + cor);
    }

}
