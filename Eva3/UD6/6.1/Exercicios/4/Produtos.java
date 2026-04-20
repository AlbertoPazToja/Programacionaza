public class Produtos {

    private String dataCaducidade;
    private int numeroLote;

    public Produtos(String dataCaducidade, int numeroLote) {
        this.dataCaducidade = dataCaducidade;
        this.numeroLote = numeroLote;
    }

    public Produtos() {
    }

    public String getDataCaducidade() {
        return dataCaducidade;
    }

    public void setDataCaducidade(String dataCaducidade) {
        this.dataCaducidade = dataCaducidade;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void mostrarInfo() {

        System.out.println("La fecha de caducidad es " + dataCaducidade + ", el número de lote es " + numeroLote);
    }

}
