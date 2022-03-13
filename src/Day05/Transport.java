package Day05;

class Vehicle {
    Vehicle(){ // -->3
        System.out.println("Vehicle"); // -->4
    }
}
class Bus extends Vehicle{
    Bus(){ // class extends oldugundan const. icinde default super() vardir bu yuzden parent'in parametresiz const. gider-->2
        System.out.println("Bus");// -->5
    }
}
public class Transport {
    public static void main(String[] args) {
        Vehicle v = new Bus(); // Bus() const. gider // calisma sekli sayi ile--> 1
    }       // sonuc ilk Vehicle ikinci Bus yazdirir
}
//What is the result?
//A.	Vehicle
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
