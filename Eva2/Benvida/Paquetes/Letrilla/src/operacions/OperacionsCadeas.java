package Eva2.Benvida.Paquetes.Letrilla.src.operacions;

public class OperacionsCadeas {
    public static String invertir(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}
