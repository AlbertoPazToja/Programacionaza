public class Libro {

    private String signatura;
    private String titulo;
    private String editorial;
    private String autor;
    private String ISBN;
    private int paxinas;

    public Libro(String signatura, String titulo, String editorial, String autor, String iSBN, int paxinas) {
        this.signatura = signatura;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.ISBN = iSBN;
        this.paxinas = paxinas;
    }

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getPaxinas() {
        return this.paxinas;
    }

    public void setPaxinas(int paxinas) {
        this.paxinas = paxinas;
    }

    @Override

    public boolean equals(Object cualquierLibro) {

        boolean rdo = false;

        if (cualquierLibro instanceof Libro) {

            rdo = (signatura.equals(((Libro) cualquierLibro).signatura));
        }

        return rdo;

    }
}
