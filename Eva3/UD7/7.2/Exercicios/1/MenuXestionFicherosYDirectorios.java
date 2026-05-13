import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuXestionFicherosYDirectorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 99;

        while (opcion != 0) {

            System.out.println("Selecciona el directorio que quieres utilizar");
            String directorio = sc.nextLine();
            File d = new File(directorio);

            System.out.println("\n");
            System.out.println("1- Listar contido");
            System.out.println("2- Crear directorio novo");
            System.out.println("3- Borrar o directorio");
            System.out.println("4- Renomear o directorio");
            System.out.println("5- Introducir nova ruta");
            System.out.println("0- Saír da aplicación");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ArrayList<String> directorios = new ArrayList<>();
                    ArrayList<String> files = new ArrayList<>();

                    String[] contenido = d.list();
                    for (String archivoActual : contenido) {

                        File d2 = new File(d, archivoActual);

                        if (d2.isDirectory()) {
                            directorios.add(archivoActual);
                        } else if (d2.isFile()) {
                            files.add(archivoActual);
                        }

                    }

                    System.out.println("Lista de directorios:");
                    int contadorDirectorios = 0;
                    for (String directorioActual : directorios) {

                        System.out.println(directorioActual);

                        contadorDirectorios++;
                    }
                    System.out.println("Número de directorios: " + contadorDirectorios);

                    System.out.println("\nLista de files:");
                    int contadorFiles = 0;
                    for (String fileActual : files) {

                        System.out.println(fileActual + ", Tamaño: " + fileActual.length());

                        contadorFiles++;
                    }
                    System.out.println("Número total de files: " + contadorFiles);

                    break;

                case 2:

                    System.out.println("Introduce el nombre del directorio: ");
                    String nombreDirectorio = sc.nextLine();
                    new File(nombreDirectorio).mkdir();

                    break;

                case 3:

                    System.out.println("Introduce el nombre del directorio que quieres borrar: ");
                    String nombreDirectorioBorrar = sc.nextLine();
                    File directorioABorrar = new File(nombreDirectorioBorrar);

                    if (directorioABorrar.exists()) {

                        System.out.println("Seguro? Si estás seguro pon SI");
                        String confirmar = sc.nextLine();

                        if (confirmar.equalsIgnoreCase("si")) {
                            directorioABorrar.delete();
                            System.out.println("Directorio borrado");
                        }

                    } else {
                        System.out.println("El directorio no existe o contiene archivos dentro.");
                    }

                    break;

                case 4:
                    System.out.println("Introduce el nombre del directorio que quieres renomear: ");
                    String nombreDirectorioARenomear = sc.nextLine();
                    File directorioARenomear = new File(nombreDirectorioARenomear);
                    if (directorioARenomear.exists()) {
                        System.out.println("Introduce el nombre nuevo: ");
                        String nombreNuevo = sc.nextLine();
                        File nombreNuevillo = new File(nombreNuevo);
                        directorioARenomear.renameTo(nombreNuevillo);
                    }

                    else {

                        System.out.println("No existe un directorio con ese nombre. Vuelve a intentarlo.");
                    }

                    break;

                case 5:

                    // No hace nada, vuelve a empezar y pide el directorio

                    break;

                case 0:

                    opcion = 0;

                    break;

                default:
                    break;
            }

        }

        System.out.println("Saliendo del programa...🚭🚭🚭");

        sc.close();
    }
}
