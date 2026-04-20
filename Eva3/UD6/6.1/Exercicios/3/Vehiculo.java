public class Vehiculo {

    private String marca;
    private int anoFabricacion;

    public Vehiculo(String marca, int anoFabricacion) {
        this.marca = marca;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public void mostrarInfo() {

        System.out.println("La marca del vehículo es " + marca + " y el año de fabricación es " + anoFabricacion);
    }

}
