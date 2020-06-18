import java.io.*;
public class CompareTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arrN1 = br.readLine().split(" ");
        String[] arrN2 = br.readLine().split(" ");
        int score[] = new int[2];

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(arrN1[i]) > Integer.parseInt(arrN2[i])) {
                score[0]++;
            } else if (Integer.parseInt(arrN1[i]) < Integer.parseInt(arrN2[i])) {
                score[1]++;
            }
        }

        bw.write(score[0] + " " + score[1]);
        bw.flush();
        bw.close();
    }


}
