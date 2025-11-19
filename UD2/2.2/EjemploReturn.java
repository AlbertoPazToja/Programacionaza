public class EjemploReturn {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void saudar() {
        System.out.println("Ola mundo!");
    }

    public static void main(String[] args) { // Se empieza a ejecutar por el main siempre

        System.out.println("Empieza el main");
        int resultado = sumar(5, 3); // Llamada a un método con return
        System.out.println("El resultado de la suma es " + resultado);
        saudar(); // Llama a un método void
        System.out.println("Remata o main");

    }
}
