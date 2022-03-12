package Day03;

public class Q04 {
    public static void main(String[] args) {
        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1);
        System.out.println(str2);
    }
}
// "Sweat Sweat" oncesinde ve sonrasinda bosluk olmadigi icin trim() methodu etki etmez
// charAt(6)= S getirir bize
// str.indexOf("Sw", 1) 1. indexten sonraki Sw yi ilk buldugunda o indexi bize dondurecek  index sayilirken en bastan sayilmasi gerekir
// Sonuc= S 6

//What is the result?
//A.	S 6
//B.	S 5
//C.	s-1
//D.	w 7