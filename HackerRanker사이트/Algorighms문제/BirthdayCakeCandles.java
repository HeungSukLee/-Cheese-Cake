import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if (arr[i] == arr[N - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

