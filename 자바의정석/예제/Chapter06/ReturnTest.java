class ReturnTest {
    // 자신이 속해있는 객체를 사용하는 example
    public static void main(String[] args) {

        ReturnTest r = new ReturnTest();
        int result = r.add(3,5); // 자신에 선언되어있는 함수를 사용

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b+1;
    }
}