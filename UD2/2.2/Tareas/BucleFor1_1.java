package Tareas;

public class BucleFor1_1 {
    public static void main(String[] args) {

        int i; // Creamos la variable i, que funciona como un contador
        int Producto = 1; // Creamos la variable Producto (=1)
        int Numero = 1; // Creamos la variable Numero (=1)

        for (i = 0; i < 10; i++) { // i es = 0, i tiene que ser menor de 10 y se le suma 1 a i. Esto funciona
                                   // básicamente como un contador, que cuenta los primeros 10 números
            Producto = Producto * Numero; // Guarda en Producto el resultado de multiplicar el Producto anterior por el
                                          // Numero actual (1 * 3 * 5 * 7 * 9...)
            Numero = Numero + 2; // Le sumamos 2 al número para que solo sean los números impares (1, 3, 5, 7...)

        }
        System.out.println(Producto);
    }
}
