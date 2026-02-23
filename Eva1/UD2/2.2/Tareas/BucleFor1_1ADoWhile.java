package Tareas;

public class BucleFor1_1ADoWhile {
    public static void main(String[] args) {

        int i = 0; // Creamos la variable i que funciona como un contador y le asignamos el valor 0
        int Producto = 1; // Creamos la variable Producto (=1)
        int Numero = 1; // Creamos la variable Numero (=1)

        do {

            Producto = Producto * Numero; // Guarda en Producto el resultado de multiplicar el Producto anterior por el
                                          // Numero actual (1 * 3 * 5 * 7 * 9...)
            Numero = Numero + 2; // Le sumamos 2 al número para que solo sean los números impares (1, 3, 5, 7...)

            i++; // Le sumamos 1 al contador
        }

        while (i < 10); // Todo esto se hace hasta que i sea igual a 10

        System.out.println(Producto);

    }

}
