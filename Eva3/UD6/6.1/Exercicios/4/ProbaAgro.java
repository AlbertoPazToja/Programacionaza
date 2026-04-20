public class ProbaAgro {

    public static void main(String[] args) {

        ProdutoFresco f1 = new ProdutoFresco("20/04/2026", 61237, "19/04/2026", "Cataluña");
        ProdutoRefrixerado r1 = new ProdutoRefrixerado("20/04/2030", 1, 123);
        ProdutoConxelado c1 = new ProdutoConxelado("31/02/2090", 54321, -70);

        System.out.println("Producto fresco: ");
        f1.mostrarInfo();

        System.out.println("\n Producto refrixerado: ");
        r1.mostrarInfo();

        System.out.println("\n Producto conxelado ");
        c1.mostrarInfo();
    }

}
