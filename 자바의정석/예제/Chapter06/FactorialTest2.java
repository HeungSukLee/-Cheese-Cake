class FactorialTest2 {
    static long factorial(int n) {
        if (n <= 0 || n > 20) return -1;  // -1을 반환함으로써, main함수에서 -1을 받았을 때 유효하지 않은 값임을 확인 할 수 있다.
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String args[]) {
        int n = 21;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);

            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", n);
                break;
            }
            System.out.printf("%2d!=%20d%n", i, result);
        }
    } // main의 끝
}