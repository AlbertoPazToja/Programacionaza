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

    public void setDia(int dia) {
        this.dia = dia;
    }

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

}
