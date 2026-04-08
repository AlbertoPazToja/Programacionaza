import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {

    public static void main(String[] args) {

        // Creamos el Scanner y el mapa
        Scanner sc = new Scanner(System.in);
        Map<String, String> traductor = new HashMap<>();
        int opcion = 67;

        while (opcion != 0) {

            System.out.println("Elige una opción: \n");

            System.out.println("1- Engadir un novo termo");
            System.out.println("2- Buscar un termo exacto");
            System.out.println("3- Buscar por texto que comeza");
            System.out.println("4- Modificar un termo");
            System.out.println("0- Salir \n");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Asigna los valores introducidos por el Scanner a las variables, que luego se
                    // introducen en el mapa como un nuevo nodo

                    System.out.println("Introduce el término en gallego:");
                    String nuevoGallego = sc.nextLine();

                    System.out.println("Introduce el término en castellano:");
                    String nuevoCastellano = sc.nextLine();

                    traductor.put(nuevoGallego, nuevoCastellano);

                    break;

                case 2:
                    // Si el mapa contiene alguna key con ese término, se imprime la key y el valor
                    // (gallego - castellano)

                    if (traductor.isEmpty()) {

                        System.out.println("No hay ningún término introducido");
                    }

                    System.out.println("Introduce el término en gallego:");
                    String terminoABuscar = sc.nextLine();

                    if (traductor.containsKey(terminoABuscar) == true) {

                        System.out.println("\n" + terminoABuscar + " -> " + traductor.get(terminoABuscar));
                    }

                    if (traductor.containsKey(terminoABuscar) == false) {

                        System.out.println("No hay ninguna coincidencia");
                    }

                    break;

                case 3:
                    // Dentro del bucle for va mirando uno por uno si una de las keys empieza por el
                    // término introducido por el Scanner. Si alguno coincide, se le suma 1 al
                    // contador, porque si el contador es 0 es porque no hay ninguna coincidencia
                    if (traductor.isEmpty()) {

                        System.out.println("No hay ningún término introducido");
                    }

                    else {

                        System.out.println("Introduce la cadena de texto que quieres buscar:");
                        String cadenaABuscar = sc.nextLine();
                        int contador = 0;

                        for (Map.Entry<String, String> terminoActual : traductor.entrySet()) {

                            if (terminoActual.getKey().startsWith(cadenaABuscar)) {

                                System.out.println(terminoActual.getKey() + " -> " + terminoActual.getValue());

                                contador++;
                            }
                        }

                        if (contador == 0) {

                            System.out.println("No hay coincidencias");
                        }
                    }

                    break;

                case 4:
                    // Si el mapa contiene el término que se quiere modificar introduce el término,
                    // ya que se borra y se crea el nuevo, que tiene la misma key
                    System.out.println("Introduce el término a modificar:");
                    String terminoAModificar = sc.nextLine();

                    System.out.println("Introduce el nuevo término en castellano");
                    String terminoNuevo = sc.nextLine();

                    if (traductor.containsKey(terminoAModificar)) {

                        traductor.put(terminoAModificar, terminoNuevo);
                    }

                    else {

                        System.out.println("No hay ningún término que coincida");
                    }

                    break;

                default:
                    break;
            }

        }

        sc.close();
    }
}
