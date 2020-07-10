class Data {
    int x;
} //x만을 가지는 Data생성.

class PrimitiveParamEx {

    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); // d.x = 10;

        change(d.x);
        System.out.println("After change(d.x)"); //change함수 안에 선언이 되어있는 x의 값이 1000으로 바뀌는 것이므로
        //main 함수의 d.x의 값은 변하지 않는다.//다른 메모리 공간.

        System.out.println("main() : x = " + d.x); //10
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
