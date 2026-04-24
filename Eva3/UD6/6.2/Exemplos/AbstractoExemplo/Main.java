// Clase abstracta: non se pode instanciar directamente
abstract class ObxectoGrafico {

    // Atributos comúns a todos os obxectos gráficos
    protected int x;
    protected int y;

    // Constructor
    public ObxectoGrafico(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método abstracto: cada subclase debe implementalo
    public abstract void debuxar();

    // Método non abstracto: compártese entre todas as subclases
    public void mover(int despX, int despY) {
        x += despX;
        y += despY;
        System.out.println("Obxecto movido a posición (" + x + ", " + y +
                ")");
    }
}

// Subclase que herda de ObxectoGrafico
class Circulo extends ObxectoGrafico {
    private int radio;

    public Circulo(int x, int y, int radio) {
        super(x, y); // chamamos ao constructor da superclase
        this.radio = radio;
    }

    // Implementación do método abstracto
    @Override
    public void debuxar() {
        System.out.println("Debuxando un círculo en (" + x + ", " + y + ") con radio " + radio);
    }
}

// Outra subclase que tamén herda de ObxectoGrafico
class Rectangulo extends ObxectoGrafico {
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación do método abstracto
    @Override
    public void debuxar() {
        System.out.println("Debuxando un rectángulo en (" + x + ", " + y +
                ") de " + ancho + "x" + alto);
    }
}

// Clase principal para probar o código
public class Main {
    public static void main(String[] args) {
        // Non podemos facer: ObxectoGrafico obj = new ObxectoGrafico(); //Erro!
        // Creamos obxectos das subclases
        Circulo c = new Circulo(10, 20, 5);
        Rectangulo r = new Rectangulo(30, 40, 10, 15);
        // Chamamos aos métodos
        c.debuxar();
        c.mover(5, -3);
        r.debuxar();
        r.mover(-10, 10);
    }
}
