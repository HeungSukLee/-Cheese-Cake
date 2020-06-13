import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int multi = 1;
            for (int i = 0; i < 3; i++) {
                int input = Integer.parseInt(br.readLine());
                multi = input * multi;
            }


            int[] number = new int[10];
            for (int i = 0; i < number.length; i++) {
                number[i] = 0;
            }

            while ((multi >= 1)) {
                number[multi % 10]++;
                multi = multi / 10;
            }

            for (int i = 0; i < number.length; i++) {
                bw.write(String.valueOf(number[i]) + '\n');
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
        }
    }
}