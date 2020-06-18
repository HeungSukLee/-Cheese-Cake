import java.io.*;
public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum1 = 0; int sum2 = 0;

        for(int i=0; i<N;i++){
            String[] arrN1 = br.readLine().split(" ");
            sum1 += Integer.parseInt(arrN1[i]);
            sum2 += Integer.parseInt(arrN1[N-1-i]);
        }

        bw.write(String.valueOf(Math.abs(sum1-sum2)));
        bw.flush();
        bw.close();
    }
}
