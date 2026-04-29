package PolimorfismoExemplo.LigaduraDinámicaExemplo;

import java.util.Scanner;

class Vehiculo {
    void mover() {
        System.out.println("O vehículo está a moverse");
    }
}

class Coche extends Vehiculo {
    @Override
    void mover() {
        System.out.println("O coche está a conducir na estrada");
    }
}

class Barco extends Vehiculo {
    @Override
    void mover() {
        System.out.println("O barco está a navegar no mar");
    }
}

class Avion extends Vehiculo {
    @Override
    void mover() {
        System.out.println("O avión está a voar nos ceos");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que vehículo quieres elegir? Coche (C), Barco (B), Avión (A)");

        String opcion = sc.nextLine();

        Vehiculo v1;

        if (opcion.toLowerCase().equals("c")) {

            v1 = new Coche();
        }

        else if (opcion.toLowerCase().equals("b")) {

            v1 = new Barco();
        }

        else if (opcion.toLowerCase().equals("a")) {

            v1 = new Avion();
        }

        else {

            v1 = new Vehiculo();
        }

        v1.mover();

        sc.close();

    }
}
