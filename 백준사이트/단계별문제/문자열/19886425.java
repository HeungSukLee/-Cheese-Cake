import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        long result = phonNumber(S);

        int num = 0;
        long number = 0;
        int second = 0;

        while (true) {
            if (result - Math.pow(10, num) < 0) {
                break;
            }
            num++;
        }


        for (int i = 0; i < num ; i++) {
            number = result % 10;
            result = result / 10;

            if (number == 2)
                second = second + 3;
            if (number == 3)
                second = second + 4;
            if (number == 4)
                second = second + 5;
            if (number == 5)
                second = second + 6;
            if (number == 6)
                second = second + 7;
            if (number == 7)
                second = second + 8;
            if (number == 8)
                second = second + 9;
            if (number == 9)
                second = second + 10;
        }

        System.out.println(second);
    }

    static long phonNumber(String S) {
        long result = 0;
        long sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A' || S.charAt(i) == 'B' || S.charAt(i) == 'C') {
                result = 2 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'D' || S.charAt(i) == 'E' || S.charAt(i) == 'F') {
                result = 3 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'G' || S.charAt(i) == 'H' || S.charAt(i) == 'I') {
                result = 4 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'J' || S.charAt(i) == 'K' || S.charAt(i) == 'L') {
                result = 5 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'M' || S.charAt(i) == 'N' || S.charAt(i) == 'O') {
                result = 6 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'P' || S.charAt(i) == 'Q' || S.charAt(i) == 'R' || S.charAt(i) == 'S') {
                result = 7 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'T' || S.charAt(i) == 'U' || S.charAt(i) == 'V') {
                result = 8 * (long) Math.pow(10, (S.length() - i - 1));
            }
            if (S.charAt(i) == 'W' || S.charAt(i) == 'X' || S.charAt(i) == 'Y' || S.charAt(i) == 'Z') {
                result = 9 * (long) Math.pow(10, (S.length() - i - 1));
            }
            sum += result;
        }
        return sum;
    }
}
