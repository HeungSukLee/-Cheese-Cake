import java.util.*;

class Main {
    public static void main(String[] rgs) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        S = S.toUpperCase();

        int max = 0;
        char Max = ' ';

        int[] array = new int[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        for (int i = 0; i < S.length(); i++) {
            ++array[S.charAt(i) - 'A'];
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            } else {
                max = i + 1;
            }
        }


        case1: for (int i = 0; i < array.length - 1; i++) {
            if (array[array.length - 1] == array[i]) {
                Max = '?';
                break case1;
            } else {
                Max = (char) (max + 'A');
            }
        }

        System.out.println(Max);
    }
}
