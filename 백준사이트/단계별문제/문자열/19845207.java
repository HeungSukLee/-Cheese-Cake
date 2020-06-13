import java.util.*;

class Main {
    public static void main(String[] rgs) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for (int k = 0; k < T; k++) {

            String result = "";
            int R = scanner.nextInt();
            String S = scanner.nextLine();

            for (int j = 0; j < S.length(); j++) {
                for (int i = 0; i < R; i++) {
                    result+=S.charAt(j);
                }
            }
            result = result.replace(" ","");
            System.out.println(result);
        }
    }
}