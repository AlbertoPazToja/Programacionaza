public class Main {

    public static void main(String[] args) {

        Tenda Gadis = new Tenda();

        Gadis.anhadirProducto(new Producto("Grelo común", 0.20, 20));
        Gadis.anhadirProducto(new Producto("Grelo premium", 5, 2));
        Gadis.anhadirProducto(new Producto("Pataca", 0.67, 3));
        Gadis.anhadirProducto(new Producto("🐇 de Anxo", 0.03, 400));

        Gadis.amosarProductos();

        System.out.println("\n");

        Gadis.calcularStock();

    }

}
