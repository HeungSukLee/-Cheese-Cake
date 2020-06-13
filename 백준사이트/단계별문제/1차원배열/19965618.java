import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                String S = br.readLine();
                bw.write(String.valueOf(score(S)) + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }
    }

    static int score(String S) {
        int sum = 0;
        int num = 0;
        int k = 0;
        S = S + "AA";
        //System.out.println(S.charAt(0));
        while (S.charAt(k) != 65) {
            if (S.charAt(k) == 79) {
                sum = sum + ++num;
            } else {
                num = 0;
            }
            k++;
        }
        return sum;
    }
}