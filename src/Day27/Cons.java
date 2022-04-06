package Day27;

public class Cons {
    public static int length = 0;
}

class ConsLength {
    static Cons cons1 = new Cons();
    static Cons cons2 = new Cons();

    static {
        System.out.print(cons1.length); // en basta burasi calisir static blok oldugu icin
    }

    public static void main(String[] args) {

        cons1.length = 2; // length static atandigi icin degeri her obje de degisiklik gosterir burada 2 oldu
        cons2.length = 8; // length her obje icin 8 oldu

        System.out.println(cons1.length); //8 yazdirir
    }
}
/**
 * A. 02
 * B. 08
 * C. 2
 * D. 8
 * E. Kod calismaz.
 * F. Kod calisir ancak exception olusur.
 */

