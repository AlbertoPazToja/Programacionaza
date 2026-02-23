package Ejemplos.Data;

public class Data {

    enum listademeses {
        Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
    }

    // Creamos un enumerado, que funciona como un tipo de atributo, y le asignamos
    // el conjunto de valores que puede tomar la variable

    private int dia;
    private listademeses mes;
    private int año;

    // Creamos los atributos de la clase, poniendo a mes listademeses que creamos
    // antes

    public Data() {
    }

    public Data(listademeses mes) {
    }

    public Data(int dia, listademeses mes, int año) {

    }

    // Creamos un constructor vacío para ponerlo luego con setters y getters, otro
    // para el enum de los meses y otro para ponerlo desde el propio objeto

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {

            this.dia = dia;
        }

        else {

            System.out.println("El dia introducido no es válido");
        }
    }

    // Si el dia asignado no está dentro de esos parámetros, directamente no se
    // asigna

    public int getDia() {
        return dia;
    }

    public void setMes(listademeses mes) {
        this.mes = mes;
    }

    public listademeses getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    // Creamos setters y getters, ya que los atributos están privados

    public boolean isSummer() {

        if ((this.getDia() >= 21 && this.getMes() == listademeses.Junio) || this.getMes() == listademeses.Julio
                || this.getMes() == listademeses.Agosto
                || (this.getDia() <= 21 && this.getMes() == listademeses.Septiembre)) {

            return true;
        }

        else {

            return false;
        }
    }

    // Es verano cuando se siguen esos parámetros

    public String toString() {

        return "Hoy es " + this.getDia() + " de " + this.getMes() + " del año " + this.getAño();
    }

    // Un método que imprime los atributos en una frase

}
