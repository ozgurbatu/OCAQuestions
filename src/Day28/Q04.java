package Day28;

public class Q04 {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        int sayac=1;
        while(count++ < 3) {//0
            int y = (1 + 2 * count) % 3;//0 2 7%3=1
            switch(y) {
                default:
                case 0: x -= 1; break; //2 1
                case 1: x += 5;//1+5=6
            }
        }
        System.out.println(x);
    }
}
/**
        A. 4
        B. 5
        C. 6
        D. 7
        E. 13
        F. 11.satirdan dolayi kod calismaz

 */
