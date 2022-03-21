package Day12;

public abstract class Toy {

}

// 54. You are asked to develop a program for a shopping application, and you are given this information:

//			The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass of the other two classes.
//			The int calculatePrice (Toy t) method calculates the price of a toy.
//			The void printToy (Toy t) method prints the details of a toy.
// 		Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

// A. Cevap
//		public abstract class Toy{										// abstract class
//		public abstract int calculatePrice(Toy t);						// abstract methodlar bdoy icermez
//		public void printToy(Toy t) { /* code goes here*/}				// concrete methods body icerir
//	}


// B.
//		public abstract class Toy{
//		public  int calculatePrice(Toy t);		// concrete methods body icerir olmadigi icin eror verir
//		public void printToy(Toy t);			// concrete methods body icerir olmadigi icin eror verir
//	}

// C.
//		public abstract class Toy{
//		public  int calculatePrice(Toy t);	// concrete methods body icerir olmadigi icin eror verir
//		public final void printToy(Toy t) { /* code goes here*/}
//	}


// D.
//		public abstract class Toy{
//		public abstract int calculatePrice(Toy t) { /* code goes here*/}	// abstract method body icermez
//		public abstarct void printToy(Toy t) { /* code goes here*/}			// abstract method body icermez
//	}


