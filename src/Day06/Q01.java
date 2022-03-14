package Day06;

public class Q01 {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {1, 2, 3, 4, 5};
        nums2 = nums1; // arrayler referans tipli olduklari icin nums2 referansini birakip nums1'in refereransini alir
        for (int x : nums2) { // 1: 2: 3:
            System.out.print(x + ": ");
        }
    }
}

//What is the result?
//A. 1:2:3:4:5:
//B.	1:2:3:
//C.	Compilation fails.
//D.	An ArrayOutOfBoundsException is thrown at runtime.
//B answer