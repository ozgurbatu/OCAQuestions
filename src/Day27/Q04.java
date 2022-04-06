package Day27;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        String str = "Java";
        int arr[] = {1, 2, 3};
        method1(str);
        method2(arr);
        System.out.println(Arrays.toString(arr)); // 1,4,3
        method3(arr); // bulundugu skop icin gecerli
        System.out.println(Arrays.toString(arr)); //1,4,3
        System.out.println(str); //Java
    }

    private static void method3(int[] arr) {
        int yeniArr[] = {10, 11, 12, 13};
        arr = yeniArr;
    }

    private static void method2(int[] arr) {
        arr[1] = 4;
        arr[2] = 3;
    }

    private static void method1(String str) {
        str = str.toUpperCase();
    }

}