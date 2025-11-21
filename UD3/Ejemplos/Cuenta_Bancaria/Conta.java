package Ejemplos.Cuenta_Bancaria;

public class Conta {

    public int idConta;
    public String titular;
    public double saldo;
    // Creamos una clase Conta y le creamos sus atributos (públicos)

    public Conta() {
    } // Hace falta para que el primer objeto Conta c new Conta se pueda usar vacío.

    public Conta(int idConta, String titular, double saldo) {

        this.idConta = idConta;
        this.titular = titular;
        this.saldo = saldo;

    }

    public Contaza (int idConta2, String titular2, double saldo2){
        
        this.idConta = idConta2;

    }

}
