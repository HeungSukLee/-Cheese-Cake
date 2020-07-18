class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }//main->first함수 ->second함수 , 종료 -> first함수종료

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}