public class XestiónInstrumentos {

    public static void main(String[] args) {

        Instrumento g1 = new Guitarra("Guitarra", "Corda");
        Instrumento p1 = new Piano("Piano", "Corda");
        Instrumento f1 = new Flauta("Flauta", "Vento");
        Instrumento b1 = new Bateria("Bateria", "Percusion");

        Instrumento[] instrumentos = { g1, p1, f1, b1 };

        // Cada instrumento usa el método mostrar datos, propio de la clase abstracta, y
        // el método tocar, que también es de la clase abstracta, pero se hace un
        // override en cada instrumento para que sea distinto ¯\_( ͡° ͜ʖ ͡°)_/¯

        for (Instrumento instrumentoActual : instrumentos) {

            instrumentoActual.mostrarDatos();
            instrumentoActual.tocar();
            System.out.println("");

        }

        // Se va mirando con ifs si el instrumento actual del array en una instancia de
        // x instrumento, y si lo es, se aplica el método propio del instrumento x 😎

        for (Instrumento instrumentoActual : instrumentos) {

            if (instrumentoActual instanceof Guitarra) {

                ((Guitarra) instrumentoActual).afinarCorda(2);

                System.out.println("");

            }

            else if (instrumentoActual instanceof Piano) {

                ((Piano) instrumentoActual).abrirTapa();
                System.out.println("");

            }

            else if (instrumentoActual instanceof Flauta) {

                ((Flauta) instrumentoActual).limpar();
                System.out.println("");

            }

            else if (instrumentoActual instanceof Bateria) {

                ((Bateria) instrumentoActual).axustarTambores();
                System.out.println("");

            }

        }
    }

}
