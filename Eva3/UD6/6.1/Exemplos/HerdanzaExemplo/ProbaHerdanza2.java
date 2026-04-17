import java.util.Scanner;

class Persoa {
    private String nif;
    private String nome;

    public Persoa() {
        System.out.println("Executando o construtor de Persoa");
    }

    public Persoa(String nif, String nome) {
        this.nif = nif;
        this.nome = nome;
    }
    // Resto de métodos
}

class Alumno extends Persoa {
    private String curso;

    public Alumno() {
        System.out.println("Executando o construtor de Alumno");
    }

    public Alumno(String nif, String nome, String curso) {
        super(nif, nome); // chamada ao construtor da superclase Persoa enviándolle os que necesita para
                          // que asigne os valores os atributos nif e nome
        this.curso = curso;
    }
    // Resto de métodos
}
