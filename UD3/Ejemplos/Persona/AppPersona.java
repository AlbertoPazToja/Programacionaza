package Ejemplos.Persona;

public class AppPersona {

    public static void main(String[] args) {

        Persona a = new Persona("Anuel AA", 30, "12345432A", 'M', 50.9, 1.10);

        /*
         * a.setNombre("Michael Jackson");
         * a.setEdad(50);
         * a.setDni("12345678J");
         * a.setSexo('H');
         * a.setPeso(60.2);
         * a.setAltura(1.75);
         */

        System.out.println(a.getNombre());
        System.out.println(a.getEdad());
        System.out.println(a.getDNi());
        System.out.println(a.getSexo());
        System.out.println(a.getPeso());
        System.out.println(a.getAltura());

    }

}
