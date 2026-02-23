public class PruebaFlag {
    public static void main(String[] args) {
        int flag; // Declaramos a bandeira
        for (int numero = 2; numero <= 100; numero++) { // Recorre todos los números (numero) desde 2 hasta 100
                                                        // (inclusive).
            flag = 0; // flag será 0 si, al final de las comprobaciones, "numero" no tiene divisores
                      // (es
                      // primo). Si se encuentra un divisor se pone a 1.

            for (int i = 2; i <= numero / 2; i++) { // Para el numero actual, intenta dividirlo por todos los enteros i
                                                    // desde 2 hasta numero/2. Si numero tiene algún divisor distinto de
                                                    // 1 y de sí mismo, necesariamente habrá uno ≤ numero/2, por eso se
                                                    // usa ese límite.

                if (numero % i == 0) { // Si numero es divisible por i (numero % i == 0), entonces: Se marca flag = 1
                                       // indicando que no es primo. break sale del bucle interior porque ya no hace
                                       // falta buscar más divisores.
                    flag = 1;
                    break; /* XA ATOPAMOS ALGÚN DIVISOR */
                }
            }
            if (flag == 0) {
                System.out.println(numero + " é primo");
            }
        }
    }
}
