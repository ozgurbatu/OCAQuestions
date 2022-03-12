package Day03;

public class Q01 {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx); //A element 0 B element 1 fakat atama veya yazdirma islemi yapilmadigi
                                                // icin bir etkisi olmayacak
            idx++; // idx en son deger olarak 2 olur
        }
        for (idx = 0; idx < strs.length; idx++) { // bu satirda idx'e 0 degeri atanmis
            System.out.println(strs[idx]); // strs[0]=A  strs[1]=B olarak yazdirir
        }
    }
}
//What is the result?
//A.	A
//		B
//B.	A element 0
//		B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0
//		B 1
