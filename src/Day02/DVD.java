package Day02;

class CD{
    int r;
    CD (int r){
        this.r = r;
    }
}
public class DVD extends CD{
    int c;
    DVD(int r, int c){
        // line n1
        super(r);
        this.c = c;
    }
    public static void main(String[] args) {
        DVD dvd = new DVD(10,  20);
        System.out.println(dvd.r);
        System.out.println(dvd.c);
    }
}
/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;		// CD'de default const. olmadigi icin bu satri yazilamaz
	this.c = c;

B. super(r);
	this(c); // tek parametreli DVD(int c) olmadigi icin hata verir

C. super(r);
	this.c = c;

D. this.c = r;
	super(c); // super const. ilk satirda yazilmasi gerekir

*/
