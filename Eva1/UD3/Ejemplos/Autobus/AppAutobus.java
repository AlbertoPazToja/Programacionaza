package Ejemplos.Autobus;

public class AppAutobus {

    public static void main(String[] args) {

        Autobus busazo = new Autobus();

        busazo.setMatricula("9431FNF");
        busazo.setModelo("Audi");
        busazo.setColor("Amarillo");
        busazo.setNumAsientos(60);

        System.out.println(busazo.getMatricula());
        System.out.println(busazo.getModelo());
        System.out.println(busazo.getColor());
        System.out.println(busazo.getNumAsientos());

        busazo.arrancar();
        busazo.abrirPuertas();
        busazo.frenar();

        Autobus busdemiercoles = new Autobus("1234ABC", "Xiaomi", "Rojo", 3);

        System.out.println(busdemiercoles.getMatricula());
        System.out.println(busdemiercoles.getModelo());
        System.out.println(busdemiercoles.getColor());
        System.out.println(busdemiercoles.getNumAsientos());

        busdemiercoles.arrancar();
        busdemiercoles.abrirPuertas();
        busdemiercoles.frenar();

    }

}
