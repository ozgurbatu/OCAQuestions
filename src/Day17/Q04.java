package Day17;

public class Q04 {
    //81. Which two code fragments cause a compilation error? (Choose two.)
    public static void main(String[] args) {
				 /*
		        Which two code fragments cause a compilation error?(Choose two.)
		        A.float flt=100.00F;
		        B.float flt=(float)1_11.00;
		        C.Float flt=100.00;
		        D.double y1=203.22; float flt=y1;
		        E.int y2=100;float flt=(float)y2;
		        Answer:AD
		         */
        //A.
        float flt=100.00F;
        //B.
        float flt2=(float)1_11.00;
        //C.
        Float flt3=100.00f;
        //D.
        double y1=203.22;
        //float flt4=y1; // cast'in islemi yapilmasi gerekir
        //E.
        int y2=100;
        float flt5=(float)y2;
    }
}
