package Eva2.UD5.Ejemplos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploOrdenarArray {

    public static void main(String[] args) {

        // EL ULTIMO DEL INDEX NO ENTRA, NO LO ORDENA

        String[] nomes = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego",
                "Paula" };
        Arrays.sort(nomes);
        System.out.println("Nomes ordenados ascendentemente: " + Arrays.toString(nomes));
        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes ordenados descendentemente: " + Arrays.toString(nomes));

        System.out.println("-------------------------------------------------------------");

        String[] nomes2 = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego",
                "Paula" };

        Arrays.sort(nomes2, 3, 6);
        System.out.println("Nomes ordenados ascendentemente (3-6): " + Arrays.toString(nomes2));
        Arrays.sort(nomes2, 0, 4, Collections.reverseOrder());
        System.out.println("Nomes ordenados descendentemente (0-4): " + Arrays.toString(nomes2));

    }

}
