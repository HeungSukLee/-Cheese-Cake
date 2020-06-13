
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String T = bf.readLine();
            int num = Integer.parseInt(T);
            int nongroupNumber = 0;

            for (int k = 0; k < num; k++) {
                String S = bf.readLine();


                char C;

                case1:
                for (int i = 0; i < S.length() - 1; i++) {
                    if (S.charAt(i) != S.charAt(i + 1)) {
                        C = S.charAt(i + 1);
                        for (int j = 0; j < i + 1; j++) {
                            if (S.charAt(j) == C) {
                                nongroupNumber++;
                                break case1;
                            }
                        }
                    } else {
                        C = S.charAt(i);
                    }
                }
            }
            bw.write(String.valueOf(num - nongroupNumber));
            bw.flush();
            bw.close();
        } catch (IOException E) {
        }
    }
}
