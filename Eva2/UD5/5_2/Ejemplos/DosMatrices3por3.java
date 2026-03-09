public class DosMatrices3por3 {

    public static void main(String[] args) {

        // Declaración de una matriz de Strings de 3x3 para guardar nombres
        String[][] nombres = new String[3][3];

        // Declaración de una matriz de enteros de 3x3 para guardar la longitud de cada
        // nombre
        int[][] longitudes = new int[3][3];

        // Primer bucle: recorre las filas de la matriz nombres
        for (int i = 0; i < nombres.length; i++) {

            // Segundo bucle: recorre las columnas de cada fila
            for (int j = 0; j < nombres[i].length; j++) {

                // Asigna el nombre "Maria" a cada posición de la matriz
                nombres[i][j] = "Maria";

                // Guarda en la matriz longitudes la cantidad de letras del nombre
                longitudes[i][j] = nombres[i][j].length();

                // Imprime el nombre en pantalla seguido de una tabulación
                System.out.print(nombres[i][j] + "\t");
            }

            // Salto de línea después de imprimir cada fila de nombres
            System.out.println("\n");
        }

        // Bucle para recorrer la matriz de longitudes
        for (int k = 0; k < longitudes.length; k++) {

            // Bucle para recorrer cada columna de la matriz longitudes
            for (int l = 0; l < longitudes[k].length; l++) {

                // Imprime la longitud de cada nombre
                System.out.print(longitudes[k][l] + "\t");
            }

            // Salto de línea después de imprimir cada fila de longitudes
            System.out.println("\n");
        }

    }
}