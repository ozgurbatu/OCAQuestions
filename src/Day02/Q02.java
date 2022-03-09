package Day02;

public class Q02 {
    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) { // arr.length=2
            for (int j = 0; j < arr[i].length; j++) { //arr[0].length=3 arr[1].length=2
                System.out.print(arr[i][j]+ " " );
                if (arr[i][j].equals("B")) {
                    continue; //bir etkisi yok
                }
            }
            continue;
        }
    }
}
//What is the result?
//A.    A B C
//B.	A B C D E
//C.	A B D E
//D.	Compilation fails.
