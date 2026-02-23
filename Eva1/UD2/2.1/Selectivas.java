public class Selectivas {

    public static void main(String[] args) {

        final double PI = 3.1416;
        double radio = 7.5; //valor del radio
        
        if (radio > 0) { //si el radio es mayor que 0 se ejecuta lo siguiente
                double lonxitude = 2 * PI * radio; 
                System.out.println("A lonxitude da circunferencia é: " + lonxitude);
} //fin do if

        else{

            System.out.println("No se ha podido calcular el perímetro de la circunferencia, radio negativo"); //solo si el radio es menor que 0, se ejecuta solo ésto, y luego se sigue ejecutando el programa

        }

    System.out.println("Continúa el programa"); //Si no se cumple la condición if, el programa sigue ejecutándose aquí

    }
}