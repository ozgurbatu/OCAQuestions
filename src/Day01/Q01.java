package Day01;

public class Q01 {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        if (x++ < ++y) { // x bu satirda post increment oldugu icin degeri 1 bu satirdan sonra 2 olur
                        //  y ise pre increment oldugundan bu satirda dahil degeri 2 olur
                        // bu yuzden if'in icindeki sart true olur ve consol'da Hello gorunur
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y); // Log 2 : 2

    }
}
