package Day26;

public class Varargs {
    void m1(int a, int... b){

        System.out.println(b.length);
    }
    void m1(char c, String... d){
        System.out.println(d.length);
    } /*
    void m1(String... e, int f){ // varargs'ta boyle bir yazim yok String... e sonda olmak zorunda
        System.out.println(e.length);
    }*/

    public static void main(String[] args) {

        Varargs vrg=new Varargs();
        vrg.m1(3,4,5,6,7); // void m1(int a, int... b) buraya gider ve sonuc olarak 4 yazdirir
        vrg.m1('c',75,80,90); // void m1(int a, int... b) buraya gider ve sonuc olarak 3 yazdirir
        vrg.m1('d',"Hello");// void m1(char c, String... d) buraya gider ve sonuc olarak 1
    }
}
