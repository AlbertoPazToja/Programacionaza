package Ejemplos.Color;

public class Color {

    private double R;
    private double G;
    private double B;

    // Creamos los atributos R, G y B siendo privados

    public Color() {
    }

    // Creamos el constructor vacío, para ponerle luego los setters y getters en la
    // app si queremos

    public Color(double red, double green, double blue) {

        if (red > 1) {

            this.R = 1;
        }

        else if (red < 0) {

            this.R = 0;
        }

        else {

            this.R = red;
        }

        if (green > 1) {

            this.G = 1;
        }

        else if (green < 0) {

            this.G = 0;
        }

        else {

            this.G = green;
        }

        if (blue > 1) {

            this.B = 1;
        }

        else if (blue < 0) {

            this.B = 0;
        }

        else {

            this.B = blue;
        }

    }

    // Creamos otro constructor con atributos, por si queremos meterle los datos de
    // los atributos a la hora de crear el objeto. En cada uno ponemos que si el
    // valor que introducimos es negativo, que se asigne un 0, si es mayor que uno
    // que se asigne un 1 y si es entre 0 y 1 que se le asigne el valor introducido

    public void setR(double red) {
        if (red < 0) {

            this.R = 0;
        }

        else if (red > 1) {

            this.R = 1;
        }

        else {

            this.R = red;
        }
        R = red;
    }

    public double getR() {

        return R;
    }

    public void setG(double green) {
        if (green > 1) {

            this.G = 1;
        }

        else if (green < 0) {

            this.G = 0;
        }

        else {

            this.G = green;
        }
        G = green;
    }

    public double getG() {
        return G;
    }

    public void setB(double blue) {
        if (blue > 1) {

            this.B = 1;
        }

        else if (blue < 0) {

            this.B = 0;
        }

        else {

            this.B = blue;
        }
        B = blue;
    }

    public double getB() {
        return B;
    }

    // Hacemos lo mismo que hicimos antes en el constructor, pero ahora en los
    // setters, y luego hacemos los getters

    public void amosarInformacion() {

        System.out.println("Valos de Red: " + getR());
        System.out.println("Valor de Green: " + getG());
        System.out.println("Valor de Blue: " + getB());

    }

    // Creamos el método amosarInformacion para que ya imprima los valores de R, G y
    // B

    public void gris() {

        double media = 0;

        media = (R + G + B) / 3;

        R = media;
        G = media;
        B = media;

        // Hacemos un método gris, que básicamente coge los 3 colores que pusimos y hace
        // la media, y le atribuye ese resultado a cada color, para que tengan todos el
        // mismo, y al tener todos el mismo hace el color gris

    }

    public boolean filtro(double filtroR, double filtroG, double filtroB) {

        if (filtroR < 0 && filtroR > 1 && filtroG < 0 && filtroB > 1 && filtroB < 0 && filtroB > 1) {

            return false;
        }

        else {

            R = filtroR * R;
            G = filtroG * G;
            B = filtroB * B;

            return true;
        }
    }

    // Creamos el método filtro, en el que introducimos un 1 si queremos que pase
    // esa luz o un 0 si no. Ponemos que si no están los valores que pusimos para
    // cada filtro, que devuelva un false, pero si no, hacemos una multiplicación a
    // los atributos R, G y B

}
