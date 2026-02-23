package Ejemplos.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Creamos los atributos de la clase Persona, y los ponemos en private

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        // Creamos el constructor, y le asignamos un valor a cada atributo

        this.nombre = nombre;

        if (esCorrectaEdad(edad) == true) {

            this.edad = edad;

        }

        else {

            System.out.println("Edad incorrecta. Introduce un valor entre 0 y 150");
        }

        // Si esCorrectaEdad == true (la edad está comprendida entre 0 y 150), se le
        // asigna el valor, y si no se imprime que la edad es incorrecta

        this.dni = dni;

        if (sexo == 'H' || sexo == 'M') {

            this.sexo = sexo;
        }

        else {

            System.out.println("Solo puede ser H o M");
        }

        // Si el sexo es H o M, se asigna, y si no no, y se imprime que solo puede ser H
        // y M

        this.peso = peso;

        this.altura = altura;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        if (esCorrectaEdad(edad) == true) {

            this.edad = edad;

        }

        else {

            System.out.println("Edad incorrecta. Introduce un valor entre 0 y 150");
        }
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public void setSexo(char sexo) {

        if (sexo == 'H' || sexo == 'M') {

            this.sexo = sexo;
        }

        else {

            System.out.println("Solo puede ser H o M");
        }
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

    public String getDni() {

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

    // Hacemos todos los setters y getters de cada atributo para poder llamarlos
    // desde otra clase siendo los atributos privados

    private boolean esCorrectaEdad(int edad) {

        if (edad >= 0 && edad <= 150) {

            return true;
        }

        else {

            return false;
        }
    }

    // Creamos un método que devuelve un boolean, true si la edad es correcta y
    // false si la edad no es correcta

    public void amosarInformacion() {

        System.out.println("El nombre es: " + this.getNombre());
        System.out.println("La edad es: " + this.getEdad());
        System.out.println("El DNI es: " + this.getDni());
        System.out.println("El sexo es: " + this.getSexo());
        System.out.println("El peso es: " + this.getPeso() + "kg");
        System.out.println("La altura es: " + this.getAltura() + " metros");

        if (esMayorDeEdad() == true) {

            System.out.println("Es mayor de edad");
        }

        if (esMayorDeEdad() == false) {

            System.out.println("Es menor de edad");
        }

        System.out.println("El índice de masa corporal es: " + this.calcularIMC());
    }

    // Creamos un método para que muestre todos los datos cuando se llame

    public Persona() {
    }

    public boolean esMayorDeEdad() {

        if (edad >= 18) {

            return true;
        }

        else {

            return false;
        }

    }

    // Creamos un método que es true si la edad es mayor de 18 y si no es false, y
    // en el método amosarInformacion ponemos que si el método es true que imprima
    // que sí es mayor de edad y si es false que no

    public double calcularIMC() {

        double imc = 0;

        imc = this.getPeso() / (this.getAltura() * this.getAltura());

        return imc;
    }

    // Creamos el método calcularIMC, que calcula el índice dividiendo el peso entre
    // la altura al cuadrado, y devuelve el resultado dentro de la variable imc
    // (return imc), y luego se imprime el método con el otro método
    // amosarInformación

}
