package Day29;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q02 {
    public static void main(String[] args) {

        LocalDateTime dt =LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30); // atama islemi olmadigi icin bir degisiklik olmaz
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME)); // 2014-07-31

		/**
		 What is the result?  ( Answer C --> 2014-07-31 )

			A. An exception is thrown at runtime.
			B. 07-31-2014
			C. 2014-07-31
			D. 2014-09-30

		 */

    }
}


