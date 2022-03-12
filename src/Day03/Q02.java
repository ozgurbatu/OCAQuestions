package Day03;

public class Q02 {
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }

    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }

    public static void doSum(int x, int y) {
        System.out.println("int sum is " + (x + y));
    }

    public static void main(String[] args) {
        doSum(10,  20); // doSum(int x, int y) bu methoda dogrudan gider
        doSum(10.0,  20.0); // degerler double oldugu icin parametresi double olan doSum(double x, double y) methoda gider
        // int sum is 30
        // double sum is 30.0 sonucu yazdirilir
    }
}
/*

 A. int sum is 30
 	float sum is 30.0

 B. int sum is 30
 	double sum is 30.0

C. Integer sum is 30
 	double sum is 30.0

A. Integer sum is 30
 	float sum is 30.0

 */
