package Day30;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " "); //apple banana grapes pears

        }

    }
}

    /**
        A) apple banana grapes pears
        B) pears grapes banana apple
        C) banana apple pears grapes
        D) Kod calismaz
     */
