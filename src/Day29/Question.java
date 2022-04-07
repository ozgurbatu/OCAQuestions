package Day29;

public class Question {

    //public	class Fieldint{
    char c;
    boolean b;
    float f;
    void printAll() {
        System.out.println("c= "+c);//c=
        System.out.println("b= "+b);//b=false
        System.out.println("f= "+f);//f=0.0
    }


    public static void main(String[] args) {
        Question f=new Question();
        f.printAll();
    }

}
