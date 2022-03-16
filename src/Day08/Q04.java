package Day08;

public class Q04 {
    public static void main(String[] args) {
        int data [] = {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;
        for (int e : data) {
            if (e !=key) {
                continue; // datadan gelen veri ve key esit olmadigi durumda if body'si calisacak
                //count++; // continue dan sonra islem yapilmayacagi icin bu satir CTE verir
            }
        }
        System.out.println(count + " Found");
    }

}
//What is the result?
//A.	Compilation fails.
//B.	0 Found
//C.	1 Found
//D.	3 Found