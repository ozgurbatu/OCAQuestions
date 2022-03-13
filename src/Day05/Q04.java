package Day05;

class A{
    public A() {
        System.out.print("A ");
    }
}
class B extends A{
    public B() {
        System.out.print("B ");
    }
}
class C extends B{
    public C() {
        System.out.print("C");
    }
    public static void main(String[] args) {
        C c = new C(); // C() const. gider extends oldugu icin bir ust class'a gider(parent class) bu yuzden A B C
    }
}

//What is the result?
//A.	C B A
//B.	C
//C.	A B C
//D.	Compilation fails at line n1 and line n2
