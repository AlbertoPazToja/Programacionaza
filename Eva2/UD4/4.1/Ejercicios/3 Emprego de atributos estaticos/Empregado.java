public class Empregado {

    private String nombre;
    private int antigüedad;
    private static double salario;

    // Creamos los atributos de la clase, siendo privados, y el salario siendo
    // static, ya que es el mismo para todos los empleados

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public static void setSalario(double salario) {
        Empregado.salario = salario;
    }

    public static double getSalario() {
        return salario;
    }

    // Creamos setters y getters para cada atributo para poder llamarlos desde otra
    // clase, ya que son privados

    public static void aumentarBase(double porcentaje) {

        System.out.println("El salario base es de " + salario + " euros");

        salario = salario * (1 + porcentaje / 100);

        System.out.println(
                "El salario base ha aumentado un " + porcentaje + " por ciento, por lo que ahora es de " + salario
                        + " euros");

    }

    // Primero muestra el salario base, y luego calcula el aumento del salario tras
    // introducir un porcentaje. El método es static ya que aplica a todos los
    // empleados

    public double aumentarAntigüedad(String nombre, int antigüedad) {

        double resultado = salario + (antigüedad * 10);

        System.out
                .println("El salario de " + nombre + " es de " + resultado + ", ya que tiene " + antigüedad
                        + " años de antigüedad, y el salario aumenta 10 euros cada año");

        return resultado;
    }

    // Hacemos el cálculo de que el salario de x persona es el salario base más sus
    // años de antigüedad x 10, y después de mostrarlo por pantalla. No es static ya
    // que es diferente para cada empleado. Creamos la variable resultado porque si
    // ponemos salario se asigna y no se puede hacer para mas personas. Hacemos que
    // devuelva el resultado por si lo necesitásemos para otro ejercicio

}
