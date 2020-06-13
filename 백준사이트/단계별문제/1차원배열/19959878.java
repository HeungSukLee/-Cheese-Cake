import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] array = new int[10];
            int[] arrayrest = new int[42];

            for (int i = 0; i < 10; i++) {
                array[i] = Integer.parseInt(br.readLine());
                array[i] = array[i] % 42;
            }


            for (int i = 0; i < 42; i++) {
                arrayrest[i] = 0;
            }
            for (int i = 0; i < 10; i++) {
                arrayrest[array[i]]++;
            }


            int num = 0;
            for (int i = 0; i < 42; i++) {
                if (arrayrest[i] != 0) {
                    num++;
                }
            }

            System.out.println(num);

        } catch (IOException e) {
        }
    }
}