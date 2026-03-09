public class EjercicioMatrizBaleira {

    public static void main(String[] args) {

        int[][] matriz = new int[3][5];

        int i = 0;
        int j = 0;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = i * j;

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println("");

        }

    }
}