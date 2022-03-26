package Day17;

public class Q01 {
    public static void main(String[] args) {
        String str1="Java";
        String []str2= {"J", "a","v","a"};
        String str3="";
        for (String str:str2) {
            str3=str3+str; //Java
        }
        boolean b1= (str1.equals(str3)); // true equals sadece degere bakar
        boolean b2=(str1==str3); // false == hem referans'a hem de degere bakar
        System.out.println(b1+", "+b2);
    }

}
/**
 * What is the result?
 A. false, false
 B. false, true
 C. true, false
 D. true, true
 */