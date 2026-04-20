public class ProdutoConxelado extends Produtos {

    private int temperaturaConxelación;

    public ProdutoConxelado(String dataCaducidade, int numeroLote, int temperaturaConxelación) {
        super(dataCaducidade, numeroLote);
        this.temperaturaConxelación = temperaturaConxelación;
    }

    public ProdutoConxelado() {
    }

    public int getTemperaturaConxelación() {
        return temperaturaConxelación;
    }

    public void setTemperaturaConxelación(int temperaturaConxelación) {
        this.temperaturaConxelación = temperaturaConxelación;
    }

    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("y la temperatura de congelación es " + temperaturaConxelación + " grados");
    }

}
