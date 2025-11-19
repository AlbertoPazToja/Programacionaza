public class ExemploEnum {
    enum Dia {
        LUNS, MARTES, MÉRCORES, XOVES, VENRES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        Dia hoxe = Dia.LUNS;
        if (hoxe == Dia.MÉRCORES) {
            System.out.println("É mércores, metade da semana!");
        }
        
    }
}
