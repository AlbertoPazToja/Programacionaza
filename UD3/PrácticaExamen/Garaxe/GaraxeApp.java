package PrácticaExamen.Garaxe;

public class GaraxeApp {

    public static void main(String[] args) {

        Garaxe a1 = new Garaxe(40, 40);

        System.out.println("El número de plazas ocupadas es: " + a1.getPlazasOcupadas());
        System.out.println("El número de plazas totales es " + a1.getPlazasTotales());

        a1.entrar();
        a1.salir();

        System.out.println("El número de plazas ocupadas es: " + a1.getPlazasOcupadas());
        System.out.println("El número de plazas totales es " + a1.getPlazasTotales());

        a1.entrar();
        a1.salir();

    }

}
