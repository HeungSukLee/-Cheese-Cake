import java.io.*;
import java.util.Scanner;
public class PRACTICE {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        int m = sc.nextInt();//21
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++)
            num[i] = sc.nextInt(); // 5 6 7 8 9

        int sum = 0;
        int tmp = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 1 + i; j < n - 1; j++) {
                {
                    for (int k = 1 + j; k < n; k++){
                        sum = num[i] + num[j] + num[k];
                        if (m - sum > 0 && sum >= tmp) {
                            tmp = sum;
                        } else if (sum == m) {
                            System.out.println(sum);
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}