package Day03;

class Vehicle{
    int x;
    Vehicle(){
        this(10);			// line n1
    }
    Vehicle(int x){
        this.x= x;  // super(20) buraya gelir ve x'in degeri 20 olur
    }
}
class Car extends Vehicle{
    int y;
    Car(){
        super(10);		// line n2
    }
    Car(int y){
        super(y);//super(20) olarak parents class a gider
        this.y =y; // bu classtaki y'nin degeri 20 olur
    }
    public String toString() {
        return super.x + ":" + this.y; // 20:20
    }
    public static void main(String[] args) {
        Vehicle y = new Car(20);


        System.out.println(y);
    }}

// What is the result?
//		 A.	Compilation fails at line n2.
//		 B.	Compilation fails at line n1.
//		 C.	20:20
//		 D.	10:20


