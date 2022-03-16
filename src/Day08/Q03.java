package Day08;

public class Q03 {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " " ); // A yazdirir if sarti saglanmadigi icin icine girmez
                                            // Work Done yazdirir ve donguyu kirar
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work Done");
            break;
        }
    }
}
//What is the result?
//A.	A B C Work done
//B.	A B C D Work done
//C.	A Work done
//D.	Compilation fails