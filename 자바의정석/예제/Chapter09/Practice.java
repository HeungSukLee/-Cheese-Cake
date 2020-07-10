import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int min;
        int gcd = 1;

        if (A > B) {
            min = B;
        } else {
            min = A;
        }

        //min = Math.min(A, B);

        loop: while (true) {
            for (int i = 2; i <= min; i++) {
                if ((A % i == 0) && (B % i == 0)) {
                    gcd = i * gcd;
                    min = min / i;
                    A = A / i;
                    B = B / i;
                    break;
                }else{
                    System.out.println(A);
                    System.out.println(B);
                    System.out.println(min);

                    break loop;
                }
            }
        }

        System.out.print(gcd);
    }
}
