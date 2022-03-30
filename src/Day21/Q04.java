package Day21;

public class Q04 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" "); // A B C D yazdirir
            if(arr[i].equals("D")){
                System.out.println("Work done"); // if'in ici true olunca Work done yazip cikiyor
                break;
            }
            continue;
        }
    }
}
/**
What is the result?
A. A B C Work done
B. A B C D Work done
C. A Work done
D. Compilation fails

 */