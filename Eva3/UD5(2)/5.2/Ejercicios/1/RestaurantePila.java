import java.util.Stack;
import java.util.Scanner;

public class RestaurantePila {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Se crea la pila de objetos de la clase Plato
        Stack<Plato> platos = new Stack<>();

        int numeroMenu;

        do {
            System.out.println("Introduce una opción: \n");
            System.out.println("1- Introducir un plato sucio");
            System.out.println("2- Lavar el plato más reciente y mostrar datos");
            System.out.println("3- Mostrar todos los platos sucios");
            System.out.println("0- Salir del programa");

            numeroMenu = sc.nextInt();
            sc.nextLine(); // Pa que funcione el Scanner y no se ralle

            switch (numeroMenu) {
                case 1:
                    System.out.println("Introduce el UID del plato");
                    int tempUID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Introduce el nombre del plato");
                    String tempNombre = sc.nextLine();

                    // push añade un elemento al final de la pila
                    platos.push(new Plato(tempUID, tempNombre));
                    break;

                case 2:
                    // Chequeamos si la pila tiene elementos antes de intentar sacar uno
                    if (platos.isEmpty()) {
                        System.out.println("No quedan platos sucios para lavar");
                    } else {
                        // pop enseña y borra el elemento del final de la pila
                        Plato eliminado = platos.pop();
                        System.out.println(
                                "Se ha lavado el último plato: " + eliminado.getUID() + ": " + eliminado.getNombre());
                    }
                    break;

                case 3:
                    // Recorremos la pila desde el último hasta el primero
                    for (int i = platos.size() - 1; i >= 0; i--) {
                        // get(i) enseña el elemento en la posicion i
                        System.out.println("\\ " + platos.get(i).getUID() + ": " + platos.get(i).getNombre() + " /");
                    }
                    System.out.println("\\──────────────────/");
                    break;

                default:
                    break;
            }

        } while (numeroMenu != 0); // El bucle se repite hasta que el usuario pulse 0
        // Pechamos Scanner
        sc.close();

    }
}