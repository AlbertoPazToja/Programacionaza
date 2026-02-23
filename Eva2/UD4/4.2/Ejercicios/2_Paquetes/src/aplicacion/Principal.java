package aplicacion;

import Matematicas.Operacions;

public class Principal {

    public static void main(String[] args) {

        Operacions a1 = new Operacions();

        System.out.println("El resultado de la suma es: " + a1.sumar(6, 7));
        System.out.println("El resultado de la rasta es: " + a1.restar(7, 6));
        System.out.println("El resultado de la multiplicación es:" + a1.multiplicar(4, 20));

        try {
            System.out.println("El resultado de la división es: " + a1.dividir(10, 2));
            System.out.println("El resultado de la división es: " + a1.dividir(100, 0));
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("No se puede dividir entre 0 meu");
        }

    }

}
