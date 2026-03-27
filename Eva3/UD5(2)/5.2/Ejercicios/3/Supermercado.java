import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Cliente> clientes = new ArrayDeque<>();

        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("-------------------------\n");
            System.out.println("1- Añadir cliente a la cola de espera");
            System.out.println("2- Atender cliente");
            System.out.println("3- Enseñar cola");
            System.out.println("0- Salir del programa");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Indica el nombre del cliente");
                    String nombreTemporal = sc.nextLine();

                    System.out.println("Indica el ID del cliente");
                    int IDTemporal = sc.nextInt();
                    sc.nextLine();

                    clientes.add(new Cliente(nombreTemporal, IDTemporal));

                    break;

                case 2:
                    Cliente atendido = clientes.getFirst();
                    clientes.removeFirst();

                    System.out.println("Se ha atendido al cliente " + atendido.getNome() + " con el ID "
                            + atendido.getID() + " y se ha marchado de la cola.");

                    break;

                case 3:

                    if (clientes.size() == 0) {

                        System.out.println("La cola está vacía");
                    }

                    else {
                        int tamañoLista = clientes.size();

                        // Enseña al primer cliente de la cola y lo mete al final, porque solo enseña el
                        // primero, y el bucle se repite hasta que el primero vuelve a ser el primero
                        // (el tamaño del Queue)
                        for (int i = 0; i < tamañoLista; i++) {

                            Cliente clienteActual = clientes.getFirst();

                            System.out.println(clienteActual.getNome() + " " + clienteActual.getID());

                            clientes.removeFirst();
                            clientes.addLast(clienteActual);
                        }
                    }
                    break;

                default:
                    break;
            }
        } while (opcion != 0);

        System.out.println("Se acaba el programa");

        sc.close();

    }

}
