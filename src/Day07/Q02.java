package Day07;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")) { // Bran (ilk gordugunu) ismini kaldiricak bize true dondurecek bu yuzden if'in ici calisacak
            names.remove("Jon");  //  Jon'u da listeden silecektir
        }
        System.out.println(names); // Robb, Rick, Bran
    }
}
//What is the result?
//A.	[Robb, Rick, Bran]
//B.	[Robb, Rick]
//C.	[Robb, Bran, Rick, Bran]
//D.	An exception is thrown at runtime.
