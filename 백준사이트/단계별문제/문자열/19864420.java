import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = backCalculator(a);
        b = backCalculator(b);

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    static int backCalculator(int a)
    {
        int result = a%10*100 + (a/10)%10*10 + a/100*1;
        return result;
    }
}
