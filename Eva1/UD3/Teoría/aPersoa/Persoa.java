package Teoría.aPersoa;

public class Persoa {
    /* Atributos da clase */
    private String nome;
    private String dataNacemento;
    private double peso; // peso en kg
    private int altura; // altura en cm

    /* Construtor por defecto */
    public Persoa() {

    }

    /* Construtor da clase */
    public Persoa(String nome, String dataNacemento, double peso, int altura) {
        /* Inicialización de atributos */
        this.nome = nome;
        this.dataNacemento = dataNacemento;
        this.peso = peso;
        this.altura = altura;
    }

    /* Métodos da clase */
    public void durmir() {
        System.out.println("Vou durmir");
    }

    public void comer() {
        System.out.println("Teño fame, vou comer");
    }

    public void camiñar() {
        System.out.println("Estou camiñando");
    }

    public void setNome(String nome) {
        this.nome = nome; // Modificamos o nome
    }

    public void setAltura(int altura) {
        this.altura = altura; // Modificamos o nome
    }

    public String getNome() {
        return nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setDataNacemento(String dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDataNacemento() {
        return dataNacemento;

    }

    public double getPeso() {
        return peso;
    }

}

// No se puede ejecutar porque no tiene método main, pero luego puedo llamarla
// desde otra clase para ejecutar sus métodos

// Con Persoa(){} luego tengo que ir poniendo manuel.nome y introducir los datos
// uno por uno.
// Con Persoa(String nome, ...) y luego this.nome = nome (el de Persoa() es el
// mismo que el de arriba) luego cuando cree el objeto (Persoa manuel = new
// Persoa) ya puedo poner ahí los datos y ya está
