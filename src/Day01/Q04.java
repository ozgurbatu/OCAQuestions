package Day01;

public class Q04 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size =3;
        int idx = 0;

        do {
            idx++; // idx=1 idx=2
        }while(idx < size-1); // 1<2 2<2 donguden cikilir
        System.out.print("The top element: " + stack[idx]); // stack[2] = 30
    }
}

/*
  A. 	do {
			idx++; // idx=1 =2 =3
		}while(idx >= size); // 1>=3 2>=3 3>=3 idx'in degeri en son 3  stack[3] RTE veririr

	B. 	while(idx < size){  // 0<3  1<3 2<3 3<3
		    idx++; // 1 2 3 en son idx=3 oldu  stack[3] RTE veririr
		}

	C. 	do {
			idx++; // 1 2
		}while(idx < size-1); // 1<2 2<2 idx=2 oldu  stack[2] = 30

	D. 	do {
			idx++; // 1 2 3 4
		}while(idx <= size); // 1<=3 2<=3 3<=3 4<=3 idx=4 RTE verir

	E. 	while(idx <= size -1){ idx=0<=2 1<=2 2<=2 3<=2 idx=2 oldu stack[3] RTE
			idx++; // 1 2 3
           }
 */
