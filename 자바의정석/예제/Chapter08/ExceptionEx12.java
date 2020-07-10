class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();     // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
    }    // main메서드의 끝

    static void method1() throws Exception { //throws는 자기를 호출한 함수에게 예외의 가능성을 말해주는것이다.
        method2();
    }    // method1의 끝

    static void method2() throws Exception {
        throw new Exception();
    }    // method2의 끝

}