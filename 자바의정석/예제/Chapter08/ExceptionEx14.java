//함수에서 발생시킨 exception을  main에서 처리함.
class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();// 처리한 e의 정보를 얻는다.
        }
    }    // main메서드의 끝

    static void method1() throws Exception {
        throw new Exception();
    }    // method1()의 끝
} // class의 끝