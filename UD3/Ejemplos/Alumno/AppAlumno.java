package Ejemplos.Alumno;

public class AppAlumno {

    public static void main(String[] args) {

        Alumno alberto = new Alumno();

        alberto.setNombre("Alberto");
        alberto.setApellidos("Paz Toja");
        alberto.setFechaNacimiento("23 de Abril");
        alberto.setCurso(1);

        System.out.println(alberto.getNombre());
        System.out.println(alberto.getApellidos());
        System.out.println(alberto.getFechaNacimiento());
        System.out.println(alberto.getCurso());

        alberto.estudiar();
        alberto.reflexionar();
        alberto.dormir();

        Alumno alberta = new Alumno("Alberta", "Paza Toja", "23 de Mayo", 2);

        System.out.println(alberta.getNombre());
        System.out.println(alberta.getApellidos());
        System.out.println(alberta.getFechaNacimiento());
        System.out.println(alberta.getCurso());
        // Podemos cambiar el apellido
        alberta.setApellidos("Guerra Silva");
        System.out.println(alberta.getApellidos());

        alberta.estudiar();
        alberta.reflexionar();
        alberta.dormir();
    }

}
