package Day22;

class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A(); // new C()
        A b2=new C();

        b1=(A)b2;      //line1
        A b3=(B) b2;   //line2 cast'ing islemi yapilamaz A C'nin parent classi cast exception hatasi verir
        b1.test();
        b3.test();
    }
}
/**
 What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.

 */
