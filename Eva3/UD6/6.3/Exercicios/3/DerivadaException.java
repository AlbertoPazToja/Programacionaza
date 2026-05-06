public class DerivadaException extends Exception {
    String valor; // Valor que causou a excepción
    // Constructor personalizado

    public DerivadaException(String valor) {
        this.valor = valor;
    }

    // Sobrescribimos toString() para mostrar unha representación máis informativa
    public String toString() {
        return this.getMessage() + " (value: " + this.valor + ")";
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
