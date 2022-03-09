package Day02;

public class Q04 {
    public static void main(String[] args) {
        int var1 = 200;
        System.out.print(doCalc(var1)); // doCalc(200) method'tan donusu 400 olur
        System.out.print(" " + var1); // local deki var1 degerini yazdirir o da 200
    }
    static int doCalc(int var1) {
        var1 = var1 * 2;
        return var1;
    }
}
//What is the result?
//A.	400 200
//B.	200 200
//C.	400 400
//D. Compilation fails.
