package Day13;

public class Q01 {
    public static void main(String[] args) {
        String string = " "; // deger olarak bosluk atanmis hiclik degildir
        string.trim(); // string te atama yapilmadigi icin etkilemez
        System.out.println(string.contentEquals("") + " " + string.isEmpty()); // false false
    }
}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true
