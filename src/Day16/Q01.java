package Day16;

public class Q01 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x; // y=11 x=11
        int z = 0;

        if(y >= 10 | y<= ++x){ // x=12 olur
            z = x; // z=12
        }else {
            z = x++;
        }
        System.out.println(z);
    }

}
/*
What is the result?
A. 11
B. 10
C. 12
D. A compile time error occurs.
 */