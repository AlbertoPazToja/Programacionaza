public class ProdutoRefrixerado extends Produtos {

    private int codigoOrganismo;

    public ProdutoRefrixerado(String dataCaducidade, int numeroLote, int codigoOrganismo) {
        super(dataCaducidade, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public ProdutoRefrixerado() {
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("y el código del organismo de supervisión alimentaria es " + codigoOrganismo);
    }

}
