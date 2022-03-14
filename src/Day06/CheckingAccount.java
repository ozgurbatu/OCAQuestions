package Day06;

public class CheckingAccount {
    public int amount;
    // line n1


    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        // line n2
        System.out.println(acc.amount);
    }
}
/*
 * 		Which three pieces of code, when inserted independently, set the value of amount to 100?

 	A. At line n1 insert:
 		public CheckingAccount(){
 		amount = 100; // ilk constr. a gidecegi icin bu degeri alir ve amount a atama yapar
 		}

 	 B. At line n2 insert:
 		this.amount = 100; // amount'un static olmasi gerekir yoksa bu sekilde ulasilamaz

 	 C. At line n2 insert:
 		amount = 100; // amount'un static olmasi gerekir yoksa bu sekilde ulasilamaz

 	 D. At line n1 insert:
 		public CheckingAccount(){
 		this.amount = 100; // bu da tek basina yazilsa 100 yazdirir
 		}

 	 E. At line n2 insert:
 		acc.amount = 100;  // bu da tek basina yazilsa 100 yazdirir

 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100; // acc asagida atanmis o yuzden yukaridan ulasilamaz
 		}

 */



