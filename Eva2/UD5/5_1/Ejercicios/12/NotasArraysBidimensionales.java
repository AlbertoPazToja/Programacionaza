public class NotasArraysBidimensionales {

    public static void main(String[] args) {

        // Guardamos el número de alumnos
        int numeroAlumnos = 10;
        // Guardamos el número de materias
        int numeroMaterias = 8;
        // Guardamos la nota de cada materia
        int notaMateria = 0;
        // Guardamos la media de las notas
        double media = 0;
        // Es un contador
        int contador = 0;
        // Guardamos la media de cada alumno
        double mediaCadaAlumno = 0;
        // Guardamos el número de aprobados
        int contadorAprobados = 0;
        // Guardamos el número de suspensos
        int contadorSuspensos = 0;
        // Guardamos la nota más baja
        int notaMasBaja = 10;
        // Guardamos la nota más alta
        int notaMasAlta = 0;
        // Guardamos el número de alumnos que aprobaron todo
        int alumnosQueAprobaronTodo = 0;
        // Guardamos el numero de aprobados, pero en cada alumno distinto se reinicia
        int contadorAprobadosReiniciable = 0;

        for (int i = 0; i < numeroAlumnos; i++) {

            // Imprimimos los alumnos
            System.out.println("");
            System.out.println("\nNotas del alumno número " + (i + 1) + ":");
            // Reiniciamos la variable (mirar abajo*)
            contadorAprobadosReiniciable = 0;

            for (int j = 0; j < numeroMaterias; j++) {

                // Vamos creando notas aleatorias con Math.random (*11 porque así es notas del 0
                // al 10)
                notaMateria = (int) (Math.random() * 11);
                // En la variable media vamos metiendo cada nota para luego dividirlo entre el
                // número de notas
                media = media + notaMateria;
                // Vamos sumando el número de notas que hay
                contador++;

                // Metemos también las notas de cada alumno en otra variable para dividirla
                // entre el numero de materias de cada alumno, y la reiniciamos para cada alumno
                mediaCadaAlumno += notaMateria;

                // Imprimimos por pantalla las notas de cada alumno
                System.out.print("Materia número " + (j + 1) + " = " + notaMateria + "\t");

                // Cuando ya imprimimos todas las notas, calculamos la media del alumno
                if (j == numeroMaterias - 1) {

                    System.out.println("\nLa media del alumno " + (i + 1) + " es: " + mediaCadaAlumno / numeroMaterias);
                    mediaCadaAlumno = 0;

                }

                // Si la nota de la materia es 5 o más
                if (notaMateria >= 5) {

                    // Lo sumamos a dos variables, la primera para contar el número de aprobados en
                    // general, y la segunda para mirar si el alumno tiene todas aprobadas. Si la
                    // segunda es igual a 8, osea tiene las 8 materias aprobadas, se le suma a otra
                    // variable, que cuenta el número de aprobados. Cuando pasa al siguiente alumno,
                    // se reinicia *

                    contadorAprobados++;
                    contadorAprobadosReiniciable++;

                    if (contadorAprobadosReiniciable == numeroMaterias) {

                        alumnosQueAprobaronTodo++;

                    }
                }

                // Si la nota es menor que 5, se suma a una variable que cuenta el número de
                // suspensos totales
                if (notaMateria < 5) {

                    contadorSuspensos++;
                }

                // Si la nota más baja es mayor que la nota actual (osea el bucle va uno por uno
                // cada nota), se reemplaza el valor de la variable de la nota más baja por la
                // nota actual
                if (notaMasBaja > notaMateria) {

                    notaMasBaja = notaMateria;
                }

                // Si la nota más alta es menor que la nota actual (osea el bucle va uno por uno
                // cada nota), se reemplaza el valor de la variable de la nota más alta por la
                // nota actual
                if (notaMasAlta < notaMateria) {

                    notaMasAlta = notaMateria;
                }

            }
        }

        // Hacemos la media de todas las notas, el contador cuenta el número de notas
        // que hay en total (80)
        media = media / contador;

        System.out.println("\nLa media de notas de todos los alumnos es: " + media);
        System.out.println("\nEl número de aprobados (5 o más) es de: " + contadorAprobados);
        System.out.println("\nEl número de alumnos suspensos (menos de 5) es de: " + contadorSuspensos);
        System.out.println("\nLa nota más alta del curso es: " + notaMasAlta);
        System.out.println("\n La nota más baja del curso es: " + notaMasBaja);
        System.out.println("\nEl número de alumnos que aprobaron todo es: " + alumnosQueAprobaronTodo);
    }

}
