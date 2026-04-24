public class Avion extends Vehiculo {

    private int numMotores;

    public Avion(String marca, String modelo, int velocidadMaxima, int numMotores) {
        super(marca, modelo, velocidadMaxima);
        this.numMotores = numMotores;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    @Override
    public void acelerar(int intensidade) {

        System.out.println("El avión está acelerando " + intensidade + " kilómetros/hora");

    }

    @Override
    public void frear(int intensidade) {

        System.out.println("El avión está frenando " + intensidade + " kilómetros/hora");
    }

    public void voar() {

        System.out.println("Son unha avioneta, mira coma voo");
    }

}
