import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            String R = br.readLine();


            String[] array = R.split(" ");
            int[] arrayInt = new int[T];

            for (int i = 0; i < array.length; i++) {
                arrayInt[i] = Integer.valueOf(array[i]);
            }

            for (int i = 0; i < arrayInt.length-1; i++) {
                if (arrayInt[i] > arrayInt[i+1]) {
                    int tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[i + 1];
                    arrayInt[i + 1] = tmp;
                }
            }

            double sum = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                sum += (double)arrayInt[i] /(arrayInt[arrayInt.length - 1]) * 100;
            }

            bw.write(String.valueOf(sum /T));
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }
    }
}