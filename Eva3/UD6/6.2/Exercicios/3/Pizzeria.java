public class Pizzeria implements Restaurante {

    private double prezoPizza;

    public Pizzeria(double prezoPizza) {
        this.prezoPizza = prezoPizza;
    }

    public double getPrezoPizza() {
        return prezoPizza;
    }

    public void setPrezoPizza(double prezoPizza) {
        this.prezoPizza = prezoPizza;
    }

    // Es necesario utilizar los métodos de la interfaz

    @Override
    public void prepararPedido(String pedido) {

        System.out.println("Preparando " + pedido + " de Pizzería.");

    }

    @Override
    public double calcularPrezo(String pedido) {

        if (pedido.toLowerCase().contains("grande")) {

            return prezoPizza += 1;

        }

        else if (pedido.toLowerCase().contains("extra")) {

            return prezoPizza += 1;
        }

        return prezoPizza;

    }

}
