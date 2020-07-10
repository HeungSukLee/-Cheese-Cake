class MyMathTest {
    public static void main(String args[]) {

        MyMath mm = new MyMath(); //객체를 생성하고 객체에 선언이 되어있는 함수를 사용하는 example이다.
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        System.out.println("add(5L, 3L) = "      + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = "   + result4);
    }
}

class MyMath {//MyMath 객체에는 더하기 빼기 곱하기 나누기 함수가 정의되어 있다.
    long add(long a, long b) {
        long result = a+b;
        return result;
        //	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }
    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
