package Day04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q02 {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30); // atama yapilmadigi icin etkisi olmaz
        dt.plusMonths(1);  // atama yapilmadigi icin etkisi olmaz
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE)); // tarih formatinda istedigi icin sadece tarih yazdirir
    }
}
//What is the result?
//A.	An exception is thrown at runtime.
//B.	07-31-2014
//C.	2014-07-31 -> cevap
//D.	2014-09-30

