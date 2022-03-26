package Day17;

public class Q02 {

}
class A {
    public A() {
        System.out.println("C "); // ilk calisan yer burasi olur
    }
}


class B extends A {
    public B(){     //line n1 // default super() oldugundan parent class'a gider A class'na // ikinci calisir
        System.out.println("B ");
    }
}


class C extends B {
    public C(){      // line n2 // default super() oldugundan parent class'a gider B class'ina
        System.out.println("A "); // ucuncu calisir
    }
    public static void main(String[] args) {
        C c = new C(); //constructor run edilirken  parent to child class gider // C B A
    }
}
    /**
    What is the result?
    A. C B A
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2

     */

