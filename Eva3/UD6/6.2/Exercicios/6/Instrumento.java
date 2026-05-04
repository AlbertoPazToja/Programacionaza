// Las clases de los intrumento heredarán los atributos y el método abstracto tocar 
// (✿◡‿◡) (✿◡‿◡) (✿◡‿◡) (✿◡‿◡) (✿◡‿◡) (✿◡‿◡) (✿◡‿◡)

public abstract class Instrumento {

    private String nome;
    private String familia;

    public Instrumento(String nome, String familia) {
        this.nome = nome;
        this.familia = familia;
    }

    public Instrumento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public abstract void tocar();

    public void mostrarDatos() {

        System.out.println(this.getNome() + " pertenece a la familia de instrumentos de " + this.getFamilia());
    }

}
