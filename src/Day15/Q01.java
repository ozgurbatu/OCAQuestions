package Day15;

interface I {
    public void displayI();
}

abstract class C2 implements I {
    public void displayC2() {
        System.out.print("C2");
    }
}


class C1 extends C2 {
    public void displayI() {
        System.out.print("C1");
    }
}

public class Q01 {
    // And the code fragment:
    public static void main(String[] args) {

        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = obj1;
        t.displayI(); //C1
        s.displayC2(); // C2

    }
}
//What is the result?
//A. C1C2
//B. C1C1
//C. Compilation fails.
//D. C2C2


