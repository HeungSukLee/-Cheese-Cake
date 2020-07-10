class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);// change에 참조형값을 넘겨준다.
        //change함수에서 d를 넘겨받으면 이는 주소값을 넘겨받는거라
        // d.x를 바꾸면 main함수의 값도 바뀐다.

        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

    }
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}