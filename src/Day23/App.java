package Day23;

public class App {
    String myStr = "9009";

    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str; // myStr=7007 bu sadece try icinde boyle
            myNum = Integer.parseInt(myStr); // 7007
        }catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: "+myNum); // myStr: 9009, myNum: 7007

    }
    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");

    }
}
