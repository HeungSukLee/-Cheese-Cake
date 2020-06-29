import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays2DD {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int tmpArr[][] = new int[3][3];
        int k = 0;
        int l = 0;
        int max = Integer.MIN_VALUE;

        while (l <= 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tmpArr[i][j] = arr[i + l][j + k];
                    sum += tmpArr[i][j];

                    if (i == 1 && j == 0) {
                        sum = sum - tmpArr[i][j];
                    }
                    if (i == 1 && j == 2) {
                        sum = sum - tmpArr[i][j];
                    }
                }
            }
            if (max < sum) max = sum;

            k++;
            if (k == 4) {
                k = 0;
                l++;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
