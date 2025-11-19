public class Operadores1 {

    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        int suma = a + b;

        int resta = a - b;

        int multiplicacion = a * b;

        double division = (double) a / b; //es necesario convertir las variables en double para que, al realizar la división, el cociente no sea aproximado, y de un número con decimales

        int resto = a % b;

        System.out.println("Resultado suma: " + suma);
        System.out.println("Resultado resta: " + resta);
        System.out.println("Resultado multiplicación: " + multiplicacion);
        System.out.println("Resultado división: " + division);
        System.out.println("Resultado módulo: " + resto);
        System.out.println("------------------------------------------");

        boolean iguales = (a == b); 

        boolean diferentes = (a != b);

        boolean mayor = (a > b);

        boolean menor = (a < b);

        // se están asignando a cada variable una comparación entre a y b, y con boolean estamos indicando si es verdadero o falso

        System.out.println("¿Son iguales? -> " + iguales);
        System.out.println("¿Son diferentes? -> " + diferentes);
        System.out.println("¿'a' es mayor que 'b'? -> " + mayor);
        System.out.println("¿'a' es menor que 'b'? -> " + menor);
        System.out.println("-------------------------------------------");

        boolean dospositivos= (a>0 && b>0);

        boolean algunnegativo = (a<0 || b<0);

        System.out.println("¿Son los dos positivos?: " + dospositivos);
        System.out.println("¿Es alguno de los dos negativo?: " + algunnegativo);
        System.out.println("------------------------------------------");

        a += 5;

        b *= 2;

        System.out.println("Incremento en 5 con operador combinado: " + a);
        System.out.println("Multiplicación por 2 con operador combinado: " + b);
        System.out.println("------------------------------------------");

        System.out.println("Variable 'a' antes del operador de post-incremento: " + a);
        System.out.println("Variable 'b' antes del operador de pre-decremento: " + b);
        System.out.println("");

        int apostincremento = a++;

        int bpredecremento = --b;

        System.out.println("Variable 'a' despúes del operador de post-incremento: " + apostincremento);
        //El valor incial de a es 13. En el post-incremento, al asignarle el valor a la variable apostincremento se utiliza el valor incial de a, y despúes de haberle asignado ese valor, se incrementa a en 1
        System.out.println("Valor de 'a': " + a);

        System.out.println("Variable 'b' después del operador de pre-decremento: " + bpredecremento);
        //El valor inicial de b es 6. Al contrario que la anterior, primero se le resta 1 a b, y después se le asigna el valor a la variable bpredecremento.
        System.out.println("Valor de 'b': " + b);

        System.out.println("------------------------------------------");

        
        
        

    }

}
