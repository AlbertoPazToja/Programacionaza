public class VehiculoAbstracto {

    public static void main(String[] args) {

        Coche c1 = new Coche("Seat", "Peregrina", 1000);
        Bichicletera b1 = new Bichicletera("Linux", "Fedora", 20, 1, true);
        Avion a1 = new Avion("Monbus", "911", 5000, 60);

        System.out.println("-- Coche --");
        c1.acelerar(100);
        c1.frear(1);
        c1.getVelocidadMaxima();

        System.out.println("\n-- Bicicleta --");
        b1.acelerar(2);
        b1.frear(1);
        b1.getVelocidadMaxima();
        b1.pedalear();

        System.out.println("\n-- Avión --");
        a1.acelerar(200);
        a1.frear(340);
        a1.getVelocidadMaxima();
        a1.voar();

    }

}
