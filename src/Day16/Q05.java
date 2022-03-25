package Day16;

public class Q05 {
    //59. Given this array:
    //Which two code fragments, independently, print each element in this array? (Choose two.)
    public static void main(String[] args) {
        int[] intArr = {8, 16, 64, 128};

        // A
//        for (int i : intArr){
//            System.out.println(intArr[i] +" ");  // intArr[i] seklinde yazilamaz
//                                                 // cunku ilk eleman intArr[8] olarak doner ve exception firlatir
//        }

        // B
        for (int i : intArr){
            System.out.println(i +" "); // her bir elemani yazdirir
        }

        // C
//        for (int i = 0 : intArr){ // CTE verir
//            System.out.println(intArr[i] +" ");
//            i++;
//        }

        // D
 //       for(int i = 0; i < intArr.length; i++) {
 //           System.out.println(i + " ");//--> 0 1 2 3 yazdirir
 //       }

        //E
        for(int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");//--> intArr[0] diye baslayacak length'e kadar yazdiracak 8 16 64 128
        }

        // F
//        for(int i ; i < intArr.length; i++) {//--> gives error at this line
//            System.out.println(intArr[i] + " ");
//        }
    /*
    A. Option A
    B. Option B ++++++
    C. Option C
    D. Option D
    E. Option E ++++++
    F. Option F

     */

    }

}
