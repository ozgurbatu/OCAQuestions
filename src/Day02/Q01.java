package Day02;

import java.io.IOException;

public class Q01 {
    static int i;
    int j;
    public static void main(String[] args) {
        Q01 x1 = new Q01();
        Q01 x2 = new Q01();
        x1.i= 3;
        x1.j = 4;
        x2.i= 5;
        x2.j = 6; // bu satirdan sonra static oldugu icin i degeri en son atamaya gore alinir i=5
                // j ise instance variable oldugundan her obje de atanan ilk degeri alir obje icerisinde degisiklik
                // yapildiginda o variable degeri o obje icin degismis olur burada x2.j=6 x1.j=4
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j); //5 4 5 6
    }
}
//What is the result?
//A.-3 4 5 6
//B.3 4 3 6
//C.5 4 5 6
//D.3 6 4 6
