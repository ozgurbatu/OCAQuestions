package Day16;

import java.time.LocalDate;

public class Q03 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2012, 1, 30);
        date.plusDays(10); // atama yapilmadigi icin tarihe etkisi olmaz
        System.out.println(date); // o yuzden ayni tarihi tekrardan yazdirir
    }

}
/**
 * What is the result?
 A. 2012-02-10 00:00
 B. 2012-01-30
 C. 2012-02-10
 D. A DateTimeException is thrown at runtime.
 */
