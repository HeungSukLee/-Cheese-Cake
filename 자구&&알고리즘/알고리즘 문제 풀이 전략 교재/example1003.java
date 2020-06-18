import java.util.*;

public class example1003 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("최대공약수를 구할 두 수를 입력하세요.");
        int N1 = scan.nextInt();
        int N2 = scan.nextInt();

        int min = N1;
        int gcd = 1;
        if (N1 > N2) min = N2;
        if (N1 < N2) min = N1;

        while (true) {
            for (int i = 2; i < min + 1; i++) {
                if ((N1 % i) == 0 && (N2 % i == 0)) {
                    N1 = N1 / i;
                    N2 = N2 / i;
                    min = min / i;
                    gcd = gcd * i;
                    if (min == 1) {
                        System.out.print("최대공약수: " + gcd);
                        System.exit(0);
                    }
                    break;
                } else {
                    if (min == i) {
                        System.out.print("최대공약수: " + gcd);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
