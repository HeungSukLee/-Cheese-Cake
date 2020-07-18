class Data {
    int x;
}

class PrimitiveParamEx {

    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); // d.x = 10;

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); //10
        //x와 d.x는 서로 다른 메모리 공간.
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
