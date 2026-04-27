public class Hamburgueseria implements Restaurante {

    private double prezoHamburguesa;

    public Hamburgueseria(double prezoHamburguesa) {
        this.prezoHamburguesa = prezoHamburguesa;
    }

    public double getPrezoHamburguesa() {
        return prezoHamburguesa;
    }

    public void setPrezoHamburguesa(double prezoHamburguesa) {
        this.prezoHamburguesa = prezoHamburguesa;
    }

    // Es necesario utilizar los métodos de la interfaz
    @Override
    public void prepararPedido(String pedido) {

        System.out.println("Preparando " + pedido + " de Hamburguesería.");

    }

    @Override
    public double calcularPrezo(String pedido) {

        if (pedido.toLowerCase().contains("doble")) {

            return prezoHamburguesa += 0.5;

        }

        else if (pedido.toLowerCase().contains("queso")) {

            return prezoHamburguesa += 0.5;

        }

        return prezoHamburguesa;

    }

}
