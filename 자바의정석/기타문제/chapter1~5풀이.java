//4
//1,5
//3
//1
//5번 value-65

/* 6번
class ArrayEx3{
    public static void main(String[] args) {


        int sum=0;
        for(int i=1; i<=100; i++){
            if(i%3==0) sum+=i;
        }
        System.out.println(sum);
    }
}
 */
/* 7번
class ArrayEx3{
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
*/
/* 8번
import java.util.Scanner;

class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int money;

        while (true) {
            PrintMenu();
            int N = scan.nextInt();

            if (N == 1) {
                System.out.print("예금액>");
                money = scan.nextInt();
                sum += money;
            }
            if (N == 2) {
                System.out.print("출금액>");
                money = scan.nextInt();
                sum -= money;
            }
            if (N == 3) {
                System.out.print("잔고>");
                System.out.println(sum);
            }
            if (N == 4) {
                System.out.println("프로그램 종료");
                System.exit(0);
            }
        }
    }

    static void PrintMenu() {
        System.out.println("------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("------------------------------");
        System.out.print("선택> ");

    }
}
*/

// 9번 3
//10번 3,  5

class ArrayEx3{
    public static void main(String[] args) {

        byte byteValue = 10;
        float floutValue = 2.5f;
        double doubleValue = 2.5;
        double result = 4 + doubleValue;
    }
}