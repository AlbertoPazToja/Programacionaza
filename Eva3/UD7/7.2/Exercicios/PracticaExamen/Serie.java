public class Serie {

    private String titulo;
    private int numeroTempadas = 3;
    private boolean prestado = false;
    private String xenero;
    private String creador;

    public Serie(String titulo, int numeroTempadas, boolean prestado, String xenero, String creador) {
        this.titulo = titulo;
        this.numeroTempadas = numeroTempadas;
        this.prestado = prestado;
        this.xenero = xenero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTempadas() {
        return numeroTempadas;
    }

    public void setNumeroTempadas(int numeroTempadas) {
        this.numeroTempadas = numeroTempadas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

}
