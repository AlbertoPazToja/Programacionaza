package Tareas;

public class BucleFor1_1AWhile {
    public static void main(String[] args) {

        int i = 0; // Creamos la variable i que funciona como un contador y le asignamos el valor 0
        int Producto = 1; // Creamos la variable Producto (=1)
        int Numero = 1; // Creamos la variable Numero (=1)

        while (i < 10) { // Mientras i es menor que 10

            Producto = Producto * Numero; // Guarda en Producto el resultado de multiplicar el Producto anterior por el
                                          // Numero actual (1 * 3 * 5 * 7 * 9...)
            Numero = Numero + 2; // Le sumamos 2 al número para que solo sean los números impares (1, 3, 5, 7...)

            i++; // Le sumamos 1 al contador
        }

        System.out.println(Producto);

    }

}
