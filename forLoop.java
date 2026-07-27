// public class forLoop {
//     public static void main(String[] args) {
//         int num  = 10;
//         for(int i = 1; i <= num ; i++){
//             System.out.println(i);
//         }
//     }
// }

public class forLoop {

    public static void main(String[] args) {

        int i, j;

        for (i = 2; i <= 25; i++) {
            for (j = 2; j <= (i / j); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > (i / j)) {
                System.out.println((i));
            }
        }
    }
}