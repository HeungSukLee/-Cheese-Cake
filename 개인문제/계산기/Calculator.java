import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Operator op = new Operator();   // 연산자를 입력하는 클래스
        Number num = new Number();     // 숫자를 입력하는 클래스
        double[] result = new double[50];      // 계산 결과를 차례로 저장하는 배열

        int k = 0;
        double a = 0.0, b = 0.0;
        int operator;

        result[0] = num.getIn(); //첫번째 숫자를 입력받고 result[0] 에 입력 //3


        while (true) {
            operator = op.getIn();               //연산자를 입력받음 //3+
            if (operator == 5) {
                System.out.println(result[k]);   //이 연산자가 "=" 이면 result[]값 출력
                break;
            }

            a = num.getIn();                       // 숫자를 입력받음//3+5

            switch (operator) {//3+5값을 result[]에 입력
                case 1:
                    result[++k] = result[--k] + a;
                    break;
                case 2:
                    result[++k] = result[--k] - a;
                    break;
                case 3:
                    result[++k] = result[--k] * a;
                    break;
                case 4:
                    result[++k] = result[--k] / a;
                    break;
                case 5:
                    break;
            }
            ++k;
        }
    }
}

class Operator {
    static int counter1 = 0;
    static int[] inOper = new int[100];

    public int getIn() {
        System.out.println("연산을 고르세요 : ");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
        System.out.println("5. = ");
        Scanner scanner = new Scanner(System.in);
 nt input = scanner.nextInt();
        inOper[counter1++] = input;
        return input;
    }
}
class Number {
    static int counter2 = 0;
    static double[] inNum = new double[100];

    public double getIn() {
        System.out.println("계산 할 숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        inNum[counter2++] = input;
        return input;
    }

}
