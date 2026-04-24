public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar(int intensidade) {

        System.out.println("El coche está acelerando " + intensidade + " kilómetros/hora");

    }

    @Override
    public void frear(int intensidade) {

        System.out.println("El coche está frenando " + intensidade + " kilómetros/hora");

    }

}
