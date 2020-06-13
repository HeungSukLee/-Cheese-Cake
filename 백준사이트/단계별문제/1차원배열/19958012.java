
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[9];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        int index=0;

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i + 1]) {
                int tmp = num[i];
                num[i]=num[i+1];
                num[i+1]=tmp;
                index= index;
            }else{
                index = i+1;
            }
        }
        System.out.println(num[num.length-1]);
        System.out.println(index+1);
    }
}