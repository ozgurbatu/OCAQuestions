package Day28;

public class Q03 {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        Q03.addToInt(a, b);
        System.out.println(a); // int a = 15; burada ki degeri gelir 15
    }
}

        /**
        A. 10
        B. 15
        C. 25
        D. 5.satirdan dolayi kod calismaz
        E. 10.satirdan dolayi kod calismaz
        F. Yukaridakilerden hicbiri.
         */
