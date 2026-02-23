public class PruebaAnidada {

    public static void main(String[] args) {
        /*
         * Para cada número do 1 ao 3, o programa decide se é par ou impar. Se é
         * par, fai un segundo bucle que imprime dúas veces unha mensaxe; se é impar,
         * só imprime un aviso e segue.
         */
        for (int i = 1; i <= 3; i++) {
            System.out.println("Número " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println(" Dentro do if, repetición " + j);
                }
            } else {
                System.out.println(" Número impar, non entra no bucle interior");
            }
        }

    }

}
