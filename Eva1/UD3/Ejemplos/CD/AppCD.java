package Ejemplos.CD;

public class AppCD {
    public static void main(String[] args) {

        CD peliculaDeFrozen = new CD();
        // Creamos el objeto

        peliculaDeFrozen.setTamaño("800MB");
        peliculaDeFrozen.setEspacioLibre("50MB");
        peliculaDeFrozen.setAñoFabricacion(2013);
        // Le asignamos los valores

        System.out.println(peliculaDeFrozen.getTamaño());
        System.out.println(peliculaDeFrozen.getEspacioLibre());
        System.out.println(peliculaDeFrozen.getAñoFabricacion());
        // Mostramos por pantalla

        peliculaDeFrozen.guardarInformacion();

        CD temporada17LaRosaDeGuadalupe = new CD("800MB", "10MB", 2025);

        System.out.println(temporada17LaRosaDeGuadalupe.getTamaño());
        System.out.println(temporada17LaRosaDeGuadalupe.getEspacioLibre());
        System.out.println(temporada17LaRosaDeGuadalupe.getAñoFabricacion());

        temporada17LaRosaDeGuadalupe.guardarInformacion();

    }

}
