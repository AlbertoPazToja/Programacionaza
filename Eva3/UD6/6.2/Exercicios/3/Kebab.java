public class Kebab implements Restaurante {

    private double prezoKebab;

    public Kebab(double prezoKebab) {
        this.prezoKebab = prezoKebab;
    }

    public double getprezoKebab() {
        return prezoKebab;
    }

    public void setprezoKebab(double prezoKebab) {
        this.prezoKebab = prezoKebab;
    }

    // Es necesario utilizar los métodos de la interfaz
    @Override
    public void prepararPedido(String pedido) {

        System.out.println("Preparando " + pedido + " de Kebab.");

    }

    @Override
    public double calcularPrezo(String pedido) {

        if (pedido.toLowerCase().contains("extra")) {

            return prezoKebab += 1.5;

        }

        return prezoKebab;

    }

}
