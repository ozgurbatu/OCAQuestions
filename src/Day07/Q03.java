package Day07;

public class Q03 {
    public static void main(String[] args) {
        int array1 [] = {1, 2, 3};  // 1 2 3
        int array2 [] = new int[5]; // 0 0 0 0 0

        array2 = array1; // arrayler referans tipli olduklari icin  --> array2 degerleri = 1 2 3 olur

        for (int i : array2) {
            System.out.print(i + " "); // 1 2 3
        }
        System.out.println(); // alt satira gecer
        int array3 [] = new int[3];
        array3 = array2; // ayni sekilde array3 = 1 2 3 olur

        for (int i : array3) {
            System.out.print(i + " ");  // 1 2 3
        }
    }
}
//What is the result?
//A.	1 2 3 0 0
//      1 2 3 0 0
//B.	An Exception is thrown at run time.
//C.	1 2 3 0 0
//      1 2 3
//D.	1 2 3
//      1 2 3