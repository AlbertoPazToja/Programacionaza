import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploRead {
    public static void main(String[] args) {
        String contido = "";
        int dato;
        try {

            // Apertura do fluxo de lectura cara ao ficheiro
            // O cursor sitúase ao comezo do ficheiro
            FileReader ficheiro = new FileReader("datos.dat");

            // Lectura do primeiro carácter
            // O cursor móvese cara ao seguinte carácter
            dato = ficheiro.read();

            // Mentres o valor que retorne o método de lectura non sexa -1
            // significa que aínda hai máis caracteres por ler no ficheiro
            while (dato != -1) {

                // O valor do método de lectura devolve un enteiro que debe
                // ser convertido correctamente para a súa visualización
                contido = contido + (char) dato;
                dato = ficheiro.read();
            }
            System.out.println("O contido do ficheiro é o seguinte:\n" + contido);

            // Peche do fluxo e liberaciónd e recursos
            ficheiro.close();

            // Pode evitarse o primeiro catch, posto que FileNotFoundException é unha
            // excepción filla de IOException. Desta maneira podemos diferenciar os erros
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: O ficheiro é un directorio ou ben non existe.");

        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
        }
    }
}
