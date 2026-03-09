public class EjercicioMatrizBaleira {

    public static void main(String[] args) {
        // Creamos a matriz de 3x5 de enteiros
        int[][] matriz = new int[3][5];

        int i = 0;
        int j = 0;

        // Percorremos a matriz e gardamos cada elemento e o imprimimos
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = i * j;

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println("");

        }

    }
}