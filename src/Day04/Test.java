package Day04;

public class Test {
    int x, y;

    public Test(int x, int y) {
        initialize(x, y); //initialize(int x, int y) x=3 y=5 olarak parametreye gider
    }

    public void initialize(int x, int y) {
        this.x = x * x; // bu classtaki x=9
        this.y = y * y; // bu classtaki y=9
    }

    public static void main(String[] args) {
        int x = 3, y =5;
        Test objTest = new Test(x, y); // Test(3,5) parametreli const.'a gider
        System.out.println(x + " " + y); // main method'un icinde x ve y yeni bir variable olarak atanmis
                                         // obje ile alakali bir islem yapilmadigi icin 3 5 yazdirir
    }
}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25