import java.io.*;

public class Main {
    static int[] counter = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        tree(N, 0);
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                bw.write(String.valueOf(i));
                break;
            }
        }
        bw.flush();
        bw.close();
    }

    static void tree(int N, int cnt) {
        if (N == 1) {
            counter[cnt] = 1;
        }
        if (N % 3 == 0) {
            tree(N / 3, ++cnt);
            --cnt;
        }
        if (N % 2 == 0) {
            tree(N / 2, ++cnt);
            --cnt;
        }
        if (N > 3) {
            tree(N - 1, ++cnt);
            --cnt;
        }
    }
}


