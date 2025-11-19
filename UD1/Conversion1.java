public class Conversion1 {
    public static void main(String[] args) {
        int a;

        byte b;

        //tenemos un numero int (a)

        a = 25;
        b = 12;

        System.out.println(b + " antes");

        b = (byte) a;

        System.out.println(a);
        System.out.println(b + " después");

    }

}
