package Day19;

public class Q03 {
    public static void main(String[] args) {

        Short s1 =200;
        Integer s2 = 400;
        Long s3 = (long) s1+s2;   // line 1 	// wrapper oldugu icin casting yapilmali. primitive olsaydi casting'e gerek yoktu
        // String s4 = (String) (s3 * s2); 	//line 2  //string numberla çasting yapilamaz String methodlari kullanilarak yazilmali
        //System.out.println("Sum is "+ s4); 	// Cannot cast from long to String
    }

	/*
		 What is the result?
		A. Sum is 600
		B. Compilation fails at line n1.
		C. Compilation fails at line n2.
		D. A ClassCastException is thrown at line n1.
		E. A ClassCastException is thrown at line n2.
		Answer: C
	 */

}
