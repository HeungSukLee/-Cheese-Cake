class ReturnTest { // main함수에서 자신이 속해있는 객체를 사용하는 example
    public static void main(String[] args) {

        ReturnTest r = new ReturnTest(); // 객체 ReturnTest 생성. (자기 자신이 속해있는 객체)

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
        r.add(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
        // 함수에서 result[0]이 바뀌면 본문에서도 바뀐다.
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b+1;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
    }
}