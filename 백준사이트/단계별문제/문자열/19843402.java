import java.util.*;

class Main{
    public static void main(String[]args){

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = scanner.next();

        for(int i=0; i<a; i++) {
            sum+=b.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}