package Day16;

public class Q02 {

}
class Test2 {
    public static void main(String[] args) {
        Test2 ts = new Test2();
        System.out.print(isAvailable+""); // once burayi yazdirir false olarak
        isAvailable = ts.doStuff(); // yeni bir atama yapilmis method'a gider true olarak geri doner
        System.out.println(isAvailable); // true yazdirir

    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable = false;
}
	/*
	What is the result?
	A.	Compilation fails.
	B.	false true ++++++
	C.	true false
	D.	true true
	E.	false false

	 */

