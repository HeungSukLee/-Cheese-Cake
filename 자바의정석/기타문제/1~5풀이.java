//4
//1,5
//3
//1
//5번 value-65

/* 6번
import java.util.*;
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
import java.util.*;
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
/* 11번
import java.util.*;
class Pract{
    public static void main(String[] args) {

       int max=0;
       int[] array ={1,5,3,8,2};

       for(int i=0; i<array.length;i++){
           if(array[i]>max){
               max=array[i];
           }
       }

       System.out.println("max: "+max);
    }
}

 */
/*12번
import java.util.*;
class Pract{
    public static void main(String[] args) {

        int[][] array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum= 0;
        int count=0;
        double avg=0.0;

        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sum+=array[i][j];
                count++;
            }
        }
        avg = (double)sum/count;

        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);

    }
}
 */
/*
import java.util.*;

class Pract {
    public static void main(String[] args) {

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                studentNum += scanner.nextInt();
                scores = new int[studentNum];

            } else if (selectNo == 2) {
                for (int i = 0; i < studentNum; i++) {
                    scores[i] = scanner.nextInt();
                }

            } else if (selectNo == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.println(scores[i]);
                }

            } else if (selectNo == 4) {
                int sum = 0;
                Arrays.sort(scores);
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                }

                System.out.println("최고점수: " + scores[scores.length - 1]);
                System.out.println("평균점수: " + sum / scores.length);

            } else if (selectNo == 5) {
                break;
            }
        }

        System.out.print("프로그램종료 ");
    }
}
*/