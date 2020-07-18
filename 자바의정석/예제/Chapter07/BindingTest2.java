class BindingTest2 {
    public static void main(String[] args) {
        Parent4 p = new Child4(); // child에 메서드가 정의되어 있지 않으므로 부모 method를 가져온다.
        Child4  c = new Child4();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child4 extends Parent4 { }