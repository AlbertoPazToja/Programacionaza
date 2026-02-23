package Exemplos;

public class ExemploStatic {
    static int contador = 0;

    public ExemploStatic() {
        contador++;
        System.out.println("Obxecto creado. contador = " + contador);
    }

    public static void main(String[] args) {
        ExemploStatic a = new ExemploStatic();
        ExemploStatic b = new ExemploStatic();
        ExemploStatic c = new ExemploStatic();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}