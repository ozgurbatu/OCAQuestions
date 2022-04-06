package Day28;

public class Q01 {
    public static void main(String[] args) {
        int x = 5, j = 0;

        for (int i = 0; i < 3; ) //i=0 i=1 i=2
            do {
                i++; //i=1 =2 =3
                x++; //x=6 11 12
                if (x > 10) break; //x 10'dan buyuk oldugunda do-while dongusunden cikacak //11 donguden cikti // 12 donguden cikti
                x += 4; // x=10 oldu
                j++; // y=1
            } while (j <= 2); //y 2 den kucuk ve eesit oldugunda do-wile dongusunden cikacak
        System.out.println(x); //x=1 ilk adimda 2.adim 11 3.adim 12
    }
}
/**
 * A. 10
 * B. 12
 * C. 13
 * D. 17
 * E. 6.satirdan dolayi kod calismaz
 * F. 8.satirdan dolayi kod calismaz
 */
