package Teoría.aPersoa;

public class AppPersoa {
    public static void main(String[] args) {

        Persoa manuel = new Persoa();
        // Creamos un obxeto manuel da clase Persoa, totalmente baleiro
        // Chamamos aos membros de manuel
        manuel.setNome("Manuel");
        manuel.setAltura(187);
        System.out.println(manuel.getNome());
        System.out.println(manuel.getAltura());
        manuel.setDataNacemento("23 de Abril");
        manuel.setPeso(63.5);
        System.out.println(manuel.getPeso());
        System.out.println(manuel.getDataNacemento());

        manuel.comer();
        manuel.camiñar();
        manuel.durmir();

        Persoa maria = new Persoa("Maria", "01/01/2000", 50, 160);

        System.out.println(maria.getNome());
        System.out.println(maria.getAltura());
        System.out.println(maria.getDataNacemento());
        System.out.println(maria.getPeso());

        maria.comer();
        maria.camiñar();
        maria.durmir();
    }
}
// Con Persoa(){} luego tengo que ir poniendo manuel.nome y introducir los datos
// uno por uno.
// Con Persoa(String nome, ...) y luego this.nome = nome (el de Persoa() es el
// mismo que el de arriba) luego cuando cree el objeto (Persoa manuel = new
// Persoa) ya puedo poner ahí los datos y ya está
