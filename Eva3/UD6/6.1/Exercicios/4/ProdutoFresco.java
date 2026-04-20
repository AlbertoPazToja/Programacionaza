public class ProdutoFresco extends Produtos {

    private String dataEnvasado;
    private String paisOrixe;

    public ProdutoFresco(String dataCaducidade, int numeroLote, String dataEnvasado, String paisOrixe) {
        super(dataCaducidade, numeroLote);
        this.dataEnvasado = dataEnvasado;
        this.paisOrixe = paisOrixe;
    }

    public ProdutoFresco() {
    }

    public String getDataEnvasado() {
        return dataEnvasado;
    }

    public void setDataEnvasado(String dataEnvasado) {
        this.dataEnvasado = dataEnvasado;
    }

    public String getPaisOrixe() {
        return paisOrixe;
    }

    public void setPaisOrixe(String paisOrixe) {
        this.paisOrixe = paisOrixe;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out
                .println(", la fecha de envasado es " + dataEnvasado + " y el país de origen es " + paisOrixe);
    }

}
