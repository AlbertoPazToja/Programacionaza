public class TipoEnumerado {

        enum Perrazos {
            Mastín, Terrier, Bulldog, Pekinés, Caniche, Galgo
        }

         public static void main(String[] args) {

            Perrazos var1 = Perrazos.Terrier ;

            Perrazos var2 = Perrazos.Caniche ;

      
            System.out.println("¿Son el mismo perrazo?: " + var1.equals(var2));

            System.out.println("Comparación: " + var1.compareTo(var2));

            int posicionMastin = Perrazos.Mastín.ordinal();

            System.out.println("Posicion de Galgo en el enumerado: " + ++posicionMastin);

            Perrazos[] numPerrazos = Perrazos.values();
            int CantidadPerrazos = numPerrazos.length;
            System.out.println(CantidadPerrazos);




    }
    
}
