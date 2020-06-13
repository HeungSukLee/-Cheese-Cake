import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int number = 0;
        String[] words = new String[100];
        words = S.split(" ");

        //System.out.println(words.length);
     
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                number++;
            }
        }

        System.out.println(number);
    }
}