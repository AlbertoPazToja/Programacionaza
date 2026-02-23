package Ejemplos.CD;

public class CD {

    private String tamaño;
    private String espacioLibre;
    private int añoFabricacion;

    // Creamos los atributos de la clase

    public CD() {

    }

    // Construsctor de la clase

    public CD(String tamaño, String espacioLibre, int añoFabricacion) {

        // Inicialización de atributos
        this.tamaño = tamaño;
        this.espacioLibre = espacioLibre;
        this.añoFabricacion = añoFabricacion;
    }

    // Lo de arriba no se puede acceder desde fuera, para ello hay que hacer setters
    // y getters

    public void guardarInformacion() {
        System.out.println("Voy a guardar la información");
    }

    // El set siempre es public + void + set con nombre con mayúsculas + (tipo de
    // variable + nombre variable)
    public void setTamaño(String tamaño) {

        // this. + nombre variable = nombre variable
        this.tamaño = tamaño;
    }

    public void setEspacioLibre(String espacioLibre) {

        this.espacioLibre = espacioLibre;
    }

    public void setAñoFabricacion(int añoFabricacion) {

        this.añoFabricacion = añoFabricacion;
    }

    // El get siempre es public + tipo de variable + get con nombre en mayúsculas +
    // ()
    public String getTamaño() {

        // return + nombre variable
        return tamaño;
    }

    public String getEspacioLibre() {

        return espacioLibre;
    }

    public int getAñoFabricacion() {

        return añoFabricacion;
    }
}
