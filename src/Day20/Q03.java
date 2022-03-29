package Day20;

public class Q03 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";   //object ile string i karsilastiramiyoruz. Karsilastirma yapmamiz icin toStiring kullanmamiz lazim

        if (sb.toString().equals(s.toString())){ //StringBuilder classinda equals methodu yok,bu yuzden tostring ile string e cevirmemiz lazim
            System.out.println("Match 1");
        }else if(sb.equals(s)){
            System.out.println("Match 2");
        }else {
            System.out.println("No Match");
//

        }
    }
}
		/*
		/What is the result?
		A. Match 1
		B. Match 2
		C. No Match
		D. A NullPointerException is thrown at runtime.

		Answer: A
		*/

//second version
//StringBuilder sb = new StringBuilder(5);
//String s = "";
//if (sb.equals(s)){
//  System.out.println("Match 1");
//}else if(sb.toString().equals(s.toString())){
//  System.out.println("Match 2");
//}else {
//  System.out.println("Not Match");
//}

//third virdsion
//StringBuilder sb = new StringBuilder("Java");
//String s = "Java";
//if(sb.equals(s)){
//  System.out.println("Match 1");
//}else {
//  System.out.println("Not Match");
//}
