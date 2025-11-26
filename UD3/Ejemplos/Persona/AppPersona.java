package Ejemplos.Persona;

public class AppPersona {

    public static void main(String[] args) {

        Persona a = new Persona("Anuel AA", 49, "12345432A", 'F', 50.9, 1.10);

        /*
         * a.setNombre("Michael Jackson");
         * a.setEdad(50);
         * a.setDni("12345678J");
         * a.setSexo('H');
         * a.setPeso(60.2);
         * a.setAltura(1.75);
         */

        /*
         * System.out.println(a.getNombre());
         * System.out.println(a.getEdad());
         * System.out.println(a.getDni());
         * System.out.println(a.getSexo());
         * System.out.println(a.getPeso());
         * System.out.println(a.getAltura());
         */

        a.amosarInformacion();

        System.out.println("-------------------------------");

        Persona b = new Persona();

        b.setNombre("Catalina");
        b.setEdad(10);
        b.setDni("45678987E");
        b.setSexo('M');
        b.setPeso(48);
        b.setAltura(1.78);

        b.amosarInformacion();

        // Creamos setters del nuevo objeto, para comprobar las restricciones que
        // pusimos en los setter, ya que no utilizamos el constructor, donde teníamos
        // las restricciones antes

    }

}
