import java.io.*;
public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.valueOf(arr[i]) > 0) {
                plus++;
            } else if (Integer.valueOf(arr[i]) < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        bw.write((float)plus / N + "\n" + (float) minus / N + "\n" + (float) zero / N);
        bw.flush();
        bw.close();
    }
}
