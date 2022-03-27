package Day17;

import java.util.Scanner;

public class ExtraAJavaSorusu {

    //Java dilini kullanarak, PowersofTwo(num) methodu yaziniz. Kullanicidan gelen integer tipindeki datayi methodda parametre olarak kullanin
    //  * alinan sayi ikinin kuvveti ise  true döndürün.
    //  *
    //  * Değilse,  false döndürün
    //  *
    //  * Örneğin, giriş 16 ise, programınız sonucu true olarak döndürmelidir.
    //  *veya girdi 22 ise sonuc false olmalıdır.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        PowersofTwo(num);
    }

    private static void PowersofTwo(int num) {

        if (num%2==0) {
            num /=2;
            if (num == 1) {
                System.out.println("Girilen sayi 2'nin katidir");
            }else{
                PowersofTwo(num);
            }

        }else{
            System.out.println("Girilen sayi 2'nin kati degildir");
        }
    }

}
