import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());


            for (int j = 0; j < T; j++) {

                String S = br.readLine();
                String array[] = S.split(" ");

                double avr = 0;
                int sum = 0;
                int arrayScore[] = new int[array.length - 1];
                for (int i = 0; i < arrayScore.length; i++) {
                    arrayScore[i] = Integer.parseInt(array[i + 1]);
                    sum += arrayScore[i];
                }
                avr = (double) sum / arrayScore.length;

                int number = 0;
                for (int i = 0; i < arrayScore.length; i++) {
                    if (arrayScore[i] > avr) {
                        number++;
                    }
                }

                bw.write(String.format("%.3f", (double) number * 100 / arrayScore.length)+"%\n");
            }

            bw.flush();
            bw.close();

        } catch (IOException e) {
        }
    }
}
