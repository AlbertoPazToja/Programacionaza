package Ejemplos.Ascensor2_1;

public class AppAscensor {

    public static void main(String[] args) {

        Ascensor a = new Ascensor(5, 10); // Está

        a.setPiso(5);
        a.setLimite(10);
        a.situacion();
        a.bajar(1);
        a.situacion();
        a.subir(100);
        a.situacion();
    }

}
