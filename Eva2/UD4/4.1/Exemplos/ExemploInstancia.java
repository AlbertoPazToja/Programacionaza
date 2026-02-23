package Exemplos;

public class ExemploInstancia {
    int contador = 0;

    public ExemploInstancia() {
        contador++;
        System.out.println("Obxecto creado. contador = " + contador);
    }

    public static void main(String[] args) {
        ExemploInstancia a = new ExemploInstancia();
        ExemploInstancia b = new ExemploInstancia();
        ExemploInstancia c = new ExemploInstancia();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
