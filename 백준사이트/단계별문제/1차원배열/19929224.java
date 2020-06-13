
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String T = bf.readLine();
            int num = Integer.parseInt(T);

            String R = bf.readLine();
            String[] arrayString = R.split(" ");

            int[] arrayInt = new int[num];
            for (int i = 0; i < num; i++) {
                arrayInt[i] = Integer.parseInt(arrayString[i]);
            }



            for (int i = 0; i < arrayInt.length-1; i++) {
                if (arrayInt[i] < arrayInt[i + 1]) {
                    int tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[i + 1];
                    arrayInt[i + 1] = tmp;
                }
            }
            bw.write(String.valueOf(arrayInt[arrayInt.length - 1]));

            for (int i = 0; i < arrayInt.length-1; i++) {
                if (arrayInt[i] > arrayInt[i+1]) {
                    int tmp = arrayInt[i];
                    arrayInt[i] = arrayInt[i + 1];
                    arrayInt[i + 1] = tmp;
                }
            }
            bw.write(String.valueOf(" "));
            bw.write(String.valueOf(arrayInt[arrayInt.length - 1]));


            bw.flush();
            bw.close();
        } catch (IOException E) {
        }
    }
}
