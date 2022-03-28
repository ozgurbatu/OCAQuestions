package Day19;
public class Q01 {
    public static void main(String[] args) {
        int x = 6;
        while (isAvailable (x)) {
           // 5'ten yazdirmaya basladigi icin once azalip sonra yazdirmasi gerekir bu yuzden cevap = A


        }}
    public static boolean isAvailable (int x) {
        return --x > 0? true:false;

    }
}


//which modification enables the code to print 54321?
	/*
	 *  A. Replace line 6 with System.out.print (--x);
		B. At line 7, insert x --;
		C. Replace line 5 with while (is Available(--x)) {
		D. Replace line 12 with return (x > 0) ? false : true;

		Answer: A
	 */