import java.math.BigInteger;
import java.util.Scanner;
public class VeryBigSum {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        BigInteger input = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i < N; i++) {
            input = scanner.nextBigInteger();
            sum = sum.add(input);
        }

        System.out.println(sum);
    }
}
