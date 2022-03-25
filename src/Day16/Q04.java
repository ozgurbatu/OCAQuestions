package Day16;

public class Q04 {
    public static void main(String[] args) {
        int ii=0;
        int jj=7;
        for(ii=0; ii<jj; ii+=2) { // 0<7 2<7 4<7 6<7
            System.out.print(ii+" ");  // 0 2 4 6
        }

        System.out.println();

        //second version

        for(ii=0;ii<jj-1;ii+=2) { // 7-1 =jj=6 6 dan kucuk olmadigi icin 6 yi yazdirmaz
            System.out.print(ii+" "); // 0 2 4
        }
    }
}

