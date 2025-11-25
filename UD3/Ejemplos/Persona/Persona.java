package Ejemplos.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {

        this.nombre = nombre;

        if (esCorrectaEdad(edad) == true) {

            this.edad = edad;

        }

        else {

            System.out.println("Edad incorrecta. Introduce un valor entre 0 y 150");
        }

        this.dni = dni;

        if (sexo == 'H' || sexo == 'M') {

            this.sexo = sexo;
        }

        else {

            System.out.println("Solo puede ser H o M");
        }

        this.peso = peso;

        this.altura = altura;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }

    public String getDNi() {

        return dni;
    }

    public char getSexo() {

        return sexo;

    }

    public double getPeso() {

        return peso;
    }

    public double getAltura() {

        return altura;
    }

    private boolean esCorrectaEdad(int edad) {

        if (edad >= 0 && edad <= 150) {

            return true;
        }

        else {

            return false;
        }
    }

}
