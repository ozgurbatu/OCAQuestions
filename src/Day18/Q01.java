package Day18;

public class Q01 {

}
class Alpha{

    int ns; //1=50 2=125 3=0
    static int s; // 50 125

    Alpha(int ns){
        if(s<ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = "+ns+" s = "+s);
    }
}
class TestA{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);

        ref1.doPrint(); //ns= 50 s= 125
        ref2.doPrint(); //ns= 125 s= 125
        ref3.doPrint(); //ns= 0 s= 125
    }

}
//What is the result?
//A
//            ns = 50   s = 125
//            ns = 125  s = 125
//            ns = 100  s = 125

//B
//            ns = 50  s = 125
//            ns = 125  s = 125
//            ns = 0  s = 125

//C
//            ns = 50  s = 50
//            ns = 125  s = 125
//            ns = 100  s = 100

//D
//            ns = 50  s = 50
//            ns = 125  s = 125
//            ns = 100  s = 125

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: B
