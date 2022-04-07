package Day29;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A", "B", "C", "D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next(); // A B C
            System.out.println(e);// A B C
            if (e == "C") {
                break;

            } else {
                //continue;
                System.out.println(e); // A B
            }
        }

    // A A B B C
    }
}
