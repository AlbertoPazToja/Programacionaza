import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainBibliotecas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Libro> listaLibros = new ArrayList<>();

        int opcion = 0;

        while (opcion != 67) {
            System.out.println("Elige una opción: \n");

            System.out.println("1- Engadir novo libro");
            System.out.println("2- Borrar libro");
            System.out.println("3- Modificar campo de un libro");

            opcion = sc.nextInt();
            sc.nextLine(); // Para limpiar la mierda

            switch (opcion) {
                case 1:

                    System.out.println("Añade una signatura:");
                    String signaturaNueva = sc.nextLine();

                    System.out.println("Añade un título:");
                    String tituloNuevo = sc.nextLine();

                    System.out.println("Añade una editorial:");
                    String editorialNueva = sc.nextLine();

                    System.out.println("Añade un autor:");
                    String autorNuevo = sc.nextLine();

                    System.out.println("Añade un ISBN");
                    String ISBN_Nuevo = sc.nextLine();

                    System.out.println("Añade un número de páginas:");
                    int paginasNuevo = sc.nextInt();
                    sc.nextLine();

                    listaLibros.add(
                            new Libro(signaturaNueva, tituloNuevo, editorialNueva, autorNuevo, ISBN_Nuevo,
                                    paginasNuevo));

                    break;

                case 2:
                    System.out.println("Introduce la signatura del libro que quieres borrar:");
                    String sinaturaABorrar = sc.nextLine();

                    Iterator<Libro> it = listaLibros.iterator();

                    while (it.hasNext()) {

                        Libro posicion = (Libro) it.next();

                        if (posicion.getSignatura().equals(sinaturaABorrar)) {
                            it.remove();
                            System.out.println("Se ha borrau vale");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Introduce el ISBN del libro que quieres modificar");
                    String ISBNpaModificar = sc.nextLine();

                    break;

                default:
                    break;
            }

        }

    }
}

// Desenvolver un programa en java que permita xestionar una lista de enteiros
// usando arraylist, deberá crear a lista de enteiros (non tipo primitivo osea
// Integer), debe permitir engadir números, amosar por pantalla o contido da
// lista e o seu tamaño e debe poder eliminar por posicion ou por valor
