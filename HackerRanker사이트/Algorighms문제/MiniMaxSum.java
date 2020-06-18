import java.io.*;
import java.util.Scanner;
public class MiniMaxSum {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        long[] arrN = new long[5];
        for (int i = 0; i < 5; i++) {
            arrN[i] = scanner.nextLong();
        }
        long sum = 0;
        long min = arrN[0];
        long max = arrN[0];
        for (int i = 0; i < 5; i++) {
            sum = sum + arrN[i];
            if (arrN[i] < min)
                min = arrN[i];
            if (arrN[i] > max)
                max = arrN[i];
        }
        System.out.print(sum - max);
        System.out.print(" ");
        System.out.print(sum - min);
    }
}
