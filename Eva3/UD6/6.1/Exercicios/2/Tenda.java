import java.util.ArrayList;

public class Tenda {

    private ArrayList<Producto> productosDeLaTienda = new ArrayList<>();

    public Tenda() {

    }

    public ArrayList<Producto> getProductosDeLaTienda() {
        return productosDeLaTienda;
    }

    public void setProductosDeLaTienda(ArrayList<Producto> productosDeLaTienda) {
        this.productosDeLaTienda = productosDeLaTienda;
    }

    public void anhadirProducto(Producto a) {

        productosDeLaTienda.add(a);

    }

    public void amosarProductos() {

        for (Producto productoActual : productosDeLaTienda) {

            System.out.println(productoActual);
        }
    }

    double sumaTotal = 0;

    public void calcularStock() {

        for (Producto productoActual : productosDeLaTienda) {

            System.out.println(productoActual.getCantidade() + " unidades de " + productoActual.getNome()
                    + " con un valor cada uno de " + productoActual.getPrezo() + " euros es equivalente a un total de "
                    + productoActual.getCantidade() * productoActual.getPrezo() + " euros.");

            sumaTotal = sumaTotal + (productoActual.getPrezo() * productoActual.getCantidade());

        }

        System.out.println("El valor total del Stock es de " + sumaTotal + " euros.");
    }

}
