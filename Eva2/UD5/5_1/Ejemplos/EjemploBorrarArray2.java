package Eva2.UD5.Ejemplos;

public class EjemploBorrarArray2 {

    public static void main(String[] args) {
        // Creación e inicialización do array nomes
        String[] nomes = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego",
                "Paula" };
        // Marcamos cal é o último elemento do array;

        int ultimo = nomes.length - 1;

        // Mostramos array, percorrendóo.
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Valor da posición " + i + ": " + nomes[i]);
        }
        System.out.println("----------------------------");

        // Buscamos a posición do elemento a borrar no array
        int i = 0;
        while (!nomes[i].equals("Irene")) {
            i++;
        }

        // En la posicion nomes[i] (que es Irene), lo cambiamos por el último de la
        // lista
        nomes[i] = nomes[ultimo];

        // Descontamos o valor de ultimo para indicar que agora hay un elto. menos
        ultimo = ultimo - 1;
        // Se quixeramos facer agora o recorrido o faríamos ata o valor de último
        for (int j = 0; j <= ultimo; j++) {
            System.out.println("Valor da posición " + j + ": " + nomes[j]);
        }
    }

}
