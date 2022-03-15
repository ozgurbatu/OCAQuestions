package Day07;

public class Employee {
    String name;
    boolean contract;
    double salary;
    Employee() {
        //line1

    }
    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        // line2
        System.out.println(e);
    }
}
/*
  Which two modifications, when made independently, enable the code to print joe:true:100.0 ? ( Choose Two)

  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;

		B: Replace line2 with:
		 	this.name = "Joe";  		// name static olmali
		 	this.contract = true;
			this.salary = 100;

		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);

		D: Replace line n1 with:
		 	name = "Joe";
		 	contract = TRUE;  		// Boolean bir deger boyle yazilamaz
			salary = 100.0f;

		E: Replace line n1 with:
			this("Joe", true, 100);  	// 3 parametreli const. cagirir

 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
 her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir

 */