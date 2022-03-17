package Day09;

public class Q04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("A");
        System.out.println("before delete: " + sb); // AAAA

        sb.delete(2, sb.length()); // sb.delete(2, 4); 2 dahil 4 haric arasindakileri siler 2,3 --> AA

        System.out.println("after delete: " + sb); // AA

    }
}
