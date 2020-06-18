import java.io.*;
import java.util.Scanner;
public class Staircase {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        char[][] arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + j >= N-1) {
                    arr[i][j] = '#';
                }else {
                    arr[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}



