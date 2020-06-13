
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(bf.readLine());

            int num = 0;
            for (int i = 1; i < N + 1; i++) {

                case1:
                if (i < 100) {
                    num = num + 1;
                } else {
                    int b = i;
                    while (b >= 100) {
                        if (minus(b) != minus(b / 10)) {
                            break case1;
                        }
                        b = b / 10;
                    }
                    num = num + 1;
                }
            }
            bw.write(String.valueOf(num));
            bw.flush();
            bw.close();
        }catch(IOException e){
        }
    }

    static int minus(int num) {
        int a = num;
        int b = num;
        int tmp;

        a = b % 10;
        tmp = a;

        b = b / 10;
        a = b % 10;
        tmp = tmp - a;
        return tmp;
    }
}
