import java.util.HashSet;
import java.util.Objects;

// Creamos el objeto Peliculas, que tiene de atributos nombre y el año de estreno, los ponemos privados
// y creamos setters, getters y constructores, aunque no hacen falta porque hacemos el programa en la 
// misma clase
public class Peliculas {

    private String nombre;

    private int anoEstreno;

    public Peliculas(String nombre, int anoEstreno) {
        this.nombre = nombre;
        this.anoEstreno = anoEstreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(int anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    @Override
    public boolean equals(Object o) {
        // 1. ¿Son el mismo objeto en memoria? Si apuntan al mismo sitio, son iguales.
        if (this == o)
            return true;

        // 2. ¿El objeto 'o' es una película? Si es nulo o de otra clase, no pueden ser
        // iguales.
        if (!(o instanceof Peliculas))
            return false;

        // 3. Convertimos 'o' a tipo Peliculas para poder comparar sus atributos.
        Peliculas p = (Peliculas) o;

        // 4. Criterio de igualdad: Dos películas son iguales si tienen el mismo nombre
        // y año de estreno.
        return Objects.equals(nombre, p.nombre) && anoEstreno == p.anoEstreno;
    }

    @Override
    public int hashCode() {
        // Genera un número entero único (o casi único) basado en el nombre y el año.
        // Es vital para que las películas funcionen bien en colecciones como HashSet o
        // HashMap.
        return Objects.hash(nombre, anoEstreno);
    }

    @Override
    public String toString() {
        // Define cómo se verá la película cuando hagas un System.out.println.
        // Ejemplo: "Inception (2010)"
        return nombre + " (" + anoEstreno + ") ";
    }

    public static void main(String[] args) {

        // Creamos dos conjuntos (HashSet) para almacenar las películas de cada amigo
        // El HashSet evita automáticamente que haya elementos duplicados
        HashSet<Peliculas> peliculasAmigo1 = new HashSet<>();
        HashSet<Peliculas> peliculasAmigo2 = new HashSet<>();

        // Instanciamos los objetos de la clase Peliculas
        Peliculas p1 = new Peliculas("Titanic", 1998);
        Peliculas p2 = new Peliculas("La vida de Catalina", 2026);
        Peliculas p3 = new Peliculas("Voy a dejar el ciclo", 2025);
        Peliculas p4 = new Peliculas("67 la pelicula", 67);

        // Añadimos las películas al primer amigo
        peliculasAmigo1.add(p1);
        peliculasAmigo1.add(p2);
        peliculasAmigo1.add(p4);

        // Añadimos las películas al segundo amigo
        peliculasAmigo2.add(p3);
        peliculasAmigo2.add(p4);

        // Mostramos las listas iniciales por consola
        System.out.println("Conxunto de películas del amigo 1: " + peliculasAmigo1);
        System.out.println("Conxunto de películas del amigo 2: " + peliculasAmigo2 + "\n");

        // Intersección: Creamos un nuevo conjunto copiando el del amigo 1
        HashSet<Peliculas> peliculasEnComun = new HashSet<>(peliculasAmigo1);
        // retainAll elimina todo lo que NO esté en el conjunto del amigo 2
        // (Intersección)
        peliculasEnComun.retainAll(peliculasAmigo2);

        System.out.println("Películas en común: " + peliculasEnComun + "\n");

        // Unión: Creamos un nuevo conjunto con los datos del amigo 1
        HashSet<Peliculas> todasPeliculas = new HashSet<>(peliculasAmigo1);
        // addAll añade los elementos del amigo 2 sin repetir los que ya existan (Unión)
        todasPeliculas.addAll(peliculasAmigo2);

        System.out.println("Todas las peliculas que les gustan a los 2: " + todasPeliculas + "\n");

        // Diferencia (exclusivas de cada uno):
        HashSet<Peliculas> peliculasSolo1 = new HashSet<>();
        HashSet<Peliculas> peliculasSolo2 = new HashSet<>();

        // Recorremos las pelis del amigo 1. Si el amigo 2 NO la tiene, la guardamos
        for (Peliculas pelis1 : peliculasAmigo1) {
            if (!(peliculasAmigo2.contains(pelis1))) {
                peliculasSolo1.add(pelis1);
            }
        }

        // Recorremos las pelis del amigo 2. Si el amigo 1 NO la tiene, la guardamos
        for (Peliculas pelis2 : peliculasAmigo2) {
            if (!(peliculasAmigo1.contains(pelis2))) {
                peliculasSolo2.add(pelis2);
            }
        }

        // Mostramos los resultados de las películas exclusivas de cada uno
        System.out.println("Películas que solo le gustan al amigo 1: " + peliculasSolo1);
        System.out.println("Películas que solo le gustan al amigos 2: " + peliculasSolo2);
    }
}
