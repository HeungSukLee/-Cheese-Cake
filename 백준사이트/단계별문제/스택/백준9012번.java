import java.io.*;

public class Mainn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            System.out.println(VPS(a));
        }
    }
    static String VPS(String a) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                num1++;
            } else {
                num2++;
            }
            if (num2 > num1) {
                return "YES";
            }
        }
        if (num1 != num2) {
            return "NO";
        } else {
            return "YES";
        }
    }
}