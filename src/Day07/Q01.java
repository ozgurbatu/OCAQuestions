package Day07;

import java.util.ArrayList;

public class Q01 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null); // arrayList imize butun degerleri ekler
        points.remove(1); // int degerlere sahip bir arraylist'te remove methodu index'i siler
        points.remove(null);  // listte null degeri oldugu icin onu da silecektir
        System.out.println(points); // 1,3,4

    }
}
