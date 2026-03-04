public class ArrayDesplazamientoCircular {

    public static void desplazamiento(int[] numeros) {

        int auxiliarNumero0 = numeros[0];
        int i = 1;

        while (i < numeros.length) {

            numeros[i - 1] = numeros[i];
            i++;

        }

        // Meto al número de la derecha en el de la izquierda, y voy sumando 1 a i en
        // cada vuelta, para que haga lo mismo con el de la derecha todo el rato

        numeros[numeros.length - 1] = auxiliarNumero0;

        // Cuando termina el bucle, metemos al primer número de todos (posicion 0),
        // guardado al principio de todo en una variable, en la última posición
    }

    public static void main(String[] args) {

        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Bucle original: ");

        for (int valores : lista) {

            System.out.print(valores + ", ");
        }

        System.out.println(" \nBucle tras el desplazamiento: ");

        desplazamiento(lista);

        for (int valores : lista) {

            System.out.print(valores + ", ");
        }

        // Creamos el array, le aplicamos el método y lo imprimimos por pantalla
        // mediante un bucle foreach, sus valores uno por uno.
    }
}
