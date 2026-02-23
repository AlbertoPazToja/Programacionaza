package PrácticaExamen.Garaxe;

public class Garaxe {

    private int plazasTotales;
    private int plazasOcupadas;

    public Garaxe() {
    }

    public Garaxe(int plazasTotales, int plazasOcupadas) {

        this.plazasTotales = plazasTotales;
        this.plazasOcupadas = plazasOcupadas;
    }

    public void setPlazasDisponibles(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void entrar() {

        if (plazasOcupadas < plazasTotales) {

            plazasOcupadas = plazasOcupadas + 1;
            System.out.println("Ha entrado un coche al garaje. Ahora hay " + plazasOcupadas + "coches");

        }

        else {

            System.out.println("No caben más coches");
        }
    }

    public void salir() {

        if (this.plazasOcupadas > 0) {

            this.plazasOcupadas = this.plazasOcupadas - 1;
            System.out.println("Ha salido un coche, quedan " + plazasOcupadas + " coches");

        }

        else {

            System.out.println("No pueden salir más coches porque no quedan más");
        }
    }

}
