public class EjemploStringbuilder {

    public static void main(String[] args) {

        // Se crea un StringBuilder con el texto inicial
        StringBuilder cadenaza = new StringBuilder("Bo día paseante");

        // capacity() devuelve el espacio reservado en memoria
        System.out.println("La capacidad de la cadena es: " + cadenaza.capacity());

        // length() devuelve el número de caracteres actuales del texto
        System.out.println("La longitud de la cadena es: " + cadenaza.length());

        int numPaseantes = 3000;

        // insert() inserta texto en una posición concreta de la cadena
        cadenaza.insert(6, " aos " + numPaseantes);

        // append() añade texto al final
        cadenaza.append("s");

        System.out.println(cadenaza);

        // Se añade más texto al final de la cadena
        cadenaza.append(" da zona vella");

        System.out.println(cadenaza);

        // substring() crea un String con los últimos 10 caracteres de la cadena
        String miniCadenaza = cadenaza.substring(cadenaza.length() - 10);

        System.out.println(miniCadenaza);

    }

}