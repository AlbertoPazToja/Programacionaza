public class CilindroApp {

    public static void main(String[] args) {

        Cilindro c1 = new Cilindro();

        c1.setRadio(5);
        c1.setAltura(10);

        c1.area();
        c1.volumen();

        // Creamos un nuevo objeto cilindro (el que no es static) y le asignamos valores
        // mediante los setters y luego los mostramos en pantalla mediante los métodos

        System.out.println("------------------------------------------------------------------------------------");

        Cilindro.area(5, 10);
        Cilindro.volumen(5, 10);

        // No hace falta crear un objeto para utilizar los métodos static, le asignamos
        // los valores y ya se muestran por pantalla mediante el método
    }

}
