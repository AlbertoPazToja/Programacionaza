import java.io.*;

public class VerDir2 {
    public static void main(String[] args) {
        String dir = ".";
        File f = new File(dir); // Creamos o File que representa ao directorio
        File[] archivos = f.listFiles(); // Lístase o directorio
        System.out.printf("Ficheros en el directorio actual: %d %n",
                archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivos[i], archivos[i].isFile(),
                    archivos[i].isDirectory());
        }
    }
}
