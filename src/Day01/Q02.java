package Day01;

public class Q02 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5 ; // islem onceligi oldugu icin ilk basta bolme yapilir
                            // i/5=2 daha sonra int k= j += 2 j=22 k=22
        System.out.println(i + " : " + j + " : " + k); // 10 : 22 : 22
    }
}
