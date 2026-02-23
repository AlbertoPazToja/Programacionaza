package Ejemplos.Cuenta_Bancaria;

public class Conta {

    private int idConta;
    private String titular;
    private double saldo;
    private String conceptoUltimoMovimiento;
    // Creamos una clase Conta y le creamos sus atributos (públicos)

    public Conta() {
    } // Hace falta para que el primer objeto Conta c new Conta se pueda usar vacío.

    /*
     * public Conta(int idConta, String titular, double saldo) {
     * 
     * this.idConta = idConta;
     * this.titular = titular;
     * this.saldo = saldo;
     * 
     * }
     */

    public Conta(int idConta2, String titular2, double saldo2) {

        idConta = idConta2;
        this.titular = titular2; // Podemos poner this. pero no hace falta, en el de arriba sí porque tienen el
                                 // mismo nombre
        saldo = saldo2;

    }

    // No pueden estar los 2 constructores a la vez porque son iguales y da error
    // (comentamos uno)
    // El Conta en amarillo del constructor debe tener el mismo nombre que el de la
    // clase Conta

    public void setIdConta(int idConta) {

        this.idConta = idConta;

    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public int getIdConta() {

        return idConta;
    }

    public String getTitular() {

        return titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setConceptoUltimoMovimiento(String conceptoUltimoMovimiento) {

        this.conceptoUltimoMovimiento = conceptoUltimoMovimiento;
    }

    public String getConceptoUltimoMovimiento() {

        return conceptoUltimoMovimiento;

    }

    // Hacemos los setters y getters de los atributos de la clase, ya que están en
    // privado

    public boolean movemento(boolean tipo, double valor, String concepto) {

        boolean debe = true;
        boolean haber = false;
        this.conceptoUltimoMovimiento = concepto;

        System.out.println("Saldo inicial = " + this.getSaldo());

        if (tipo == debe) {

            this.saldo = this.saldo - valor;

        }

        else if (tipo == haber) {

            this.saldo = this.saldo + valor;
        }

        System.out.println("Saldo final = " + this.getSaldo());

        if (this.saldo >= 0) {

            System.out.println("Tienes saldo positivo");

            return true;

        }

        else {

            System.out.println("Tienes saldo negativo");

            return false;
        }

    }

    // Creamos el método movemento, que tiene 3 atributos propios y devuelve un
    // boolean

    public void mostrarInformacion() {

        System.out.println(getIdConta());
        System.out.println(getTitular());
        System.out.println(getSaldo());
        System.out.println(getConceptoUltimoMovimiento());
    }

    // Creamos otro método que sirve para mostrarmlos atributos por pantalla (mejor
    // con get)

}
