public class UsoVariables {
    public static void main(String[] args) {
        
        byte numero1 = 65; //creamos la variable numero1, con formato byte, y le asignamos el número 65
        short numero2 = 2000;
        int numero3 = 300000;
        float numero4 = 5E+30F;
        double numero5 = 3.3E+200;

        //creamos varias variables con distintos tipos de datos numéricos, y les asignamos un número que quepa en ese formato de la variable

        char numVariable1 = 'X';
        char numVariable2 = 88;

        //Creamos dos variables de tipo char, en las que cabe un único caracter. En ambos está la letra X

        String cadena= "Xaqueta" ;

        //Creamos una variable tipo String, que permite almacenar, al contrario de la anterior, varios caracteres

        System.out.println("Primer valor: " + numero1);
        System.out.println("Segundo valor: " + numero2);
        System.out.println("Tercer valor: " + numero3);
        System.out.println("Cuarto valor: " + numero4);
        System.out.println("Quinto valor: " + numero5);
        System.out.println("Sexto valor: " + numVariable1);
        System.out.println("Séptimo valor: " + numVariable2);
        System.out.println("Octavo valor: " + cadena);

        //Escribimos System.out.println para que imprima las frases mas el contenido de la variable
    }

}