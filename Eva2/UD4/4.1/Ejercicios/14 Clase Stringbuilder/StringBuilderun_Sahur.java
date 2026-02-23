public class StringBuilderun_Sahur {

    // Método que invierte una cadena usando StringBuilder
    public void invertirCadena(String cadenaOriginal) {

        // Se crea un StringBuilder a partir de la cadena original
        StringBuilder sb = new StringBuilder(cadenaOriginal);

        // Se invierte la cadena y se muestra por pantalla
        System.out.println("a) Invertido: " + sb.reverse().toString());

    }

    // Método que elimina todas las vocales de la cadena
    public void sinVocales(String cadenaOriginal) {

        // Se crea un StringBuilder con la cadena original
        StringBuilder sb = new StringBuilder(cadenaOriginal);

        // Contador para recorrer la cadena carácter a carácter
        int contador = 0;

        // Bucle que recorre el StringBuilder mientras no se llegue al final
        do {

            // Se obtiene el carácter en la posición actual
            char letra = sb.charAt(contador);

            // Se comprueba si el carácter es una vocal (mayúscula o minúscula)
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A'
                    || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

                // Si es vocal, se elimina del StringBuilder
                sb.deleteCharAt(contador);

            } else {

                // Si no es vocal, se avanza al siguiente carácter
                contador++;

            }

        }
        // El bucle continúa mientras el contador sea menor que la longitud del
        // StringBuilder
        while (contador < sb.length());

        // Se muestra la cadena sin vocales
        System.out.println("b) Sen vogais: " + sb);

    }

    // Método que sustituye una palabra por otra dentro de la cadena
    public void substituir(String cadenaOriginal, String antiguo, String nuevo) {

        // Se crea un StringBuilder con la cadena original
        StringBuilder sb = new StringBuilder(cadenaOriginal);

        // Se busca la primera aparición de la palabra a sustituir
        int index = sb.indexOf(antiguo);

        // Mientras se encuentre la palabra antigua
        while (index != -1) {

            // Se reemplaza la palabra antigua por la nueva
            sb.replace(index, index + antiguo.length(), nuevo);

            // Se busca la siguiente aparición a partir de la posición actual
            index = sb.indexOf(antiguo, index + nuevo.length());

        }

        // Se muestra la cadena resultante
        System.out.println("c) Substituir '" + antiguo + "' por '" + nuevo + "': " + sb);

    }

    // Método que inserta una palabra en una posición concreta de la cadena
    public void insertar(String cadenaOriginal, String palabra, int posicion) {

        // Se crea un StringBuilder con la cadena original
        StringBuilder sb = new StringBuilder(cadenaOriginal);

        // Se inserta la palabra en la posición indicada
        sb.insert(posicion, palabra);

        // Se muestra la cadena con la palabra insertada
        System.out.println("d) Inserir '" + palabra + "' en la posición '" + posicion + "': " + sb);

    }

}
