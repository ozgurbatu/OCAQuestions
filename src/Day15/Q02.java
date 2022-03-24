package Day15;

public class Q02 {


}

class Caller {
    private void init() { //private cannot access
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
        //  c.start(); // Class icersindeki methodlar private oldugunda sadece o cllastan ulasilabilir Bu yuzden CTE verecektir
        // c.init(); // Yoruma ben aldim
    }
}

//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.
//Answer: D

