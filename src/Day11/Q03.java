package Day11;

public class Q03 {

    //  Which two code fragments cause compilation errors? (Choose two.)
    public static void main(String[] args) {
        double y1 = 203.22;
        //float fit = y1; //double'dan float'a cevirilmez

        float fit1 = (float) 1_11.0;

       //Float fit2  =  100.00; 	// castin islemi yapilmasi gerekir yoksa hata verir

        int y2 = 100; float fit3= (float)y2;

        float fit4 = 100.00F;
    }
}
