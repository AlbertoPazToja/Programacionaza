package Ejemplos.Alumno;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private int curso;

    public void estudiar() {
        System.out.println("Estoy harto de estudiar");
    }

    public void reflexionar() {
        System.out.println("Voy a dejar el ciclo");
    }

    public void dormir() {
        System.out.println("Me voy a dormir");
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String fechaNacimiento, int curso) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getCurso() {
        return curso;
    }

}
