package Day25;

public class Q02 {

    public static void main(String[] args) {
        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) { // i=1 i=0
            for (int j = n[i].length - 1; j >= 0; j--) { //j=1 j=0
                System.out.print(n[i][j]);
            }
        }
    }
}


//What is the result?
//
//		Answer: 4231