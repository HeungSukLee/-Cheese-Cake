class ReferenceParamEx2 {
// 배열 역시 참조형을 매개변수로 넘겨주기때문에,
    //함수에서 바꾸면 main함수에서도 바뀐다.
    public static void main(String[] args)
    {
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) { // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}