package Day28;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);//6
        list.add(array[2]);//6,8
        list.set(1, array[1]);//6,9
        list.remove(0);//9
        System.out.println(list);//9
    }
}
        /**
        A. [8]
        B. [9]
        C. [Ljava.lang.String;@160bc7c0 turu bir sonuc
        D. Kod calistirilirsa exception olusur.
        E. Kod calismaz.
        */
