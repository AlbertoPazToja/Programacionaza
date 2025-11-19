public class BucleDoWhileAWhile {
  public static void main(String[] args) {
    int Suma = 0; // Creamos la variable Suma, y le asignamos el valor de 0
    int i = 0; // Creamos la variable i y le asignamos también el valor de 0

    while (Suma < 100000) { // Mientras el valor de suma sea menos de 100000:
      i++; // Sumamos 1 al valor de i y vuelve a empezar el bucle
      Suma = Suma + i; // Suma es igual a Suma mas i
    }
    System.out.println(i); // Mostramos el valor de i por pantalla
  }
}

// Hay que poner primero el i++ antes del Suma = Suma + i, ya que si no haría
// una vuelta de 0 = 0 + 0, y sumaría una vuelta innecesaria. También hay que
// poner el System.out.println fuera del bucle ya que si no imprimiría por
// pantalla cada vuelta que da, y así solo imprime el número de vuelta cuando la
// condición ya no se cumple
