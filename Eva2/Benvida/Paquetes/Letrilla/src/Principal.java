package Eva2.Benvida.Paquetes.Letrilla.src;

import Eva2.Benvida.Paquetes.Letrilla.src.operacions.OperacionsCadeas;

public class Principal {
    public static void main(String[] args) {
        String resultado = OperacionsCadeas.invertir("Ola mundo");
        System.out.println("Texto invertido: " + resultado);
    }
}
