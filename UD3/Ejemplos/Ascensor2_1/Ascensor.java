package Ejemplos.Ascensor2_1;

public class Ascensor { // Creamos la clase Ascensor

    private int piso;
    private int limite;
    // Creamos los atributos de la clase, privados

    public Ascensor(int piso, int limite) {
        this.piso = piso;
        this.limite = limite;
    }

    public void setPiso(int piso) {

        this.piso = piso;
    }

    public int getPiso() {

        return piso;
    }

    public void setLimite(int limite) {

        this.limite = limite;
    }

    public int getLimite() {

        return limite;
    }

    // Creamos los sets y gets de los atributos, ya que son privados

    public void subir(int pisos) {
        int contador = 0;

        do {

            this.piso = this.piso + 1;
            System.out.println("Has subido al piso " + this.piso);
            contador++;

        }

        while (limite > piso && contador < pisos);

    }

    // Creamos el método subir, en el que dentro creamos un contador. El piso va
    // sumando uno y a la vez sumando el contador, y se va sumando hasta que el
    // contador sea igual (no puse menor o igual porque en do while primero se hace
    // el bucle y luego se comprueba, así que hace uno de más) que el numero de
    // pisos introducido que se quiere subir.

    public void bajar(int pisos) {
        int contador = 0;

        do {

            this.piso = this.piso - 1;
            System.out.println("Has bajado al piso " + this.piso);
            contador++;

        }

        while (piso > 0 && contador < pisos);

    }

    // Lo mismo que lo de subir

    public int situacion() {

        System.out.println("Estás en el piso " + this.piso);
        if (this.piso <= 0) {

            System.out.println("No puedes bajar más");
        }

        if (this.piso >= limite) {

            System.out.println("No puedes subir más");
        }

        return this.piso;

    }

    // Se indica el piso en el que está actualmente, y si está en el límite en el 0,
    // se indica que no se puede subir / bajar más

}
