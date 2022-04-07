package Day29;

public class Q01 {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];
        bool[0] = Boolean.parseBoolean("true"); // string'i bloean'a cevirir
        bool[1] = null; //null in bir degeri olmadigi icin false donusur

        System.out.println(bool[0] + " " + bool[1]);// true false

    }
}


/**

// What is teh result?
// A True False
//B. True null
//C. Compilation fails
//D. A NullPointerException is thrown at runtime
 */
