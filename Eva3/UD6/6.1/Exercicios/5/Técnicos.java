public class Técnicos extends Operarios {

    public Técnicos(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }

}
