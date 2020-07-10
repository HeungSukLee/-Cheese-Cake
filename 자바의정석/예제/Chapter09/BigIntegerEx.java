//가장큰 정수형 타입인 long으로 표현 할 수 있는 값은 10진수로 19자리정도
//내부적으로는 int 배열을 사용하여 값을 다룬다.
import java.math.*;

class BigIntegerEx {
    public static void main(String[] args) throws Exception {
//		BigInteger big =  BigInteger.ONE;

        for(int i=1; i<100;i++) {
            System.out.printf("%d!=%s%n", i, calcFactorial(i)); //calcFactorial - >String함수
            Thread.sleep(300); //시간을 준다
        }
    }

    static String calcFactorial(int n) { //n이들어오면 n을 biginteger로 바꾸고 계산, 계산한 값을 toString으로!
        //factorial->BigInteger형으로 BigInteger형을 return
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {  // return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE))); // n * factorial(n-1)
        }
    }
}