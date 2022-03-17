package Day09;

class Animal{
    String type = "Canine";
    int maxSpeed = 60;

    Animal() {}

    Animal (String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
class WildAnimal extends Animal{
    String bounds;

    WildAnimal (String bounds) {
        // line n1

    }
    WildAnimal(String type, int maxSpeed, String bounds) {
        // line n2

    }
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long"); // line n1 kisminda ayni classta oldugu icin this.bounds tanimlanmali
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
                                        // type ve maxSpeed parent classta o yuzden onlarida super(type,maxSpeed) oalarak gondermeli
                                        // o yuzden Line n2 satirina super yazilmali ve bounds icin this.bounds yazilmali
        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds); // Canine 60 Long
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds); // Feline 80 Short
    }
}
/*
Which two modifications enable the code to print the following output? (Choose Two)
	Canine 60 Long
	Feline 80 Short

A. Replace line n1 with:
	super();
	this.bounds = bounds;

B. Replace line n1 with:
	this.bounds = bounds;
	super ();

C. Replace line n2 with:
	super(type, maxSpeed);
	this (bounds)

D. Replace line n1 with:
	this("Canine", 60);
	this.bounds = bounds;

E. Replace line n2 with:
	super(type, maxSpeed);
	this.bounds = bounds;

Answ: A, E
*/
