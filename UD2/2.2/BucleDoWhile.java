public class BucleDoWhile {
  public static void main(String[] args) {
    int Suma = 0; // Creamos la variable Suma, y le asignamos el valor de 0
    int i = 0; // Creamos la variable i y le asignamos también el valor de 0
    do { // Hacemos:-
      i++; // Sumamos 1 a la variable i (hace de contador del número de vueltas)
      Suma = Suma + i; // La variable Suma es igual a Suma + i (1, 3, 6, 10...)
    } while (Suma < 100000); // -:mientras la suma de antes hasta que Suma sea mayor que 100000
    System.out.println(i); // Enseñamos la variable i, para ver el número de vueltas que tiente que dar
  }
}
