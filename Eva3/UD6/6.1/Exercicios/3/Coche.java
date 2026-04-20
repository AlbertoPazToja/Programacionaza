public class Coche extends Vehiculo {

    private int numeroPortas;

    public Coche(String marca, int anoFabricacion, int numeroPortas) {
        super(marca, anoFabricacion);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void mostrarCoche() {

        System.out.println("La marca del coche es " + getMarca() + " , el año de fabricación es " + getAnoFabricacion()
                + " y el número de puertas es " + numeroPortas);
    }

}
