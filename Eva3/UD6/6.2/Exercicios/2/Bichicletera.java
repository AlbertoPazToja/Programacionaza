public class Bichicletera extends Vehiculo {

    private int numMarchar;
    private boolean tenSuspension;

    public Bichicletera(String marca, String modelo, int velocidadMaxima, int numMarchar, boolean tenSuspension) {
        super(marca, modelo, velocidadMaxima);
        this.numMarchar = numMarchar;
        this.tenSuspension = tenSuspension;
    }

    public int getNumMarchar() {
        return numMarchar;
    }

    public void setNumMarchar(int numMarchar) {
        this.numMarchar = numMarchar;
    }

    public String getTenSuspension() {
        if (tenSuspension == true) {

            return "Sí, tiene suspensión";

        }

        else {

            return "No, no tiene suspensión";
        }
    }

    public void setTenSuspension(boolean tenSuspension) {
        this.tenSuspension = tenSuspension;
    }

    @Override
    public void acelerar(int intensidade) {

        System.out.println("La bicicleta ha acelerado " + intensidade + " kilómetros/hora");
    }

    @Override
    public void frear(int intensidade) {

        System.out.println("La bicicleta ha acelerado " + intensidade + " kilopetros/hora");

    }

    public void pedalear() {

        System.out.println("Estoy pedaleando y toda la paranoia");
    }

}
