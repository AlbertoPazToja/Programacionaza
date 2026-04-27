public class ProbaRestaurante {

    public static void main(String[] args) {

        Pizzeria p1 = new Pizzeria(5);
        Pizzeria p2 = new Pizzeria(5);

        Hamburgueseria h1 = new Hamburgueseria(6);
        Hamburgueseria h2 = new Hamburgueseria(6);
        Hamburgueseria h3 = new Hamburgueseria(6);

        Kebab k1 = new Kebab(4);
        Kebab k2 = new Kebab(4);

        String pedido = "Margarita grande";
        p1.prepararPedido(pedido);
        System.out.println("El precio de es de " + p1.calcularPrezo(pedido));

        pedido = "Margarita pequecha";
        p2.prepararPedido(pedido);
        System.out.println("El precio de es de " + p2.calcularPrezo(pedido));

        System.out.println("---------------------------------");

        pedido = "Doble Queixo";
        h1.prepararPedido(pedido);
        System.out.println("El precio es de " + h1.calcularPrezo(pedido));

        pedido = "Doble sen lacteos";
        h2.prepararPedido(pedido);
        System.out.println("El precio es de " + h2.calcularPrezo(pedido));

        pedido = "Simple sen lacteos";
        h3.prepararPedido(pedido);
        System.out.println("El precio es de " + h3.calcularPrezo(pedido));

        System.out.println("---------------------------------");

        pedido = "Kebab Extra Carne";
        k1.prepararPedido(pedido);
        System.out.println("El precio es de " + k1.calcularPrezo(pedido));

        pedido = "Kebab sin Carne";
        k2.prepararPedido(pedido);
        System.out.println("El precio es de " + k2.calcularPrezo(pedido));

    }

}
