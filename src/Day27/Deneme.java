package Day27;

public class Deneme {
    int x = 10, y;

    Deneme() {
        System.out.print(x * y); //10*0=0 yazdirir ilk basta
        System.out.println();
    }

    Deneme(int x, int y) { // 4, 5
        this(); //Deneme() buraya gider
        this.x = x; // x'in yeni degeri 4
        this.y = 10; // y'nin yeni degeri 10
        System.out.print(x * y); // 20 yazdirir 2.adim
        System.out.println();
    }

    Deneme(int x, int y, int z) { // 3, 4, 5
        this(y, z); //  Deneme(4,5)
        this.x = x; // 3.adim x=3
        this.y = y; // y=4
        System.out.print(x * z); // 3*5=15
        System.out.println();
    }

    public static void main(String[] args) {
        Deneme dnm = new Deneme(3, 4, 5);
        System.out.print(dnm.x * dnm.y); /// 4.adim en son x=3 y=4 idi = 12 olur
    }

}
