import java.util.HashSet;
import java.util.Objects;

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

        if (this == o)
            return true;
        if (!(o instanceof Peliculas))
            return false;
        Peliculas p = (Peliculas) o;

        return Objects.equals(nombre, p.nombre) && anoEstreno == p.anoEstreno;
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, anoEstreno);
    }

    @Override
    public String toString() {

        return nombre + " (" + anoEstreno + ") ";
    }

    public class conxuntoPeliculas {

        public static void main(String[] args) {

            HashSet<Peliculas> peliculasAmigo1 = new HashSet<>();
            HashSet<Peliculas> peliculasAmigo2 = new HashSet<>();

            Peliculas p1 = new Peliculas("Titanic", 1998);
            Peliculas p2 = new Peliculas("La vida de Catalina", 2026);
            Peliculas p3 = new Peliculas("Voy a dejar el ciclo", 2025);
            Peliculas p4 = new Peliculas("67 la pelicula", 67);

            peliculasAmigo1.add(p1);
            peliculasAmigo1.add(p2);
            peliculasAmigo1.add(p4);

            peliculasAmigo2.add(p3);
            peliculasAmigo2.add(p4);

            System.out.println("Conxunto de películas del amigo 1: " + peliculasAmigo1);
            System.out.println("Conxunto de películas del amigo 2: " + peliculasAmigo2);

            HashSet<Peliculas> peliculasEnComun = new HashSet<>(peliculasAmigo1);

            peliculasEnComun.retainAll(peliculasAmigo2);

            System.out.println("Todas las películas de los 2: " + peliculasEnComun);

            System.out.println("Películas en común: " + peliculasEnComun);

            HashSet<Peliculas> todasPeliculas = new HashSet<>(peliculasAmigo1);

            todasPeliculas.addAll(peliculasAmigo2);

            System.out.println("Todas las peliculas que les gustan a los 2: " + todasPeliculas);

        }
    }
}
