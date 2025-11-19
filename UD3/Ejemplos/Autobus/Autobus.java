package Ejemplos.Autobus;

public class Autobus {

    private String matricula;
    private String modelo;
    private String color;
    private int numAsientos;

    public void arrancar() {

        System.out.println("Hola, soy un autobús. Voy a arrancar");
    }

    public void abrirPuertas() {

        System.out.println("Estoy abriendo las puertas");
    }

    public void frenar() {

        System.out.println("Voy a frenar");
    }

    public Autobus() {

    }

    public Autobus(String matricula, String modelo, String color, int numAsientos) {

        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.numAsientos = numAsientos;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setNumAsientos(int numAsientos) {

        this.numAsientos = numAsientos;
    }

    public String getMatricula() {

        return matricula;
    }

    public String getModelo() {

        return modelo;
    }

    public String getColor() {

        return color;
    }

    public int getNumAsientos() {

        return numAsientos;
    }

}
